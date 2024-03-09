import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        System.out.println("*** Welcome to the Number Guessing Game ***");
        numberGuess();
        System.out.println("*** Thanks For Playing ***");
    }
    static  void numberGuess()
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int again;
        int score=0;
        do {
            int ComputerChoice = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("__________________________________________________________");
            System.out.println("Computer have Chose a number between 1 and 100");
            System.out.println("Now its your turn to guess it , You have 5 Attempts ");
            System.out.println("__________________________________________________________");
            while (attempts < maxAttempts) {
                System.out.print("Enter the number you guess : ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == ComputerChoice) {
                    System.out.println("Congratulations! You guessed the number " + ComputerChoice+ " in " + attempts + " attempts ");
                    score+=10;
                    break;
                } else if (userGuess < ComputerChoice ) {
                    System.out.println("Too low! Try again. " +  (maxAttempts - attempts) + " attempts left !" );
                } else {
                    System.out.println("Too high! Try again. " +  (maxAttempts - attempts) + " attempts left !" );
                }
            }

            if (attempts > maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + ComputerChoice );
            }
            System.out.println("Game over! Your score : " + score);
            System.out.println("__________________________________________________________");

            System.out.print("Do you want to play again?\nPress 1 to play again \nPress 0 to exit : ");

            again=sc.nextInt();
        } while (again==1);
    }
}
