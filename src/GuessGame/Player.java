package GuessGame;

public class Player {
    void printIfWrong() {
        System.out.println("You guessed wrong... try again");
    }
    void introduction() {
        System.out.println("Welcome to Java guessing game, guess from 0 - 20...");
    }
    void wouldYouLikeAHint() {
        System.out.print("you've guessed wrong 10 Times, would you like a hint? Y/N: ");
    }
    void congratulatePlayer() {
        System.out.println("CONGRATULATIONS!!! YOU GUESSED CORRECT");
    }
}
