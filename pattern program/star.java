// class star{
//     public static void main(String[] args) {
        
//     int n = 5;
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=n; j++){
//             System.err.println("*");
//         }
//         System.err.println("");
//     }
//   }
// }

public class star {
    public static void main(String[] args) {
        // Number of rows and columns
        int rows = 3;
        int columns = 6;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("*"); // Print star on the same line
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
