import java.util.Scanner;

public class evenodd
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Checking if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        scanner.close();
    }
}

