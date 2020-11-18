import java.util.Scanner;
import java.util.Random;

public class RPS
{   
    public static void main(String[] args) throws InterruptedException
    {
        //creates scanner to recieve user input
        Scanner move = new Scanner(System.in); 
        System.out.println("Let's play some Rock Paper Scissors! You first.\n");
     

        //beginning of loop
        while(true)
        {
            //used delays to keep the flow nice
            Thread.sleep(3000);
            System.out.print("Ok, What's your move? ('rock', 'paper', 'scissors', or 'leave' to quit!)\n"); 
            
            Thread.sleep(5000);  
            System.out.print("\nYour Move: ");

            //takes user input to be printed in line
            String yourMove = move.nextLine(); 
            
            //if user input is 'leave' loop will break
            if(yourMove.equals("leave")) 
            {
                break;
            }

            //if user inut is NOT 'leave' or remaining options
            if(!yourMove.equals("rock") && !yourMove.equals("paper") && !yourMove.equals("scissors"))
            {
                System.out.println("That's not even one of the option! Go again");
            }
            
            //if user input is NOT 'leave' but is one of remaining options, the loop will execute the following
            else
            {
                //creates random number generator
                //assigns generated numbers to int randomNum
                //creates unnassigned String compMove
                Random rand = new Random();        
                int randomNum = rand.nextInt(3);
                String compMove = "";
                
                //int randomNum will determine what String will be assinged to compMove
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
                


                
                //statements to determine winner
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
            }         
        }

        //when loop has been broken
        Thread.sleep(1000);
        System.out.println("\nThat was fun! Smell ya later! :)");
    }   
}
