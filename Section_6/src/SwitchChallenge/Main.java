package SwitchChallenge;

/**
 * This class demonstrates the use of a switch-case statement to map
 * characters to their corresponding NATO phonetic alphabet words.
 * <p>
 * Example:
 * - 'A' → "Able"
 * - 'B' → "Baker"
 * - Default case handles unmapped characters.
 *
 * @author Moataz-Elhawary
 * @version 1.0
 * @since 2025-04-25
 */

public class Main {

    /**
     * Entry point of the program. Demonstrates a switch-case statement
     * for NATO phonetic alphabet lookup.
     *
     * @param args Command-line arguments (unused in this example).
     */
    public static void main(String[] args) {


//        char characterVariable = 'X';       // Test character to evaluate
        char characterVariable = 'A';       // Test character to evaluate


        switch (characterVariable) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            // Handles unmapped characters
            default:
                System.out.println("letter " + characterVariable + " was not found in the switch!");
                break;
        }
    }
}

