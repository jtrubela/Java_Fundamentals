/*
//----------------------------------------------------------------------------------/
//File Name: Pascal Triangle.java   		  			Author: Justin Trubela		/			
//Section: 03											  						    / 
//																				    /
//Purpose:  Did not show output on MPL but works fine in eclipse/jGRASP					/
// 	Pascal's Triangle is a triangular array in which every number represents the	/
// 	sum of the two numbers directly above it. The pattern starts with two rows of	/
// 	ones. Here is Pascal's Triangle up to the 5th row:								/
//																				    /
//		 1																			/
//		 1 1																		/
//		 1 2 1																		/
//		 1 3 3 1																	/
//		 1 4 6 4 1																	/
//		 1 5 10 10 5 1																/
//																				    /
//	Design and implement a recursive program to determine and print the nth line	/
//	of Pascal's Triangle. Your program should take an integer n as input and 		/
//	return the nth line of Pascal's triangle (consider the topmost line the "0th"	/
//	line).																			/
//																				    /
//	(Hint: use an array to store the values on each line)							/
//----------------------------------------------------------------------------------/
 */

import java.util.Scanner;
import java.util.Arrays;

public class PascalTriangle {
	
	public static int[] makeRow(int row) {
		if (row == 0) {
			int[] row1 = new int[1];
			row1[0] = 1;
			return row1;
		}

		else {
			
			int[] lastRow = makeRow(row - 1);
			int[] thisRow = newRow(lastRow);

			return thisRow;
		}
	}

	public static int[] newRow(int[] lastRow) {
		int[] newRow = new int[lastRow.length + 1];

		newRow[0] = 1;
		newRow[lastRow.length] = 1;

		for (int i = 1; i < lastRow.length; i++) {
			newRow[i] = lastRow[i - 1] + lastRow[i];
		}

		return newRow;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter line of Pascal's Triangle to print: ");
		int row = scan.nextInt();
		
		String line = Arrays.toString(makeRow(row));
		
		
		char[] array = line.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==',' || array[i]=='[' || array[i]==']') {
				continue;
			}
			else {
			System.out.print(array[i]);
			}
		}
		
		
		scan.close();
	}
}