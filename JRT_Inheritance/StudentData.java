// ******************************************************************//
// File Name: StudentData.java     		       Author: Justin Trubela	//			
// Section: 03											  								// 
//																						   //
// Purpose:   	  import the prospective methods for the main method  //
//*******************************************************************//

// ===== Code from file StudentData.java =====
public class StudentData extends PersonData {
   private int idNum;

   public void setID(int studentId) {
      idNum = studentId;
      return;
   }

   public int getID() {
      return idNum;
   }
}
// ===== end =====