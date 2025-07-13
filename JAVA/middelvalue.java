import java.util.Scanner;

public class middelvalue
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading three integer values from the user
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        // Finding the middle value
        int middle;
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            middle = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            middle = num2;
        } else {
            middle = num3;
        }

        // Printing the middle value
        System.out.println("The middle value is: " + middle);

        scanner.close();
    }
}

