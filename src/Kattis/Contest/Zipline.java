package Kattis.Contest;

import java.util.Arrays;
import java.util.Scanner;

public class Zipline {
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String numString = sc.nextLine();
		
		int num= Integer.valueOf(numString);
		
		
		
		for(int i =0; i<num; i++) {
			String line = sc.nextLine();
			int[] intArray = Arrays.stream(line.split(" "))
			        .mapToInt(Integer::parseInt)
			        .toArray();
			
			cal(intArray[0], intArray[1], intArray[2], intArray[3]);
			
		}
		
	}
	
	public static void cal(int w, int g, int h, int r) {
		double min = w;
		double max = 0;
		
		
		double cable1 = 0;
		double cable2 = 0;

		
		for(int i = 0; i<w; i++) {
			cable1 = Math.sqrt((g-r)*(g-r) + (i)*(i));
			cable2 = Math.sqrt((h-r)*(h-r) + (w-i)*(w-i));		
			
			double total = cable1 + cable2;
			
			if(total >= max) {
				max = total;
			}
			if(total < min) {
				min = total;
			}
			
			
		}
		
		System.out.print(min + " " + max);
		
		
	}
	
	
	
	
}
