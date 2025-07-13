import java.util.Scanner;

public class MinMaxDifference {
    public static int getDifference(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return max - min; // Difference of biggest and smallest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Taking array elements input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculating and displaying the difference
        int difference = getDifference(numbers);
        System.out.println("Difference between max and min: " + difference);

        sc.close();
    }
}
