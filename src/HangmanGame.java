import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    private String wordToGuess;
    private StringBuilder currentProgress;
    private ArrayList<Character> guessedLetters;
    private int attemptsLeft;

    public HangmanGame(String wordToGuess, int maxAttempts) {
        this.wordToGuess = wordToGuess.toLowerCase();
        this.currentProgress = new StringBuilder("_".repeat(wordToGuess.length()));
        this.guessedLetters = new ArrayList<>();
        this.attemptsLeft = maxAttempts;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        while (attemptsLeft > 0 && currentProgress.indexOf("_") != -1) {
            System.out.println("\nWord: " + currentProgress);
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.println("Guessed letters: " + guessedLetters);
            System.out.print("Enter a letter: ");
            char guess = sc.nextLine().toLowerCase().charAt(0);
            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed this letter");
                continue;
            }

            guessedLetters.add(guess);

            if (wordToGuess.contains(String.valueOf(guess))) {
                updateProgress(guess);
                System.out.println("Correct guess!!!");
            } else {
                attemptsLeft--;
                System.out.println("You guessed it wrong. Attempts remaining: " + attemptsLeft);
            }
        }

        if (currentProgress.indexOf("_") == -1) {
            System.out.println("Congratulations!!! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game Over!!! The word was: " + wordToGuess);
        }

        sc.close();
    }
    private void updateProgress(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                currentProgress.setCharAt(i, guess);
            }
        }
    }
}
