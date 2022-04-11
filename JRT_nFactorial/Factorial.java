// *******************************************************************************/
// File Name: Factorial.java   		  			Author: Justin Trubela			  /			
// Section: 03											  						  / 
//																				  /
// Purpose:   	   							 									  /
//		Write a program using recursion. 										  /
//	The program asks the user to input an integer N and calculates and prints N!  /					 				  								  
//********************************************************************************/

import java.util.Scanner;

public class Factorial{

	public static void main(String[] args) {
		long number,factorial;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = scan.nextLong();
		
		factorial = factorial(number);
		System.out.print(number + "!" + " is " + factorial);
		
		
		scan.close();
	}


	static long factorial(long number) {
		if (number==0) {
			return 1;
		}
		else {
			return number*factorial(number-1);
		}
	}
}