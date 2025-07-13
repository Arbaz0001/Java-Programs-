import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Read the number from the user
        double num = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
