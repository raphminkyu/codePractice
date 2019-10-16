package Kattis.Contest;

import java.util.Arrays;
import java.util.Scanner;

public class Gerry {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String numString = sc.nextLine();
		int[] intArray = Arrays.stream(numString.split(" "))
		        .mapToInt(Integer::parseInt)
		        .toArray();
		
		
		int[][] dim = new int[intArray[0]][3];
		
		for(int i =0; i<intArray[0]; i++) {
			String line = sc.nextLine();
			
			int[] intaRR = Arrays.stream(line.split(" "))
			        .mapToInt(Integer::parseInt)
			        .toArray();
			
			dim[i][0] = intaRR[0];
			dim[i][1] = intaRR[1];
			dim[i][2] = intaRR[2];

		}
		
		//int[][] results = new int[intArray[1]][3];
		

		
		int[][] addArr = addArr(dim, intArray[1]);
		

	
		
		String[][]giveResult = giveResult(addArr);
		
		
		
		for(String[] z: giveResult) {
			System.out.println(z[0] + " " + z[1] + " " + z[2]);
			
		}
		
	
		System.out.println(efficiencyGap(giveResult, dim));
		
	}
	public static String[][] giveResult(int[][] addArr) {
		String[][] results = new String[addArr.length][3];
		
		for(int i = 0; i< addArr.length; i++) {
		
			int winning = (addArr[i][1] + addArr[i][2]) / 2  + 1; 
			
			
			if(addArr[i][1] > addArr[i][2]) {
				results[i][0] = "A";
				int wastedA = Math.abs(addArr[i][1] - winning);
				results[i][1] = String.valueOf(wastedA);
				results[i][2] = String.valueOf(addArr[i][2]);
				
			}else {
				results[i][0] = "B";
				int wastedB = Math.abs(addArr[i][2] - winning);
				results[i][2] = String.valueOf(wastedB);
				results[i][1] = String.valueOf(addArr[i][1]);
			}
			
		}
		return results;
		
	}
	
	public static double efficiencyGap(String[][] results, int[][] dim) {
		double numA = 0;
		double numB = 0;
		for (int i = 0; i < results.length; i++) {
			numA = Double.parseDouble(results[i][1]) + numA;
			numB = Double.parseDouble(results[i][2]) + numB;
		}
		double total = 0;
		for (int i = 0; i < dim.length; i++) {
			total += dim[i][1] + dim[i][2];
		}
		return Math.abs(numA-numB)/ total;
	}
	
	
	public static int[][] addArr(int[][] dim, int length){
		int[][] results = new int[length][3];

		for(int i = 0; i< dim.length; i++) {
			
			results[ dim[i][0] -1 ][1] +=  dim[i][1];
			results[ dim[i][0] -1 ][2] +=  dim[i][2];
			
			
		}
		return results;
}
	}
