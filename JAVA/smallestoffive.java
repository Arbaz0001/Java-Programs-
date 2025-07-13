import java.util.Scanner;

public class smallestoffive {

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");
        int smallest = Integer.MAX_VALUE; // Initialize with the largest possible value

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int num = scanner.nextInt();
            
            // Update smallest if the current number is smaller
            if (num < smallest) {
                smallest = num;
            }
        }

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
