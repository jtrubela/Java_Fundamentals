//********************************************************************
//  Creature.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 9.12
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Creature
{
   private int creatureX, creatureY, clickCount, catchCount;
   private ImageIcon creature;
   private Random gen;

   //-----------------------------------------------------------------
   //  Creates the creature.
   //-----------------------------------------------------------------
   public Creature(int initialX, int initialY)
   {
      creature = new ImageIcon("happyFace.gif");
      creatureX = initialX;
      creatureY = initialY;
      clickCount = catchCount = 0;
      gen = new Random();
   }

   //-----------------------------------------------------------------
   //  Moves the creature to a random location within the play area.
   //-----------------------------------------------------------------
   public void move(Dimension area)
   {
      creatureX = gen.nextInt(area.width - creature.getIconWidth());
      creatureY = gen.nextInt(area.height - creature.getIconHeight());
   }

   //-----------------------------------------------------------------
   //  Returns true if point (x , y) is in the creature and increments
   //  the catch count, else returns false.
   //-----------------------------------------------------------------
   public boolean pointInMe(int x, int y)
   {
      clickCount++;
      if (x >= creatureX && x <= creatureX + creature.getIconWidth())
      {
         if (y >= creatureY && y <= creatureY + creature.getIconHeight())
         {
            catchCount++;
            return true;
         }
         else
            return false;
      }
      else
         return false;
   }

   //-----------------------------------------------------------------
   //  Returns the number of catches.
   //-----------------------------------------------------------------
   public int getCatchCount()
   {
      return catchCount;
   }

   //-----------------------------------------------------------------
   //  Returns the number of misses.
   //-----------------------------------------------------------------
   public int getMissCount()
   {
      return clickCount - catchCount;
   }

   //-----------------------------------------------------------------
   //  Draws the creature on the specified component.
   //-----------------------------------------------------------------
   public void draw(Component panel, Graphics page)
   {
      creature.paintIcon(panel, page, creatureX, creatureY);
   }
}

