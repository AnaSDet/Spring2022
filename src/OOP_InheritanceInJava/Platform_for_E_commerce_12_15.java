package OOP_InheritanceInJava;

import java.util.ArrayList;

public class Platform_for_E_commerce_12_15 {
    public static void main(String[] args) {

    }
}
class Product {
    private static int nextId = 1;
    private int productId;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
        this.productId = nextId++; //(generated automatically starting from 1)
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Price cannot be negative.");
        }
    }
}

class Customer2 {
    private static int nextId = 1;
    private int customerId; //(generated automatically starting from 1)
    private String name;
    private String email; //Should match format (contains string, then '@', then some string, then '.', and then some string)

    public Customer2(String name, String email) {
        this.name = name;
        setEmail(email);
        this.customerId = nextId++; //(generated automatically starting from 1)
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }
}

class Order {
    private static int nextId = 1;
    private int orderId;// (generated automatically starting from 1)
    private Customer customer;
    private ArrayList<Product> products; // a list of products in the order

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = nextId++; //(generated automatically starting from 1)
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                products.remove(i);
                break; // Exit the loop once the product is removed
            }
        }
    }

    public double getTotalPrice() { //method that calculates and returns the total price of the order.
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Customer getCustomer() { //a method that returns the customer associated with the order.
        return customer;
    }

    public void setCustomer(Customer customer) { //a method that sets the customer for the order
        this.customer = customer;
    }
}
