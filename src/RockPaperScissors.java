import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean done = false;
        String player1 = "";
        String player2 = "";
        String restart = "";
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Player 1, enter your move [R/P/S]: ");
            player1 = in.next();
            System.out.println("Player 2, enter your move [R/P/S]: ");
            player2 = in.next();

            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("It is a tie.");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("You have entered an invalid input: " + player2);
                }
            } else if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 1 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie.");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Player 2 wins!");
                } else {
                    System.out.println("You have entered an invalid input: " + player2);
                }
            } else if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Player 2 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Player 1 wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("It's a tie.");
                } else {
                    System.out.println("You have entered an invalid input: " + player2);
                }
            } else {
                System.out.println("You have entered an invalid input: " + player1);
            }
            System.out.println("Would you like to play again? [Y/N]: ");
            restart = in.next();
            if(restart.equalsIgnoreCase("N")){
                done = true;
            }
        }while(!done);
    }
}