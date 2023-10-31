package Inheritan_Overriding;

public class Cement_13_6 {
    public static void main(String[] args) {

    }
}
class CementBag {
    private String productName;
    private double price;

    public CementBag(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + productName);
        System.out.println("Price per Bag: $" + price);
    }

    public void use() {
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}

class ConcreteMix {
    private String productName;
    private double price;
    private String grade;

    public ConcreteMix(String productName, double price, String grade) {
        this.productName = productName;
        this.price = price;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Brand: " + productName);
        System.out.println("Price per Bag: $" + price);
        System.out.println("Strength Grade: " + grade);
    }

    public void use() {
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}
