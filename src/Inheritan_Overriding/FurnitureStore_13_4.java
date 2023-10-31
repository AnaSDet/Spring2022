package Inheritan_Overriding;

public class FurnitureStore_13_4 {
    public static void main(String[] args) {

        Sofa[] sofas = new Sofa[3];
        sofas[0] = new SofaBed("Sofa Bed", 1000.00);
        sofas[1] = new SofaSet("Sofa Set", 2000.00);
        sofas[2] = new SofaBed("Sofa Bed", 1500.00);

        double totalPrice = calculateTotalPrice(sofas);
        System.out.println("Total price of all sofas: $" + totalPrice);
    }

    public static double calculateTotalPrice(Sofa[] sofas) {
        double total = 0;
        for (Sofa sofa : sofas) {
            total += sofa.getPrice();
        }
        return total;
    }
}

class Sofa {
    private String type;
    private double price;

    public Sofa(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class SofaBed extends Sofa {
    public SofaBed(String type, double price) {
        super(type, price);
    }
}

class SofaSet extends Sofa {
    public SofaSet(String type, double price) {
        super(type, price);
    }
}
