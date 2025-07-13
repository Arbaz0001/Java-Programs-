import java.util.Scanner;

public class rectengel
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading length and breadth of the rectangle from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculating area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Printing the results
        System.out.printf("Area of the rectangle: %.2f\n", area);
        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);

        scanner.close();
    }
}

