//********************************************************************
//  CatchTheCreature.java       Author: Justin Trubela
//
//  Section:03          Change creature image
//********************************************************************

//********************************************************************
//  CatchTheCreature.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.12
//********************************************************************

import javax.swing.JFrame;

public class CatchTheCreature
{
   //-----------------------------------------------------------------
   //  Displays the main frame of the program.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Catch The Creature");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new CatchTheCreaturePanel());
      frame.pack();
      frame.setVisible(true);
   }
}
