import java.util.Scanner;

class RPS
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your move? Either rock paper or scissors!")
        String yourMove = in.nextLine();

        if(!yourMove.equals("rock") && !yourMove.equals("paper") && !yourMove.equals("scissors"))
        {
            System.out.println("")
        }
    }
}