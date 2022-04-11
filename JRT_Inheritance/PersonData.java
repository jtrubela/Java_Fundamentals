// ******************************************************************//
// File Name: PersonData.java     		       Author: Justin Trubela	//			
// Section: 03											  								// 
//																						   //
// Purpose:   	  import the prospective methods for the main method  //
//*******************************************************************//

// ===== Code from file PersonData.java =====
public class PersonData {
   private int ageYears;
   private String lastName;

   public void setName(String userName) {
      lastName  = userName;
      return;
   }

   public void setAge(int numYears) {
      ageYears = numYears;
      return;
   }

   // Other parts omitted

   public void printAll() {
      System.out.print("Name: " + lastName);
      System.out.print(", Age: "  + ageYears);
      return;
   }
}
// ===== end =====