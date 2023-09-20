import java.util.Scanner;

public class StartAndFinish {
    private Game game;

    public StartAndFinish () {
        System.out.println("Welcome to Hangman! Lets begin...");
        String word = selectCategory();
        game = new Game(word);
    }

    public void start() {
        PlayerInput playerInput = new PlayerInput();
        Scanner scanner = new Scanner(System.in);

        while (!game.gameOver()) {
            game.displayWordsWithBlanks();

            System.out.println("Guess the whole word (or enter a letter): ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                char guess = input.charAt(0);
                game.getUserInput(guess);
            } else {
                game.guessWholeWord(input);
            }
        }

        if (game.wordGuessed()) {
            System.out.println("Congratulations! You GOT IT! The word was: " + game.getWord());
        } else {
            System.out.println("Game over! The word was: " + game.getWord());
        }
    }

    private String selectCategory() {
        System.out.println("Select a category:");
        System.out.println("1. Development");
        System.out.println("2. Cars");
        System.out.println("3. Cities in England");
        System.out.println("4. Animals");
        Scanner scanner = new Scanner(System.in);
        int categoryChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (categoryChoice == 1) {
            return HangmanUtils.getDevelopmentWords();
        } else if (categoryChoice == 2) {
            return HangmanUtils.getCarMakes();
        } else if (categoryChoice == 3) {
            return HangmanUtils.getCities();
        } else if (categoryChoice == 4) {
            return HangmanUtils.getAnimals();
        } else {
            System.out.println("Invalid category choice. Select a category 1 and 4");
            System.exit(1);
            return null;
        }
    }
}
