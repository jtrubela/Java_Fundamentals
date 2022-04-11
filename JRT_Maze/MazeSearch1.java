//********************************************************************
//  MazeSearch.java       Author: Justin Trubela
//  Section 3
//
//  Demonstrates recursion. Show that the maze cannot be traversed
//********************************************************************

public class MazeSearch1
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, attempts to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Maze1 labyrinth = new Maze1();
      
      System.out.println(labyrinth);

      if (labyrinth.traverse(0, 0))
         System.out.println("The maze was successfully traversed!");
      else
         System.out.println("There is no possible path.");

      System.out.println(labyrinth);
   }
}
