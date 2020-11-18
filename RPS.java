import java.util.Scanner;
import java.util.Random;

public class RPS
{   
    public static void main(String[] args) throws InterruptedException
    {
        Scanner move = new Scanner(System.in); 
        System.out.println("Let's play some Rock Paper Scissors! You first.\n");
     


        while(true)
        {
            Thread.sleep(3000);            
            System.out.print("Ok, What's your move? ('rock', 'paper', 'scissors', or 'leave' to quit!)\n"); 
            
            Thread.sleep(5000);  
            System.out.print("\nYour Move: ");

            String yourMove = move.nextLine(); 
            
            if(yourMove.equals("leave")) 
            {
                break;
            }
            


            else
            {
                Random rand = new Random();        
                int randomNum = rand.nextInt(3);
                String compMove = "";
                
                if (randomNum == 0)
                {
                    compMove = "rock";
                }
                else if (randomNum == 1)
                {
                    compMove = "paper";
                }
                else if (randomNum == 2)
                {
                    compMove = "scissors";
                }
                
                Thread.sleep(1000);
                System.out.println("\nComputer move: " + compMove + "\n");
                


                Thread.sleep(3000);
                //TIE
                if (yourMove.equals(compMove))
                {
                    System.out.println("Bruh we chose the same, stop reading my mind! You go again.");
                }

                //LOSS
                else if ((yourMove.equals("rock")) && (compMove.equals("paper")))
                {
                    System.out.println("Eat paper loser! Another go? Pick first!\n");
                }
                else if ((yourMove.equals("paper")) && (compMove.equals("scissors")))
                {
                    System.out.println("LOL cut. Try again loser, you first so that I know you're not cheating. >:D\n");
                }
                else if ((yourMove.equals("scissors")) && (compMove.equals("rock")))
                {
                    System.out.println("ERROR: COMPLETELY DEMOLISHED. TRY AGAIN.\n");
                }

                //WIN
                else if ((yourMove.equals("rock")) && (compMove.equals("scissors")))
                {
                    System.out.println("Yo, don't actually break my scissors! Lemme try again! You first.\n");
                }
                else if ((yourMove.equals("scissors")) && (compMove.equals("paper")))
                {
                    System.out.println("Hmm... I guess you got lucky. Go again, again!\n");
                }
                else if ((yourMove.equals("paper")) && (compMove.equals("rock")))
                {
                    System.out.println("Ok you win you win... Go again!\n");
                }

                Thread.sleep(3000);  
            }          
        }

        Thread.sleep(1000);

        System.out.println("\nThat was fun! Smell ya later! :)");
    }   
}
