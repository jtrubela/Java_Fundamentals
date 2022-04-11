//********************************************************************
//  CatchTheCreaturePanel.java       Author: Justin Trubela
//
//  Section:03          Change creature image
//********************************************************************

//********************************************************************
//  CatchTheCreaturePanel.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.12
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CatchTheCreaturePanel extends JPanel
{
   private Creature creature;
   private Random gen;
   private Timer animate;

   private final int INITIAL_X = 20, INITIAL_Y = 100;
   private final int MOVE_ODDS = 4;  // 1 in 4 chance the creature will move
   private final int DELAY = 500;

   //-----------------------------------------------------------------
   //  Sets up the panel.
   //-----------------------------------------------------------------
   public CatchTheCreaturePanel()
   {
      creature = new Creature(INITIAL_X, INITIAL_Y);
      gen = new Random();

      addMouseListener(new Catcher());

      setBackground(Color.white);
      setPreferredSize(new Dimension(500, 500));

      animate = new Timer(DELAY, new RandomMover());
      animate.start();
   }

   //-----------------------------------------------------------------
   //  Draws the creature and the number of catches
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      creature.draw(this, page);
      String catchString = "Catches: " + creature.getCatchCount();
      page.drawString(catchString, 10, 20);
      String missString = "Misses: " + creature.getMissCount();
      page.drawString(missString, 10, 40);
   }

   //*****************************************************************
   //  Inner class that listens for mouse presses.  If the mouse is
   //  pressed inside the creature, the move the creature and
   //  repaint the screen.
   //*****************************************************************
   private class Catcher extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         if (creature.pointInMe(event.getX(), event.getY()))
            creature.move(getSize());
         repaint ();
      }
   }

   //*****************************************************************
   //  Inner class that listens for the timer to move the creature and
   //  repaint the screen during the animation.  Moves the create based
   //  on MOVE_ODDS (may not move every time the timer fires).
   //*****************************************************************
   private class RandomMover implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         int shouldMove = gen.nextInt(MOVE_ODDS);
         if (shouldMove == 0)
         {
            creature.move(getSize());
            repaint();
         }
      }
   }
}
