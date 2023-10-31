package Inheritan_Overriding;

public class Cloth_13_6 {
    public static void main(String[] args) {

    }
}
class Cloth {
    private String brand;
    private double price;

    public Cloth(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }

    public final void wash() {
        System.out.println("Washing instructions: Gentle cycle, cold water");
    }
}

class TShirt extends Cloth {
    private String size;

    public TShirt(String brand, double price, String size) {
        super(brand, price);
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
    }
}