import java.util.Scanner;

public class PrimeNumberCounter {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of elements input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Taking integer inputs
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Counting prime numbers
        int primeCount = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        // Displaying the count of prime numbers
        System.out.println("Total prime numbers: " + primeCount);

        sc.close();
    }
}
