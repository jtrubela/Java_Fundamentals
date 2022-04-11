//********************************************************************************/
//File Name: sumOfN.java   		  			Author: Justin Trubela			  	  /			
//Section: 03											  						  / 
//																				  /
//Purpose:  Write a program using recursion. The program asks the user to input   /
//an integer n and calculates the sum of n recursively in 20 or less lines or code/				 				  								  
//********************************************************************************/
import java.util.Scanner;														//1
public class sumOfN{															//2
	public static void main(String[] args) {									//3
		Scanner scan = new Scanner(System.in);									//4
		System.out.println("Enter a number: ");									//5
		int n = scan.nextInt();													//6
																				//7
		System.out.print(n + " from 1 to " + n + " recursively is: " + sum(n));	//8
		scan.close();															//9
		}																	    //10
	public static int sum(int n) {  											//11
		if (n==1) { 															//12
			return 1; 															//13
		}    																	//14
		else { 																	//15
			return n + sum(n-1); 												//16
			}   																//17
		}																		//18
	}																			//19