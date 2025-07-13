import java.util.Scanner;

public class InsertElementAtIndex {
    // Method to insert an element at the specified index
    public static int[] insertElement(int[] arr, int index, int element) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index.");
            return arr; // Return the array as it is if the index is invalid
        }

        int[] newArray = new int[arr.length + 1];

        // Copy elements before the specified index
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new element at the specified index
        newArray[index] = element;

        // Copy elements after the specified index
        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
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

        // Input index and element to insert
        System.out.print("Enter the index to insert the element: ");
        int index = sc.nextInt();
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        // Inserting the element and getting the new array
        arr = insertElement(arr, index, element);

        // Printing the updated array
        System.out.print("Updated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
     