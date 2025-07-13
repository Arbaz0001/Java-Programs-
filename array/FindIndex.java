import java.util.Scanner;

public class FindIndex {
    public static int getIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
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

        // Taking the target element input
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Finding the index
        int index = getIndex(numbers, target);
        if (index != -1) {
            System.out.println("Index of " + target + ": " + index);
        } else {
            System.out.println(target + " is not present in the array.");
        }

        sc.close();
    }
}
