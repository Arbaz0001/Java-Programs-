import java.util.Scanner;

public class biggest
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

        // Find the largest number
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
