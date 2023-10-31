package OOP_InheritanceInJava;

public class Fruit_12_4 {
    public static void main(String[] args) {
        fruitCheck sc = new fruitCheck ("apple", 2, 1.29, true);
        System.out.println(sc.name);
    }
}
class fruitCheck{
    public String name;
    public int quantity;
    public double pricePerFruit;
    public boolean isOrganic;


    public fruitCheck(String name) {
        this(name, 0, 0.0, false);
    }

    // Constructor with two parameters
    public fruitCheck(String name, int quantity) {
        this(name, quantity, 0.0, false);
    }

    // Constructor with three parameters
    public fruitCheck(String name, int quantity, double pricePerFruit) {
        this(name, quantity, pricePerFruit, false);
    }

    // Constructor with four parameters
    public fruitCheck(String name, int quantity, double pricePerFruit, boolean isOrganic) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerFruit = pricePerFruit;
        this.isOrganic = isOrganic;
    }
}