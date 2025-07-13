import java.util.*;

 class amera {
     String brand;
     int pixels;

    // Constructor to initialize brand and pixels
    public Camera(String brand, int pixels) {
        this.brand = brand;
        this.pixels = pixels;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for pixels
    public int getPixels() {
        return pixels;
    }

    // Setter for pixels
    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    // Method to display camera details
    public void displayCameraDetails() {
        System.out.println("Camera Brand: " + brand);
        System.out.println("Camera Pixels: " + pixels + " MP");
    }

    // Main method to test the Camera class
    public static void main(String[] args) {
        // Create an instance of Camera
        Camera myCamera = new Camera("Canon", 24);

        // Display the camera details
        myCamera.displayCameraDetails();

        // Modify the camera's brand and pixels
        myCamera.setBrand("Nikon");
        myCamera.setPixels(36);

        // Display the updated camera details
        myCamera.displayCameraDetails();
    }
}
