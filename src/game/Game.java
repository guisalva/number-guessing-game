package game;

import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int)(Math.random() * 100);
        int attempts = 10;

        System.out.println("The random number is between 1 and 100");
        System.out.println("You have " + attempts + " attempts to guess the number.");

        for (int i = 1; i <= attempts; i++) {
            System.out.println("\nAttempt #" + i);
            System.out.print("Make your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                scanner.close();
                return;
            } else if (guess < number) {
                System.out.println("Guess lower than the number.");
            } else {
                System.out.println("Guess higher than the number.");
            }
        }

        System.out.println("\nYou lose! You run out of attempts.");
        System.out.println("The number was: " + number);
    }
}
