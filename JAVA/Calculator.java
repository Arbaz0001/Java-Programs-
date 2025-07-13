import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers and an operator
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter an operator
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Perform the operation based on the operator
        double result = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                validOperator = false;
        }

        // If the operator is valid, print the result
        if (validOperator) {
            System.out.println("The result is: " + result);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

