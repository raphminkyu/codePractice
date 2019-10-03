package practice;

import java.util.Scanner;

public class Apaxian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name(name, 0, ""));
		
	}
	
	
	public static String name(String s, int start, String returnString) {
		if(start>=s.length()) {
			return returnString;
			
		
		}else if(start == s.length()-1) {

			returnString = returnString + String.valueOf(s.charAt(start));
			return name(s, start+1, returnString);
		}
		else{
			String next = String.valueOf(s.charAt(start+1));
			//String next = name(s, start+1, returnString);
			if(String.valueOf(s.charAt(start)).equals(next)) {
				
				return  name(s, start+1, returnString);
			}
			else {
				returnString = returnString + String.valueOf(s.charAt(start));
				return  name(s, start+1, returnString);
			}
		}
		
	}
}
