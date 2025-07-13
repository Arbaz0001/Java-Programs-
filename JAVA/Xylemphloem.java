import java.util.Scanner;

public class Xylemphloem {
    // Method to check if a number is Xylem or Phloem
    public static void checkXylemPhloem(int num) {
        String numStr = String.valueOf(num); // Convert number to string
        int n = numStr.length();

        // Extract outer and inner digits
        int firstDigit = Character.getNumericValue(numStr.charAt(0));
        int lastDigit = Character.getNumericValue(numStr.charAt(n - 1));
        int outerSum = firstDigit + lastDigit;

        int innerSum = 0;
        for (int i = 1; i < n - 1; i++) {
            innerSum += Character.getNumericValue(numStr.charAt(i));
        }

        // Determine if Xylem or Phloem
        if (outerSum > innerSum) {
            System.out.println(num + " is a Xylem Number.");
        } else {
            System.out.println(num + " is a Phloem Number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if it's Xylem or Phloem
        checkXylemPhloem(number);

        scanner.close();
    }
}
