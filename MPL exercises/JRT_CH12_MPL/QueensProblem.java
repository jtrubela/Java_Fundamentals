/*
//----------------------------------------------------------------------------------/
//File Name: QueensProblem.java   		  			Author: Justin Trubela		    /			
//Section: 03											  						    / 
//																				    /
//Purpose:  Did not show output on MPL but works fine in eclipse					/
//																					/
// MPL 70232 QueensProblem - AttackingQueens										/
// * Design and implement a recursive program that solves the Non-Attacking Queens	/ 
// problem. That is, write a program to determine all ways in which eight queens	/
// can be positioned on an eight-by-eight chessboard so that none of them are in the/
// same row, column, or diagonal as any other queen. There are no other chess pieces/
// on the board.																	/
//																					/
// Store your solutions in an array of strings, giving them the format:				/
//																					/
//	. . . . q . . . 																/
//	. q . . . . . . 																/
//	. . . q . . . . 																/
//	. . . . . . q . 																/
//	. . q . . . . . 																/
//	. . . . . . . q 																/
//	. . . . . q . . 																/
//	q . . . . . . . 																/
// 																					/
// Where "." represents a space with no queen and "q" represents a space with 		/
// a queen (there is a space between each set of adjacent characters).				/
//																					/
// Sort the array, and then print every solution in order, putting a line of 		/
// whitespace in between them. 														/
// 																					/
//													  							 	/				 				  								  
//----------------------------------------------------------------------------------/
 */

public class QueensProblem {
	//initialize queen array placement dimension size
	int[] boxes;
	
	// size of array
	public QueensProblem() {
		boxes = new int[8];
	}
	//determine if placement of queen is true or false
	boolean putQueen(int queens, int column) {
		for (int i = 0; i < queens; i++) {
			if (boxes[i] == column) {
				return false;
			}
			if (Math.abs(boxes[i] - column) == Math.abs(i - queens)) {
				return false;
			}
		}
		return true;
	}
	//place the queen in the correct place
	public void correctRow(int numQueens) {
		for (int column = 0; column < 8; column++) {
			if (putQueen(numQueens, column)) {
				boxes[numQueens] = column;
				if (numQueens + 1 >= 8) {
					solve();
				} 
				else {
					correctRow(numQueens + 1);
				}
			}
		}
	}
	
	//print the correct row regarding the queen
	public void print() {
		correctRow(0);
	}
	
	//solve the chessboard
	public void solve() {
		int column;
		for (int row = 0; row < 8; row++) {
			for (column = 0; column < 8; column++) {
				if (boxes[row] == column) {
					System.out.print(" q");
				}
				else {
					System.out.print(" .");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//driver
	public static void main(String[] args) {
		new QueensProblem().print();
	}

}