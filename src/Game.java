import java.util.HashSet;
import java.util.Set;

public class Game {
    private String word;
    private Set<Character> guessedLetters;
    boolean wordGuessed;
    private int lives;

    public Game (String word) {
        this.word = word;
        guessedLetters = new HashSet<>();
        lives = 10;
    }

    public String getWord() {
        return word;
    }

    public void displayWordsWithBlanks() {
        for (char c : word.toCharArray()) {
            if (guessedLetters.contains(Character.toUpperCase(c))) {
                System.out.print(c + " ");
            } else if (c == ' ') {
                System.out.print("  ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public void getUserInput(char letter) {
        letter = Character.toUpperCase(letter);

        if (guessedLetters.contains(letter)) {
            System.out.println("You have already guessed that letter. Try again.");
            System.out.println("Letters guessed: " + guessedLetters);
            return;
        }
        guessedLetters.add(letter);
        if (!word.contains(String.valueOf(letter))) {
            lives--;
            System.out.println("Incorrect guess! Lives remaining: " + lives);
            System.out.println("Letters guessed: " + guessedLetters);

            if (lives == 9) {
                System.out.println("___/|____");
            } else if (lives == 8) {
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 7) {
                System.out.println("    _________");
                System.out.println("    |/    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 6) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 5) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |     (   )");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 4) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |     (   )");
                System.out.println("    |       |");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 3) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |     (   )");
                System.out.println("    |       |");
                System.out.println("    |       |");
                System.out.println("    |    ");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 2) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |     (   )");
                System.out.println("    |       |");
                System.out.println("    |       |");
                System.out.println("    |      / /");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 1) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |     (-_-)");
                System.out.println("    |       |");
                System.out.println("    |       |");
                System.out.println("    |      / /");
                System.out.println("    |    ");
                System.out.println("___/|____");
            } else if (lives == 0) {
                System.out.println("    _________");
                System.out.println("    |/      |");
                System.out.println("    |       |");
                System.out.println("    |     (-_-)");
                System.out.println("    |       |");
                System.out.println("    |       |");
                System.out.println("    |      | |");
                System.out.println("___/|____ GAME OVER");
            }
        }
    }

    public boolean wordGuessed() {
        if (this.wordGuessed) {
            return true;
        }
        if (this.guessedLetters.isEmpty()) {
            return false;
        }
        for (char c: word.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public void guessWholeWord(String guess) {
        guess = guess.toUpperCase();

        if (guess.contains(word.toUpperCase())) {
            wordGuessed = true;
        } else {
            lives --;
        }
    }

    public boolean gameOver() {
        return lives == 0 || wordGuessed();
    }
}
