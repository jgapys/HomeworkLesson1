import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        System.out.println("Begin guessing a number between 0 and 99");

        for (int i = 1; i <= 5; i++) {
            int userNumber = new Scanner(System.in).nextInt();

            if (userNumber > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            } else if (userNumber < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            } else {
                System.out.println("You guessed it!");
                break;
            }

            if (i < 4) {
                System.out.println("You have %s tries left. Please try again.".formatted(5 - i));
            } else if (i == 4) {
                System.out.println("You have 1 try left. Please try again.");
            } else {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }
        }
    }
}
