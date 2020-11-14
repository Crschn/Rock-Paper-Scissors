class Check
{
    String yourMove = Play.yourMove;

    if (yourMove.equals(compMove))
    {
        System.out.println("Bruh we chose the same, stop reading my mind! You go again.");
    }

    else if(yourMove.equals("rock")) && (compMove.equals("paper"))
    {
        System.out.println("Eat paper loser! Another go? Pick first!");
    }
    else if(yourMove.equals("paper")) && (compMove.equals("scissors"))
    {
        System.out.println("LOL cut. Try again loser, you first so that I know you're not cheating. >:D");
    }
    else if(yourMove.equals("scissors")) && (compMove.equals("rock"))
    {
        System.out.println("ERROR: COMPLETELY DEMOLISHED. TRY AGAIN.");
    }

    if else(yourMove.equals("rock")) && (compMove.equals("scissors"))
    {
        System.out.println("Yo, don't actually break my scissors! Lemme try again! You first.");
    }
    if else(yourMove.equals("scissors")) && (compMove.equals("paper"))
    {
        System.out.println("Hmm... I guess you got lucky. Go again, again!");
    }
    else (yourMove.equals("paper")) && (compMove.equals("rock"))
    {
        System.out.println("Ok gimme my rock back, you win you win... Go again!");
    }
}