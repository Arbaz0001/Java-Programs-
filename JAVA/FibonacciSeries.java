 import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + terms + " terms:");
            printFibonacci(terms);
        }

        scanner.close();
    }

    // Function to print the Fibonacci series
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
 
    

