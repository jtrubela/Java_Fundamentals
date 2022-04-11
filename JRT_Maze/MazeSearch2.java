//********************************************************************
//  MazeSearch.java       Author: Justin Trubela
//  Section 3
//
//  Demonstrates recursion. Show that the maze cannot be traversed
//			with 2 different paths
//
//		THE PATH CHOSEN DEPENDS ON THE TRAVERSE METHODS CALLED
//		ALONG WITH WHICH DIRECTION WE WANT TO TRAVERSE FIRST BEFORE
//		MOVING ALONG. IN THIS CASE, DOWN AND RIGHT ARE THE FIRST 2
//		OPTIONS CHOSEN BEFORE MOVING ON TO UP AND LEFT. SINCE THE 
//		SECONDARY PATH IS GIVEN WITH AN AVAILABLE OPTION TO GO LEFT,
//		IT NEVER REACHES THE LEFT METHOD BECAUSE RIGHT IS ALLOWED FIRST
//********************************************************************

public class MazeSearch2
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, attempts to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Maze2 labyrinth = new Maze2();
      
      System.out.println(labyrinth);

      if (labyrinth.traverse(0, 0))
         System.out.println("The maze was successfully traversed!");
      else
         System.out.println("There is no possible path.");

      System.out.println(labyrinth);
   }
}
