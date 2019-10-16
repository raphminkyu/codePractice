package Kattis.Contest;

import java.util.Arrays;
import java.util.Scanner;

public class slowLeak {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//home
		int m = sc.nextInt();//roads
		int t = sc.nextInt(); //repair station
		int d = sc.nextInt();//distance for tire
		
		String interString = sc.nextLine();
		
		
		//bike
		int[] bikeStops = Arrays.stream(interString.split(" "))
		        .mapToInt(Integer::parseInt)
		        .toArray();
		
		int[][] coord = new int[m][];
		
		for(int i =0; i<m; i++) {
		
			String temp = sc.nextLine();
			
			int[] tempInt = Arrays.stream(temp.split(" "))
			        .mapToInt(Integer::parseInt)
			        .toArray();
			
			for(int j =0; j< 3; j++) {
				coord[i][j] = tempInt[i];
			}
			
			if() {
				
			}
			
			coord[i][4] = ;
			
			
		}
		
		
		
	}
	
	public static String compareCoord(int[][] coord, int total, int[] bikeStops, int distanceLeft) {
		int row = 0;
		if () {
			return distance;
		}
		else {
			if (distanceLeft > 0) {
				compareCoord(int[][] coord, int distanceLeft - distance, int[] bikeStops, int distanceLeft);
			}
			if (coord[row][3] > distanceLeft || row != bikeStops[])
		}
	}
}
