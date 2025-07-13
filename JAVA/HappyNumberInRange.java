import java.util.Scanner;

public class HappyNumberInRange {
    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Method to check if a number is happy
    public static boolean isHappy(int num) {
        int slow = num, fast = num;

        do {
            slow = sumOfSquares(slow); // Move one step
            fast = sumOfSquares(sumOfSquares(fast)); // Move two steps
        } while (slow != fast);

        return slow == 1; // If slow and fast meet at 1, it's a Happy Number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Happy Numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
 