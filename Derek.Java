package MidTerm;
import java.util.Scanner;

public class MidTerm {
    private static String playerId = "Derek"; // Default Player ID
    private static final Scanner scanner = new Scanner(System.in);
    private static final MidTerm random = new MidTerm();

    public static void main(String[] args) {
        while (true){
           
    // Display the main menu with infinite loop
        System.out.println("Menu:");
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
            	// Change the Player ID
                    System.out.print("Enter new Player ID: ");
                    playerId = scanner.nextLine();
                
                break;
            case 3:
            	 // Display the current Player ID
                    System.out.println("Current Player ID: " + playerId);
                break;
              
            case 4:
                System.out.println("Quitting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
        }     
   
    // Play the guessing game
    private static void playGame() {
        System.out.println("Welcome " + playerId + "!!");
        System.out.println("Choose number of attempts you need:");
        System.out.println("1. Easy (20 attempts)");
        System.out.println("2. Medium (15 attempts)");
        System.out.println("3. Hard (10 attempts)");
        System.out.print("Choose an option: ");

        int attempts = getAttemptsBasedOnDifficulty();


        int numberToGuess = generateRandomNumber();
        boolean guessedCorrectly = false;

        for (int i = attempts; i > 0; i = i-1) {
            System.out.print("Guess the unknown randomly generated 4-digit number. \nEnter the random 4-digit number (Attempts remaining: " + (i) + "):");
            String userGuess = scanner.nextLine();

            int[] feedback = getFeedback(userGuess, numberToGuess);
            int matches = feedback[0];
            int catches = feedback[1];
            
            //if guessed correctly, end game. If not, give feedback and continue.
            if (matches == 4) {
                System.out.println("Congratulations! You've guessed the correct number.");
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
		// TODO Auto-generated method stub for number of attempts remaining
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
            	System.out.println("Invalid choice. Defaulting to Easy (20 Attempts)");
                return 20; // Invalid
        }
    }

    // Get valid integer input from the user
    private static int getValidIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter exactly 4 digits.");
            }
        }
    }
}
