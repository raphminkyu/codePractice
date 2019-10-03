package practice;

import java.util.Scanner;

public class DRM{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println(DRM(x));
		
	}
	
	public static String DRM(String s) {
		int mid = s.length()/2;
		String[] part = {s.substring(0, mid).toLowerCase(), 
				s.substring(mid).toLowerCase()};
		
		int[][] digit = new int[2][part[0].length()];
		int[] sum = new int[2];
		
		for(int x = 0; x<2; ++x) {
			for(int i = 0; i < part[0].length(); ++i) {
				int position = part[x].charAt(i) - 'a';
				digit[x][i] = position;
				sum[x] += position; 
				}
			
			

						
			for(int i = 0; i<part[0].length(); ++i) {
				digit[x][i] +=sum[x];
			
				while(digit[x][i]>=26) {
					
					digit[x][i] -= 26;
				}
				
			}
			
		}
		String x = "";
		for(int i = 0; i<part[0].length(); i++) {
			digit[0][i] += digit[1][i];
			if(digit[0][i] >25) {
				digit[0][i] -=26;
			}
			x+= Character.toString((char) (digit[0][i] + 65));
			
		}
		

		
		return x;
		
	}
	
	
}
