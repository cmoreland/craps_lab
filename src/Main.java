import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean done = false;

        System.out.println("Would you like to play a game of craps? [Y / N]: ");
        String play = in.nextLine();
        if (play.equalsIgnoreCase("Y")) {
            do {
                boolean playAgainDone = false;
                System.out.println("\nOkay! Let's Go!\n\n");
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;

                int roll = die1 + die2;
                System.out.println("You rolled " + roll + ".\n");

                if (roll == 2 || roll == 3 || roll == 12) {
                    System.out.println("\nYou Crapped out! You lose!\n");
                    do {
                        System.out.println("Would you like to play again? [Y / N]: ");
                        String playAgain = in.nextLine();
                        if (playAgain.equalsIgnoreCase("N")){
                            System.out.println("\nPlay again soon!");
                            done = true;
                            playAgainDone = true;
                        }
                        else if (playAgain.equalsIgnoreCase("Y")){
                            playAgainDone = true;
                        }
                        else {
                            System.out.println("That's not quite right.\n");
                        }
                    }while(!playAgainDone);
                }
                else if (roll == 7 || roll == 11){
                    System.out.println("It's a natural! You win!\n");
                    do {
                        System.out.println("Would you like to play again? [Y / N]: ");
                        String playAgain = in.nextLine();
                        if (playAgain.equalsIgnoreCase("N")){
                            System.out.println("\nPlay again soon!");
                            done = true;
                            playAgainDone = true;
                        }
                        else if (playAgain.equalsIgnoreCase("Y")){
                            playAgainDone = true;
                        }
                        else {
                            System.out.println("That's not quite right.\n");
                        }
                    }while(!playAgainDone);
                }
                else {
                    int rollPoint;
                    boolean pointDone = false;

                    do{
                        System.out.println("\nThe point is " + roll + ".\n");

                        System.out.println("Press ENTER to roll again and try for point: ");
                        if (in.hasNextLine()) {
                            String enter = in.nextLine();
                        }

                        int pointDie1 = rnd.nextInt(6) + 1;
                        int pointDie2 = rnd.nextInt(6) + 1;
                        rollPoint = pointDie1 + pointDie2;

                        System.out.println("\nYou rolled " + rollPoint + ".\n");
                        if (rollPoint == 7 || rollPoint == roll){
                            pointDone = true;
                        }
                    }while(!pointDone);
                    if (rollPoint == 7){
                        System.out.println("\nYou Lose!\n");
                        do {
                            System.out.println("Would you like to play again? [Y / N]: ");
                            String playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("N")){
                                System.out.println("\nPlay again soon!");
                                done = true;
                                playAgainDone = true;
                            }
                            else if (playAgain.equalsIgnoreCase("Y")){
                                playAgainDone = true;
                            }
                            else {
                                System.out.println("That's not quite right.\n");
                            }
                        }while(!playAgainDone);
                    }
                    else {
                        System.out.println("\nYou win!\n");
                        do {
                            System.out.println("Would you like to play again? [Y / N]: ");
                            String playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("N")){
                                System.out.println("\nPlay again soon!");
                                done = true;
                                playAgainDone = true;
                            }
                            else if (playAgain.equalsIgnoreCase("Y")){
                                playAgainDone = true;
                            }
                            else {
                                System.out.println("That's not quite right.\n");
                            }
                        }while(!playAgainDone);
                    }
                }
            } while (!done);
        }
        else if (play.equalsIgnoreCase("N")) {
            System.out.println("Okay...");
        }
    }
}