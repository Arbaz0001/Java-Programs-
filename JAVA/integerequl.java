import java.util.Scanner;

public class integerequl
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integer values from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Checking if the two integers are equal
        if (num1 == num2) {
            System.out.println("The two integers are equal.");
        } else {
            System.out.println("The two integers are not equal.");
        }

        scanner.close();
    }
}

