import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading side length of the square from the user
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculating area and perimeter
        double area = side * side;
        double perimeter = 4 * side;

        // Printing the results
        System.out.printf("Area of the square: %.2f\n", area);
        System.out.printf("Perimeter of the square: %.2f\n", perimeter);

        scanner.close();
    }
}

