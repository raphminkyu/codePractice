package practice;

import java.util.*;

public class FourThought1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = hash();
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		//int line = sc.nextInt();
		int line = 257;
		
		for(int i = 0; i<line; i++) {
			//int aaa = sc.nextInt();
			int aaa = i;
			System.out.println(aaa);
			if(hm.containsKey(aaa)) {
				
				System.out.println(hm.get(aaa) + " = " + aaa);
			}else {
				System.out.println("no solution");
			}
			System.out.println();
		}
		
		sc.close();
		
	
	
		
	}
	
	public static void checkSol() {
		
	}
	
 private static String[] makeCase() {
		 
	 
		 String[] operator = {"+", "-", "*", "/"};
		 int count =0;
		 
		 String[] stringList = new String[64];
		 
		 for(String x : operator) {
			 for(String y: operator) {
				 for( String z: operator) {
				
					String temp = String.format("4 %s 4 %s 4 %s 4", z, y, x);
					stringList[count] = temp;
					
					count ++;
					
				 }
			 }
		 }
		 
		 
		 return stringList;
	 }
 
 	private static HashMap<Integer, String> hash() {
 		
 		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
 
 		String[] cases = makeCase();
 		
 		for(int i = 0; i< cases.length; i++) {
 			
 			String[] word = cases[i].split(" ");
 			String[] operator = new String[3];
 			
 	 		operator[0] = word[1];
 	 		operator[1] = word[3];
 	 		operator[2] = word[5];
 	 		
 	 		double value = recursiveCal(operator,"", 0, 0, 4);
 	 		
 	 		if(value >=0 && value % 1 == 0) {
 	 			
 	 			hm.put((int) value, cases[i]);
 	 			
 	 			
 	 		}
 		}
 		
 		
 		
 		
 		
 		return hm;
 		
 	}
 	
 	private static double recursiveCal(String[] operator, String previousOP, int count, int current, int onHold) {
 		
 		if(count > operator.length-1) {
			
			if(previousOP.equals("+")){
					return current+onHold;
				}else if(previousOP.equals("-")){
					return current-onHold;
				}else {
					return current+onHold;
				}
			
			
 		}
 		else {
 			if(operator[count].equals("+") || operator[count].equals("-")) {
 				if(operator[count].equals("+")) {
 					
 					if(previousOP.equals("+")){
 						return recursiveCal(operator, "+", count+1, current+onHold, 4);
 					}else if(previousOP.equals("-")){
 						return recursiveCal(operator, "+", count+1, current-onHold, 4);
 					}else {
 						return recursiveCal(operator, "+", count+1, current+onHold, 4);
 					}
 					
 				}else {
 					
 					if(previousOP.equals("+")){
 						return recursiveCal(operator, "-", count+1, current+onHold, 4);
 					}else if(previousOP.equals("-")){
 						return recursiveCal(operator, "-", count+1, current-onHold, 4);
 					}else {
 						return recursiveCal(operator, "-", count+1, current+onHold, 4);
 					}
 				}
 		
 			}else {
 				if(operator[count].equals("*")) {
 					
 				
 					return recursiveCal(operator, previousOP, count+1, current, onHold*4);
 				}else {
// 					System.out.println(4);
// 					System.out.println("count:" + count);
// 					System.out.println("operator:" + operator[count]);
// 					System.out.println("current:" + current);
// 					System.out.println("prev:"+previousOP);
// 					System.out.println("onHold:" + onHold);
// 					System.out.println("");
 					return recursiveCal(operator, previousOP, count+1, current, onHold/4);
 					
 				
 			}
	
 		}
 	}
	
 	}
 	
 	
 	
// 	@Test
// 	public void testCase1() {
// 		String check = "4 + 4 / 4 - 4";
// 		
// 		String[] operator = new String[3];
// 		
// 		String[] word = check.split(" ");
// 		
// 		operator[0] = word[1];
// 		operator[1] = word[3];
// 		operator[2] = word[5];
//
//
// 		assertEquals(1,recursiveCal(operator,"", 0, 0, 4), 0.001);
// 		
// 		
// 	}
// 	
// 	@Test
//	public void testCase2() {
// 		String check = "4 + 4 + 4 * 4";
// 		
// 		String[] operator = new String[3];
// 		
// 		String[] word = check.split(" ");
// 		
// 		operator[0] = word[1];
// 		operator[1] = word[3];
// 		operator[2] = word[5];
// 		
//
// 		assertEquals(24,recursiveCal(operator, "", 0, 0, 4), 0.001);
// 	}
// 	
// 	@Test
//	public void testCase3() {
// 		String check = "4 * 4 - 4 * 4";
// 		
// 		String[] operator = new String[3];
// 		
// 		String[] word = check.split(" ");
// 		
// 		operator[0] = word[1];
// 		operator[1] = word[3];
// 		operator[2] = word[5];
// 		
//
// 		assertEquals(0,recursiveCal(operator, "", 0, 0, 4), 0.001);
// 	}
// 	
// 	@Test
//	public void testCase4() {
// 		String check = "4 / 4 + 4 * 4";
// 		
// 		String[] operator = new String[3];
// 		
// 		String[] word = check.split(" ");
// 		
// 		operator[0] = word[1];
// 		operator[1] = word[3];
// 		operator[2] = word[5];
// 		
//
// 		assertEquals(17,recursiveCal(operator, "", 0, 0, 4), 0.001);
// 	}
// 	
// 	@Test
//	public void testCase5() {
// 		String check = "4 * 4 * 4 * 4";
// 		
// 		String[] operator = new String[3];
// 		
// 		String[] word = check.split(" ");
// 		
// 		operator[0] = word[1];
// 		operator[1] = word[3];
// 		operator[2] = word[5];
// 		
//
// 		assertEquals(256,recursiveCal(operator, "", 0, 0, 4), 0.001);
// 	}
 	
 }






