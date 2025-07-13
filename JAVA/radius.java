import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading radius of the circle from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculating area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Printing the results
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        scanner.close();
    }
}

