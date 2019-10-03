package practice;


import java.util.Scanner;
 

public class FourThought {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int line = sc.nextInt();
		//int[] aa = new int[line];
		
		for(int i = 0; i<line; i++) {
			int aaa = sc.nextInt();
			
		//	aa[i] = aaa;
			System.out.println(thought(Integer.valueOf(aaa)));
		}


		
	}
	public static String thought(int result) {
		
		int first = result;
		int second =0;
		int x = 0;
		String sol = "";
		
		if(result == 256) {
			return ("4 * 4 * 4 * 4 = 256");
			
		}
		else if(first ==0){
			return ("4 - 4 + 4 - 4 = 0");
			
		}
		else if(result == 68) {
			return "4 * 4 * 4 + 4 = 68";
		}
		else if(result == 60) {
			return "4 * 4 * 4 - 4 = 60";
		}
		
		
		else {
			boolean check = (!(powerOf2(first) && powerOf2(second)));
			String operate = " + ";

			while(check && first>0) {
			first -=1;
			second +=1;
			check = !(powerOf2(first) && powerOf2(second));
			}
			
			if(check) {
				operate = " - ";
				first = result;
				second = 0;
			}
			
			
			while(check && first<=100 ) {
				first +=1;
				second+=1;
				check = !(powerOf2(first) && powerOf2(second));
			}
			
		
		
			if(!check) {
				int firstExpo = (int) Math.round(Math.log(first)/Math.log(2));
				int secondExpo = (int) Math.round(Math.log(second)/Math.log(2));
	
		
//				if(firstExpo ==6){
//					operate = " * ";
//				}
				
				 if((check(firstExpo).equals("error") ||
						 check(secondExpo).equals("error")) ) {
					 ///System.out.println(secondExpo);
					 return "no solution";
				 }else {
					
					 return (check(firstExpo) + operate + check(secondExpo) + " = " + result);
				 }
				 
				 
			}else {
				return "no solution";
			}

		}
	
		
	}
	
	 private static boolean powerOf2(int number){
		 return (number > 0) && ((number & (number - 1)) == 0);
	 }
	 
	 private static String check(int i) {

		 
			 if(i ==0) {
			
				 return "4 / 4";
			 }
			 else if(i==2) {
				 return "4 + 4";
			 }
			 else if(i == 3) {
			
				 return "4 + 4";
			 }
			 else if(i == 4) {
			
				 return "4 * 4";
			 }
			 else if(i == 6) {
				 return "4 * 4";
			 }
			 else {
				 return "error";
			 }
		 
	 }
	
}
