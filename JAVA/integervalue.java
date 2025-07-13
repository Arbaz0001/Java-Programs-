import java.util.Scanner;

public class integervalue
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer value from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Checking if the number is a two-digit integer
        if (number >= 10 && number <= 99 || number <= -10 && number >= -99) {
            System.out.println("The number is a two-digit integer.");
        } else {
            System.out.println("The number is not a two-digit integer.");
        }

        scanner.close();
    }
}

