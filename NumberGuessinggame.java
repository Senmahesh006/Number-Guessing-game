import java.util.Scanner;
import java.util.Random;

public class NumberGuessinggame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = -1;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Try a higher number!");
            } else if (guess > randomNumber) {
                System.out.println("Try a lower number!");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }

        scanner.close();
    }
}
