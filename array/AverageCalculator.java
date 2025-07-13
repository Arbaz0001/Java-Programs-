import java.util.Scanner;

public class AverageCalculator {
    // Method to calculate the average of an array
    public static double getAverage(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length; // Calculate average
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of elements input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculating and displaying the average
        double average = getAverage(numbers);
        System.out.println("Average of array elements: " + average);

        sc.close();
    }
}
