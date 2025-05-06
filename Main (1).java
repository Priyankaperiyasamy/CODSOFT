import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRoundsWon = 0;

        System.out.println(" Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Range: 1 to 100
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\n I'm thinking of a number between 1 and 100.");
            System.out.println(" You have " + maxAttempts + " attempts to guess it!");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println(" Correct! You've guessed the number!");
                    totalRoundsWon++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println(" Too low! Try a higher number.");
                } else {
                    System.out.println(" Too high! Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've used all your attempts. The number was: " + numberToGuess);
            }

            System.out.print("\n Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\n Game Over! Rounds won: " + totalRoundsWon);
        scanner.close();
    }
}
