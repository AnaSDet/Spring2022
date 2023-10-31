package OOP_InheritanceInJava;

public class Product_12_2 {
 public String name;
 public double price;
 public int quantity;

//    // Default constructor
//    public Product_12_2() {
//        this.name = "Unknown";
//        this.price = 0.0;
//        this.quantity = 0;
//    }

    // Constructor with name and price
    public Product_12_2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Constructor with name, price, and quantity
    public Product_12_2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

