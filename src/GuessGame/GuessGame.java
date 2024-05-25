package GuessGame;

import java.util.Objects;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Player player = new Player();
        int guessedNum = 0;
        boolean isCorrect = false;
        int targetNumber = (int) (Math.random() * 20) + 1;
        player.introduction();
        int totalNumOfGuesses = 20;

        while (totalNumOfGuesses > 0) {
            Scanner inputNumber = new Scanner(System.in);
            System.out.print("Guess number: ");
            String guessed = inputNumber.next();
            guessedNum = Integer.parseInt(guessed);
            if (guessedNum > 20){
                System.out.println("Number to guess is 0 - 20...");
            }
            totalNumOfGuesses--;

            if (guessedNum == targetNumber) {
                isCorrect = true;
            } else {
                if (totalNumOfGuesses == 10) {
                    player.wouldYouLikeAHint();
                    Scanner yesOrNo = new Scanner(System.in);
                    String answer = yesOrNo.next();

                    if (Objects.equals(answer, "Y")) {
                        if (targetNumber < 10) {
                            System.out.println("Number is less than 10");
                        } else {
                            System.out.println("Number is more than 10");
                        }
                    }
                    continue;
                }
            }
            if (isCorrect) {
                player.congratulatePlayer();
                break;
            } else {
                player.printIfWrong();
            }

            if (totalNumOfGuesses == 0) {
                System.out.println("GAME OVER, you guessed wrong 20 times.");
            }
        }
    }
}