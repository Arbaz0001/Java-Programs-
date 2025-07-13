import java.util.Scanner;

public class DisariumNumber {
    // Function to calculate the number of digits in the number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Function to check if a number is a Disarium number
    public static boolean isDisarium(int num) {
        int sum = 0;
        int temp = num;
        int digits = countDigits(num);

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits--);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Disarium number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }

        scanner.close();
    }
}
