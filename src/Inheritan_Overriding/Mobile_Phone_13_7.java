package Inheritan_Overriding;

public class Mobile_Phone_13_7 {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Apple", "14 PRO MAX", 999.99, 2022);
        System.out.println(m.toString());
    }
}
class MobilePhone {
    public static int lastId;
    public int id;
    public String brand;
    public String model;
    public double price;
    public int year;

    public MobilePhone(String brand, String model, double price, int year) {
        this.id = lastId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MobilePhone:\nbrand = " + brand + ",\nmodel = " + model + ",\nprice = " + price + "$,\nyear = " + year ;

    }
}
