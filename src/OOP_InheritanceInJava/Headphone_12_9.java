package OOP_InheritanceInJava;

public class Headphone_12_9 {
    public static void main(String[] args) {

    }
}
class Headphone {
    // Static Variables:
    private static String manufacturer;
    private static int totalHeadphones;

    // Instance Variables:
    private String model;
    private double price;
    private String color;
    private boolean isWireless;

    public Headphone() {
        ++totalHeadphones;
    }

    // Static Methods:
    // Returns the total count of headphones created.
    public static int getTotalHeadphones() {
        return totalHeadphones;
    }

    // Sets the manufacturer of the headphones.
    public static void setManufacturer(String manufacturer) {
        Headphone.manufacturer = manufacturer;
    }

    // Instance Methods:
    // Displays the details of the headphone, including the model, price, color, and wireless status.
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Wireless: " + isWireless);
    }

    // Sets the model of the headphone.
    public void setModel(String model) {
        this.model = model;
    }

    // Sets the price of the headphone.
    public void setPrice(double price) {
        this.price = price;
    }

    // Sets the color of the headphone.
    public void setColor(String color) {
        this.color = color;
    }

    // Sets the wireless status of the headphone
    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
      }
    }