import java.util.*;

public class Marker {

    String brand;
    String colour;
    int price;
    

    public void detail(){
        System.out.println(brand);
        System.out.println(colour);
        System.out.println(price);
    }

    public void intilize(String brand, String colour, int price){
        this.brand = brand;
        this.colour = colour;
        this.price = price;

    }

    public static void main(String[] args) {
        Marker m1 = new Marker();
        m1.intilize("cello", "blue", 125);
        m1.detail();

        Marker m2 = new Marker();
        m2.intilize("camlin", "red", 10);
        m2.detail();



    }

}
