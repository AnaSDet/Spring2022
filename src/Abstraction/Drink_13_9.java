package Abstraction;

public class Drink_13_9 {
    public static void main(String[] args) {
        Coffee c = new Coffee("Coffee", 2.99, "Strong");
        Juice j = new Juice("Juice", 1.99, "Orange");
        c.serve();
        j.serve();
        System.out.println(c.getName());
        System.out.println(c.getPrice());
        System.out.println(j.getName());
        System.out.println(j.getPrice());
    }
}

abstract class Drink {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void serve();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Coffee extends Drink {
    private String strength;

    public Coffee(String name, double price, String strength) {
        super(name, price);
        this.strength = strength;
    }

    @Override
    void serve() {
        System.out.println("Serving a cup of coffee");
    }

    public String getStrength() {
        return strength;
    }
}

class Juice extends Drink {
    private String flavor;

    public Juice(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    void serve() {
        System.out.println("Serving a glass of juice");
    }

    public String getFlavor() {
        return flavor;
    }
}
