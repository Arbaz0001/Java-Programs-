public class Cake {

    // Fields for the Cake class
    private String flavor;
    private String shape;
    private double price; // Price in currency

    // Method to display cake details
    public void displayDetails() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Shape: " + shape);
        System.out.println("Price: $" + price);
    }

    // Method to initialize cake details
    public void initialize(String flavor, String shape, double price) {
        this.flavor = flavor;
        this.shape = shape;
        this.price = price;
    }

    public static void main(String[] args) {
        // Create and initialize first cake
        Cake chocolateCake = new Cake();
        chocolateCake.initialize("Chocolate", "Round", 15.99);
        chocolateCake.displayDetails();

        // Create and initialize second cake
        Cake vanillaCake = new Cake();
        vanillaCake.initialize("Vanilla", "Square", 12.49);
        vanillaCake.displayDetails();
    }
}
