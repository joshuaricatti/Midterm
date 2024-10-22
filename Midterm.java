package midtermproject;
import java.util.Scanner;

public class test2 {
    private static String playerId = "Player1"; // Default Player ID
    private static final Scanner scanner = new Scanner(System.in);
    private static final test2 random = new test2();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
        }
    }

    // Display the main menu
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Play");
        System.out.println("2. Change Player ID");
        System.out.println("3. Display Player ID");
        System.out.println("4. Quit");
        System.out.print("Choose an option: ");

        int choice = getValidIntInput();

        switch (choice) {
            case 1:
                playGame();
                break;
            case 2:
                changePlayerId();
                break;
            case 3:
                displayPlayerId();
                break;
            case 4:
                System.out.println("Quitting the game. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Play the guessing game
    private static void playGame() {
        System.out.println("Welcome " + playerId + "!");
        System.out.println("Choose difficulty level:");
        System.out.println("1. Easy (20 attempts)");
        System.out.println("2. Medium (15 attempts)");
        System.out.println("3. Hard (10 attempts)");
        System.out.print("Select difficulty: ");

        int attempts = getAttemptsBasedOnDifficulty();


        int numberToGuess = generateRandomNumber();
        boolean guessedCorrectly = false;

        for (int i = attempts; i > 0; i = i-1) {
            System.out.print("Enter a 4-digit number. Attempts remaining " + (i) + " ");
            String userGuess = scanner.nextLine();

            if (!isValidInput(userGuess)) {
                System.out.println("Invalid input. Please enter a 4-digit number.");
                i++; // Don't count this as an attempt
                continue;
            }

            int[] feedback = getFeedback(userGuess, numberToGuess);
            int matches = feedback[0];
            int catches = feedback[1];

            if (matches == 4) {
                System.out.println("Congratulations! You've guessed the number: " + numberToGuess);
                guessedCorrectly = true;
                break;
            } else {
                System.out.println("Matches: " + matches + ", Catches: " + catches);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Game OVER. The number was: " + numberToGuess);
        }
    }

    // Generate a random 4-digit integer
    private static int generateRandomNumber() {
    	int Randn = (int)(Math.random()*8999 + 1000);
        return  Randn; // Generates a number between 1000 and 9999
    }

    private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	// Get feedback on matches and catches
    private static int[] getFeedback(String userGuess, int numberToGuess) {
        String numberStr = String.valueOf(numberToGuess);
        int matches = 0;
        int catches = 0;
        boolean[] countedUser = new boolean[4];
        boolean[] countedActual = new boolean[4];

        // Check for matches
        for (int i = 0; i < 4; i++) {
            if (userGuess.charAt(i) == numberStr.charAt(i)) {
                matches++;
                countedUser[i] = true;
                countedActual[i] = true;
            }
        }

        // Check for catches
        for (int i = 0; i < 4; i++) {
            if (!countedUser[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!countedActual[j] && userGuess.charAt(i) == numberStr.charAt(j)) {
                        catches++;
                        countedActual[j] = true; // Mark this digit as counted
                        break;
                    }
                }
            }
        }

        return new int[]{matches, catches};
    }

    // Change the Player ID
    private static void changePlayerId() {
        System.out.print("Enter new Player ID: ");
        playerId = scanner.nextLine();
        System.out.println("Player ID changed to: " + playerId);
    }

    // Display the current Player ID
    private static void displayPlayerId() {
        System.out.println("Current Player ID: " + playerId);
    }

    // Validate user input for 4-digit integers
    private static boolean isValidInput(String input) {
        return input.matches("\\d{4}");
    }

    // Get the number of attempts based on the selected difficulty level
    private static int getAttemptsBasedOnDifficulty() {
        int difficulty = getValidIntInput();
        switch (difficulty) {
            case 1:
                return 20; // Easy
            case 2:
                return 15; // Medium
            case 3:
                return 10; // Hard
            default:
                return 20; // Invalid
        }
    }

    // Get valid integer input from the user
    private static int getValidIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}


