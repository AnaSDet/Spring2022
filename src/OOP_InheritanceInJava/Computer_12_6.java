package OOP_InheritanceInJava;

public class Computer_12_6 {
    public static void main(String[] args) {

    }
}
class Computer{
    private String brand;
    private String model;
    private int year;
    private double price;

    //Constructor
    public Computer(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;

    }
    // Getter methods for brand, model, year, price
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    //Setter method for year and price
    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(double price){
        this.price = price;
    }
}

