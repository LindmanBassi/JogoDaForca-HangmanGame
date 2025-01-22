import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        WordLoader wordLoader = new WordLoader();
        ArrayList<String> path = wordLoader.loadWords("yourpath.txt");

        if (path.isEmpty())
        {
            System.out.println("No words found, using default word list.");
            path = wordLoader.getDefaultWords();
        }

        Random random = new Random();
        String randomWord = path.get(random.nextInt(path.size()));
        HangmanGame game = new HangmanGame(randomWord, randomWord.length() + 3);
        game.play();
    }
}
