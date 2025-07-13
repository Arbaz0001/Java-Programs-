public class Factorial {
    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        int number = 5;  // Fixed input value
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
