import java.util.Scanner;

public class numberordigit
 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.println("Enter a value:");

        // Read the input as a string
        String input = scanner.nextLine();

        // Check if the input is a single digit
        if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
            System.out.println("The entered value is a digit.");
        }
        // Check if the input is an integer
        else {
            try {
                Integer.parseInt(input);
                System.out.println("The entered value is an integer.");
            } catch (NumberFormatException e) {
                System.out.println("The entered value is neither a digit nor an integer.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

