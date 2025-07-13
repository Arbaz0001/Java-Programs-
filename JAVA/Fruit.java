public class Fruit {

    // Fields for the Fruit class
     String name;
     String color;
     double weight; // in grams

    // Method to display fruit details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
    }

    // Method to initialize fruit details
    public void initialize(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {
        // Create and initialize first fruit
        Fruit apple = new Fruit();
        apple.initialize("Apple", "Red", 180);
        apple.displayDetails();

        // Create and initialize second fruit
        Fruit banana = new Fruit();
        banana.initialize("Banana", "Yellow", 120);
        banana.displayDetails();
    }
}
