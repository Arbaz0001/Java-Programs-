import java.util.Scanner;

public class MergeSortedArrays {
    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge elements while both arrays have elements
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // If arr1 has remaining elements
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        // If arr2 has remaining elements
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second sorted array
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging the two sorted arrays
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Printing the merged sorted array
        System.out.println("Merged Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
