//********************************************************************//
// File Name: StudentDerivationFromPerson.java                        //
// Author: Justin Trubela	                                           //			
// Section: 03							                                     //					  
//								                                              // 	 
// Purpose: Write a driver method for the Person/Student Data classes.//
//           Using inheritance, Assign the following:                 //
//             courseStudent's name:Smith,                            //
//             age:20, and                                            //
//             ID: 9999.                                              //
//               and output the respective data                       //
//********************************************************************//


// ===== Code from file StudentDerivationFromPerson.java =====
public class StudentDerivationFromPerson {
   public static void main (String [] args) {
      StudentData courseStudent = new StudentData();

      //use setName method to add name
      courseStudent.setName("Smith");
      //use setAge method to add age
      courseStudent.setAge(20);
      //use setID method to set ID
      courseStudent.setID(9999);
      
      //output data back to user
      courseStudent.printAll();
      System.out.println(", ID: " + courseStudent.getID());

      return;
   }
}
// ===== end =====