import java.util.Scanner;

public class DeleteElementAtIndex {
    // Method to delete element at a specified index
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr; // Return the array as it is if the index is invalid
        }

        int[] newArray = new int[arr.length - 1];

        // Copy elements before the specified index
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        // Copy elements after the specified index
        for (int i = index + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the index to delete
        System.out.print("Enter the index to delete: ");
        int index = sc.nextInt();

        // Deleting element and getting the new array
        arr = deleteElement(arr, index);

        // Printing the updated array
        System.out.print("Updated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
  