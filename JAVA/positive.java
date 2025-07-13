import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Printing the number in positive format
        int positiveNumber = Math.abs(number);
        System.out.println("The positive format of the number is: " + positiveNumber);

        scanner.close();
    }
}

