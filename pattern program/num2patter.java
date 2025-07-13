public class num2patter {
    public static void main(String[] args) {
        int rows =5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
    
            // Print the ascending numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
    
            // Print the descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
    
            // Move to the next line
            System.out.println();
        }
    }
    }
}
