public class ArrayInsertion {
    
    // Method to insert array into a specified index
    public static int[] insertArray(int[] originalArray, int[] arrayToInsert, int index) {
        // Check if the index is valid
        if (index < 0 || index > originalArray.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        
        // Create a new array with the size of the original + the array to insert
        int[] newArray = new int[originalArray.length + arrayToInsert.length];
        
        // Copy elements before the insertion point
        System.arraycopy(originalArray, 0, newArray, 0, index);
        
        // Copy the array to be inserted
        System.arraycopy(arrayToInsert, 0, newArray, index, arrayToInsert.length);
        
        // Copy the remaining elements after the insertion point
        System.arraycopy(originalArray, index, newArray, index + arrayToInsert.length, originalArray.length - index);
        
        return newArray;
    }
    
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] arrayToInsert = {6, 7, 8};
        int index = 2;
        
        int[] resultArray = insertArray(originalArray, arrayToInsert, index);
        
        // Print the resulting array
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
