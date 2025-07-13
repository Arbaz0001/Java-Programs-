import java.util.Scanner;

public class validatemonth
 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.println("Enter a month number (1-12):");

        // Read the month number from the user
        int month = scanner.nextInt();

        // Check if the month number is valid
        if (month >= 1 && month <= 12) {
            System.out.println("The month number is valid.");
        } else {
            System.out.println("The month number is invalid.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
