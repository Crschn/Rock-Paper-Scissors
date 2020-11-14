import java.lang.Math;

public class Computer
{
    public static class Random 
    {
      int random = (int)(Math.random() * 3);
        /*
        int random(int min, int max)
        {
          int range = (max - min) + 1;
          return (int)(Math.random() * range) + min;
        }
      public static void main(String args[])
        {
          Random obj1 = new Random();
          int rand = obj1.random(1,3);
        }
        */
      String compMove;
      {
      if (random == 1)
        {
          String compMove = "rock";
        }
      else if (random == 2)
        {
          String compMove = "paper";
        }
      else if (random == 3)
        {
          String compMove = "scissors";
        }
      }
    }
    
    

    
}
