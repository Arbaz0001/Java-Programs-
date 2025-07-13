import java.util.Scanner;

public class smallest

 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter three integers:");

        // Read the three integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

