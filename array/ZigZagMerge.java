import java.util.Scanner;

public class ZigZagMerge {
    // Method to merge two arrays in zig-zag order
    public static int[] mergeZigZag(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge elements in zig-zag order
        while (i < n1 && j < n2) {
            result[k++] = arr1[i++];
            result[k++] = arr2[j++];
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

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging arrays in zig-zag order
        int[] mergedArray = mergeZigZag(arr1, arr2);

        // Printing merged array
        System.out.println("Merged Zig-Zag Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
