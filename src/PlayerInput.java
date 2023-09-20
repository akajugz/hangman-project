import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlayerInput {
    private Scanner scanner = new Scanner(System.in);
    private Set<Character> guessedLetters = new HashSet<>();

    public char playerGuesses() {
        System.out.println("Start by entering your letter as a guess: ");
        String input = scanner.nextLine().toUpperCase();
        char guess = input.charAt(0);

        while (guessedLetters.contains(guess)) {
            System.out.println("You have already guessed that letter. Try again: ");
            input = scanner.nextLine().toUpperCase();
            guess = input.charAt(0);
        }

        return guess;
    }
}
