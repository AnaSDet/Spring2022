package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Bar_Beverage_12_12 {
    public static void main(String[] args) {
        List<Beverage> beverages = new ArrayList<>();
        Beverage juice = new Beverage("Orange juice", 7.49);
        beverages.add(juice);

        Bar bar1 = new Bar("ABC Bar", beverages);

        Beverage beverage1 = new Beverage("Beer", 5.99);
        Beverage beverage2 = new Beverage("Wine", 9.99);

        Bar bar2 = new Bar("XYZ Bar", new ArrayList<>());
        bar2.addBeverage(beverage1);
        bar2.addBeverage(beverage2);

        System.out.println("Bar 1 Name: " + bar1.getName());
        System.out.println("Bar 2 Name: " + bar2.getName());
        System.out.println("Total Bars: " + Bar.getTotalBars());
        System.out.println("Total Beverages: " + Beverage.getTotalBeverages());

        bar1.addBeverage(beverage2);
        System.out.println();
        bar1.serveBeverages();
        System.out.println();
        bar2.serveBeverages();
    }
}

class Bar{
    private String name;
    private List<Beverage> beverages;
    private static int totalBars;
    public final int MAX_CAPACITY = 100;

    public Bar(String name, List<Beverage> beverages){
        this.name = name;
        this.beverages = beverages;
        totalBars++;
    }
    public void addBeverage(Beverage beverage){
        beverages.add(beverage);
    }
    public void serveBeverages(){
        System.out.println("Beverages available at " + name + ":");
        for (Beverage beverage : beverages) {
            System.out.println("- " + beverage.getName() + " ($" + beverage.getPrice() + ")");
        }
    }//: Displays the details of all the beverages available in the bar.

    public String getName(){
        return name;
    }//: Returns the name of the bar. Static Methods:

    public static int getTotalBars(){
        return totalBars;
    }//: Returns the total count of bars.
}
class Beverage{
    private String name;
    private double price;

    private static int totalBeverages;

    public final static double MAX_PRICE = 100.0;

    public Beverage(String name, double price){
        this.name = name;
        this.price = price;
        totalBeverages++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public static int getTotalBeverages(){
        return totalBeverages;
    }

}