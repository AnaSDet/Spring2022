package OOP_InheritanceInJava;

public class Phone_12_7 {
    public static void main(String[] args) {

    }
}
class Phone {
    private String brand;
    private String model;
    private int price;
    public Phone() {
        // Default constructor initializes variables with default values
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        }
    }
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }
    public void increasePrice(int amount) {
        if (amount >= 0) {
            price += amount;
            System.out.println("Price increased by " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
}
