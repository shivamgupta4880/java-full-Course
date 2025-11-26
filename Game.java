/* 
  *1. Create a class Gaeme, which allows a user to play "Guess the Number
  2. The class should have the following methods:
    i. Constructor to generate the random number
    ii. takeUserInput() to take a user input of number
    iii. isCorrectNumber() to detect whether the number entered by the user is true
    iv. getter and setter for noOfGuesses
    */
    import java.util.Scanner;
import java.util.Random;

public class Game {
    private int randomNumber; // Random number to guess
    private int noOfGuesses;  // Number of guesses taken by the user

    // Constructor to generate the random number
    public Game() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        this.noOfGuesses = 0;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (1-100): ");
        return sc.nextInt();
    }

    // Method to check if the user's number is correct
    public boolean isCorrectNumber(int userGuess) {
        noOfGuesses++;
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You've guessed the correct number.");
            return true;
        } else if (userGuess < randomNumber) {
            System.out.println("The number is higher. Try again!");
        } else {
            System.out.println("The number is lower. Try again!");
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses (optional, if you want to reset it)
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Main method to play the game
    public static void main(String[] args) {
        Game game = new Game();
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number Game!");
        while (!hasGuessedCorrectly) {
            int userGuess = game.takeUserInput();
            hasGuessedCorrectly = game.isCorrectNumber(userGuess);
        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " attempts.");
    }
}
