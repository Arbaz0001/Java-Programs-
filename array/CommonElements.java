import java.util.Scanner;
import java.util.HashSet;

public class CommonElements {
    // Method to return common elements between two arrays
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr1 to HashSet
        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Common elements: ");
        boolean found = false;
        
        // Check for common elements in arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No common elements found.");
        }

        System.out.println();
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

        // Finding and displaying common elements
        findCommonElements(arr1, arr2);

        sc.close();
    }
}
