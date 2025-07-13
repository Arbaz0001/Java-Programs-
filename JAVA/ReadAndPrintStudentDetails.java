import java.util.Scanner;

public class ReadAndPrintStudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter your 10th percentage: ");
        double tenthPercentage = scanner.nextDouble();

        System.out.print("Enter your 12th percentage: ");
        double twelfthPercentage = scanner.nextDouble();

        System.out.print("Enter your degree percentage: ");
        double degreePercentage = scanner.nextDouble();

        // Printing the details
        System.out.println("\nName : " + name);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.printf("10th : %.2f\n", tenthPercentage);
        System.out.printf("12th : %.2f\n", twelfthPercentage);
        System.out.printf("Degree : %.2f\n", degreePercentage);

        scanner.close();
    }
}
