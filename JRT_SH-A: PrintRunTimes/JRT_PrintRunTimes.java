// ***************************************************************************************/
// File Name: JRTPrintRunTimes.java     			Author: Justin Trubela			 	  /			
// Section: 03											  								  / 
//																						  /
// Purpose:   	   Write three statements to print the first three elements     		  /
//					of array runTimes. Follow each statement with a new line.      		  /
//****************************************************************************************/
import java.util.Scanner;
public class JRT_PrintRunTimes {

	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int[] runTimes = {800,775,790,805,808};     
		
		System.out.println(runTimes[0]);
		System.out.println(runTimes[1]);
		System.out.println(runTimes[2]);
		scan.close();
		return;   
		}
	}
