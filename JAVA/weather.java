public import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the temperature
        System.out.print("Enter the temperature in degrees Celsius: ");
        double temperature = scanner.nextDouble();

        // Determine the weather condition based on temperature
        if (temperature < 0) {
            System.out.println("It's freezing cold! Stay warm.");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("It's cold. Wear a jacket.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("The weather is pleasant. Enjoy your day!");
        } else if (temperature > 25 && temperature <= 35) {
            System.out.println("It's warm. Stay hydrated.");
        } else {
            System.out.println("It's hot! Stay cool and avoid direct sunlight.");
        }

        scanner.close();
    }

}
   

