package Kattis.Contest;

import java.util.Scanner;

public class MissingNumbers {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		
		int[] given = new int[length];
		
		
		
		for(int i=0; i < given.length; i++) {
			
			given[i] = sc.nextInt();
		}
		
		
		int max = given[given.length-1];
		
		int[] arr = arr(max);
		
		compare(given, arr);
	
		
		
	}
	
	public static int[] arr(int max){
		int[] arr = new int[max];
		
		for(int i=1; i<=max; i++) {
			
			arr[i-1] = i;
			
			
		}
		
		return arr;
		
	}
	
	public static void compare(int[] shorter, int[] given) {
		
		if(shorter.length == given.length) {
			System.out.println("good job");
		}
		else {
			
			int i =0;
			int j = 0;
			
			
				
				while(i < shorter.length && j < given.length) {
					
					
					if (shorter[i] == given[j]) {
						i++;
						j++;
					}
					else {
						System.out.println(given[j]);
						
						j++;
						
					}
				}
				
				
				
			}
		}
	
		
	
}
