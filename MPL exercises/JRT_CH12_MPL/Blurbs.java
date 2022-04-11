
//----------------------------------------------------------------------------------/
//File Name: Blurbs.java   		  					Author: Justin Trubela		    /			
//Section: 03											  						    / 
//																				    /
//Purpose:  Did not show output on MPL but works fine in eclipse					/
//																					/
// MPL 70233 Alien Race - Blurbs													/ 
// In the language of an alien race, all words take the form of Blurbs. A Blurb		/
// is a Whoozit followed by one or more Whatzits. A Whoozit is the character		/
// 'x' followed by zero or more 'y's. A Whatzit is a 'q' followed by either a 		/
// 'z' or a 'd', followed by a Whoozit. 											/
//																					/
// Design and implement a recursive program to determine whether a string is a		/
// valid Blurb. The user should be able to enter a string, and the program 			/
// should print whether or not that string is a Blurb (either "true" or "false"). 	/
//----------------------------------------------------------------------------------/

import java.util.Scanner;

public class Blurbs {

	final static int ISFALSE = -1;

	public static void main(String[] args) {

		// ask the alien for a potential blurb
		Scanner scan = new Scanner(System.in);

		System.out.println("Lets see if your a real alien. \nEnter the correct blurb password: ");
		String input = scan.nextLine();

		System.out.println(isBlurb(input));
		scan.close();

		if (isBlurb(input) == true) {
			System.out.println("xyyyqzqyyy! xyyyyyqdxy xyqzxy(translation): Greetings! You are true alien.");
		} 
		else {
			System.out.println("BEGONE IMPOSTER");
		}

	}

	/* /-----------------------------------------------------------------/ */
	// recursively check isWhoozit and isWhatzit to determine if blurb //
	/* / ----------------------------------------------------------------/ */
	public static boolean isBlurb(String str) {
		int whoozitPostfix = isWhoozit(str);

		// if the potential blurb ending is > str length, potential blurb is not a blurb
		if (whoozitPostfix >= str.length()) {
			return false;
		}

		// Otherwise, continue
		else {
			return isWhatzit(str.substring(whoozitPostfix));
		}
	}

	public static int isWhoozit(String str) {
		int index = 0;

		if (str.charAt(index) == 'x') {
			// check to see how many y's follow the x.
			index++;

			while (index < str.length() && str.charAt(index) == 'y') {
				index++;
			}
			return index;
		} else {
			// If the potential blurb does not begin with an x, then it is not a blurb.
			return ISFALSE+1;
		}
	}

	public static boolean isWhatzit(String str) {
		// a whatzit is a segment starting with 'q' and ending in 'd' followed by a
		// Whoozit
		// check to see if this is true and if segment length is greater than 3
		// because each whatzit length is greater than 3

		// if potential blurb starts with "qd" or "qz" or length is greater than 3
		if (!str.startsWith("qd") && !str.startsWith("qz") || str.length() < 3) {
			return false;
		}

		// Check for potential Whoozit
		str = str.substring(2);
		int whoozitEnding = isWhoozit(str);

		// If potential blurb does not begin with "qd" or "qz" and ending is not a
		// Whoozit,
		// then it is not a blurb

		if (whoozitEnding == ISFALSE) {
			return false;
		}

		// If nothing is left, we have a Whatszit.

		else if (whoozitEnding == str.length()) {
			return true;
		}

		// Otherwise, check if Whatszit
		else {
			return isWhatzit(str.substring(whoozitEnding));
		}
	}

}
