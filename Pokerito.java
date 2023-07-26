import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This output explains the rules of the game
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        // We draw the cards for both the player and the computer
        // Get a random card for the player
        String yourCard = randomCard();

        // Get a random card for the computer
        String computerCard = randomCard();

        // Displays the players card
        System.out.println(" Here is you card");
        System.out.println(yourCard);

        // Displays the users card
        System.out.println("\nHere is the computers card.");
        System.out.println(computerCard);

        // Player starts at 0 matches
        int yourMatches = 0;

        // Computer starts at 0 matches
        int computerMatches = 0;

        // Draw five river cards and we check for matches
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        // Loop for drawing 5 river cards
        for (int i = 1; i <= 5; i++) {
            // We wait for the player to press "ENTER" to continue drawing cards
            scan.nextLine();
            // Get a random card for the river
            String draw = randomCard();

            // Checks if the players card matches a drawn river card then updates the matches
            if (yourCard.equals(draw)){
                yourMatches++;
            }
            // Checks if the computer card matches a drawn river card then updates the matches
            if (computerCard.equals(draw)) {
                computerMatches++;

            }
            // Display the current river card number
            System.out.println("Card " + i + "\n");

            // Displays the current river card
            System.out.println(draw);

        }

        // Displays match counts for the player and the computer
        System.out.println("Your number of matches" + yourMatches);
        System.out.println("Computer number of matches" + computerMatches);

        // Here we determine a winner or if it is a draw
        if (yourMatches > computerMatches){
            System.out.println("YOU WON!"); // This a victory message for the player
        } else if (computerMatches > yourMatches) {
            System.out.println("THE COMPUTER WINS!"); // This is a victory message for the computer
        } else {
            System.out.println("EVERYONE WINS!"); // This is the draw message

        }
        // Close scan to prevent data leak
        scan.close();
    }
    public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;

        // Convert random double to an integer
        int randomInt = (int) randomNumber; // 1-13

        // Here we generate and return a card based on the random integer
        // This goes on from 1-13
        switch (randomInt) {
            case 1:return "   _____\n"+
                          "  |A _  |\n"+
                          "  | ( ) |\n"+
                          "  |(_'_)|\n"+
                          "  |  |  |\n"+
                          "  |____V|\n";

            case 2:return "   _____\n"+
                          "  |2    |\n"+
                          "  |  o  |\n"+
                          "  |     |\n"+
                          "  |  o  |\n"+
                          "  |____Z|\n";


            case 3:return "   _____\n" +
                          "  |3    |\n"+
                          "  | o o |\n"+
                          "  |     |\n"+
                          "  |  o  |\n"+
                          "  |____E|\n";

            case 4:return "   _____\n" +
                          "  |4    |\n"+
                          "  | o o |\n"+
                          "  |     |\n"+
                          "  | o o |\n"+
                          "  |____h|\n";

            case 5:return "   _____ \n" +
                          "  |5    |\n" +
                          "  | o o |\n" +
                          "  |  o  |\n" +
                          "  | o o |\n" +
                          "  |____S|\n";

            case 6:return "   _____ \n" +
                          "  |6    |\n" +
                          "  | o o |\n" +
                          "  | o o |\n" +
                          "  | o o |\n" +
                          "  |____6|\n";

            case 7:return"   _____ \n" +
                         "  |7    |\n" +
                         "  | o o |\n" +
                         "  |o o o|\n" +
                         "  | o o |\n" +
                         "  |____7|\n";

            case 8:return "   _____ \n" +
                          "  |8    |\n" +
                          "  |o o o|\n" +
                          "  | o o |\n" +
                          "  |o o o|\n" +
                          "  |____8|\n";

            case 9:return "   _____ \n" +
                          "  |9    |\n" +
                          "  |o o o|\n" +
                          "  |o o o|\n" +
                          "  |o o o|\n" +
                          "  |____9|\n";


            case 10:return"   _____ \n" +
                          "  |10  o|\n" +
                          "  |o o o|\n" +
                          "  |o o o|\n" +
                          "  |o o o|\n" +
                          "  |___10|\n";

            case 11:return "   _____\n" +
                           "  |J  ww|\n"+
                           "  | o {)|\n"+
                           "  |o o% |\n"+
                           "  | | % |\n"+
                           "  |__%%[|\n";

            case 12:return "   _____\n" +
                           "  |Q  ww|\n"+
                           "  | o {(|\n"+
                           "  |o o%%|\n"+
                           "  | |%%%|\n"+
                           "  |_%%%O|\n";

            case 13:return"   _____\n" +
                          "  |K  WW|\n"+
                          "  | o {)|\n"+
                          "  |o o%%|\n"+
                          "  | |%%%|\n"+
                          "  |_%%%>|\n";

            // In case of an unexpected randomInt value
            default: return " This should never get called";


        }


    }
}
