public class AC {
    private String brand;
    private double capacity; // Capacity in tons
    private double price;    // Price in currency units

    // Parameterized constructor to initialize the attributes
    public AC(String brand, double capacity, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    // Method to display AC details
    public void displayACDetails() {
        System.out.println("AC Brand: " + brand);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Price: $" + price);
    }

    // Main method to test the AC class
    public static void main(String[] args) {
        // Create an instance of AC
        AC myAC = new AC("Samsung", 1.5, 35000);

        // Display the AC details
        myAC.displayACDetails();

        // Create another instance of AC
        AC anotherAC = new AC("LG", 2.0, 45000);

        // Display the details of another AC
        anotherAC.displayACDetails();
    }
}
