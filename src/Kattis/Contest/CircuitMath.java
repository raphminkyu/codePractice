package Kattis.Contest;

import java.util.*;
import java.util.Map.Entry;

public class CircuitMath {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String numString = sc.nextLine();
		
		int num= Integer.valueOf(numString);
		
		String boolTemp = sc.nextLine();
		
	
		String[] boolString = boolTemp.split(" ");
		
		
		boolean[] bool = new boolean[boolString.length];
		
		for (int index = 0; index < boolString.length; index++) {
			if(boolString[index].equals("T")) {
				bool[index] = true;
			}else {
	
				bool[index] = false;
			}
		}
		
		
	
		
		String opTemp = sc.nextLine();
		String[] operation = opTemp.split(" ");
		
		
		
		
		
		
		
		char[] charThis= makeChar(boolString.length);
		
		
		
		
		
		
		HashMap<Character, Boolean> hash = makeHash(charThis, bool);
		

	
		
		String[] stringThis = convert(hash, operation);
		
		
		boolean finallyPlz = compare(stringThis);
		if(finallyPlz) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
	
		
		
	
		
	}
	
	public static char[] makeChar(int length) {
		
		char[] ans = new char[length];
		for(int i=65; i< 65 + length; i++) {
			
			
			char c = (char) i;
			ans[i - 65] = c;
			

		}
		
		return ans;
		
	}
	
	public static HashMap<Character, Boolean> makeHash(char[] charArr, boolean[] boolArr){
		HashMap<Character, Boolean> ans = new HashMap<Character, Boolean>();
		for(int i =0; i<charArr.length; i++) {
			ans.put(charArr[i], boolArr[i]);
		}
		
		return ans;	
	}
	
	public static String[] convert(HashMap<Character, Boolean> hash, String[] operations) {
		
		for(int i = 0; i<operations.length; i++) {
			
			if(!operations[i].equals("*") && !operations[i].equals("+") && !operations[i].equals("-" )) {
			
				
				char tempChar = operations[i].charAt(0);

				
				String temp = String.valueOf(hash.get(tempChar));
				
				
			
				
				operations[i] = temp;
				
				
			}
				
			
		}
		return operations;
		
	}
	


	public static boolean compare(String[] operations) {
		
		ArrayList<Boolean> arrList = new ArrayList<Boolean>();
		
		
		for(int i = 0; i< operations.length;i++) {
			if( operations[i].equals("true") || operations[i].equals("false")) {
				Boolean.parseBoolean(operations[i]);
				arrList.add(Boolean.parseBoolean(operations[i]));

			}
			else if(operations[i].equals("-")){
				arrList.set(arrList.size()-1, !arrList.get(arrList.size()-1));

					
				}
			else if(operations[i].equals("+")) {
				boolean x = arrList.get(arrList.size()-1);
				boolean y = arrList.get(arrList.size()-2);
				//arrList.remove(arrList.get(x));
				//arrList.remove(arrList.get(y));
				arrList.remove(arrList.size()-1);
				arrList.remove(arrList.size()-1);
				arrList.add(x||y);
			}
			else if(operations[i].equals("*")) {
				boolean x = arrList.get(arrList.size()-1);
				boolean y = arrList.get(arrList.size()-2);
				arrList.remove(arrList.size()-1);
				arrList.remove(arrList.size()-1);	
				arrList.add(x&&y);
			}
		}
		return arrList.get(arrList.size()-1);
		
		
	}
}
