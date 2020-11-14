import java.util.Scanner;

import Computer.java;

public class Play
{
    Computer compMove;
    public static void main(String[] args)
    {
        Scanner move = new Scanner(System.in);
        System.out.print("What's your move? Either rock, paper, or scissors!");
        
        String yourMove = move.nextLine(); 
        System.out.println("You chose" + yourMove + "? I chose" + compMove + "!");
    }
}