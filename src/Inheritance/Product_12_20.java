package Inheritance;

public class Product_12_20 {
    public static void main(String[] args) {

    }
}
class Product{
    private String name;
    private double price;
    private int quantity;
    private String description;
    private  boolean isAvailable = true;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
}
class Book extends Product{
    private String author;
    private String genre;
    private int pageCount;
    private int publicationYear;
    private double rating;
    public Book(String name, double price, String author, String genre) {
        super(name, price);
        this.author = author;
        this.genre = genre;
    }
    public Book(String name, double price, String author, String genre, int pageCount) {
        super(name, price);
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }
    public Book(String name, double price, String author, String genre, int pageCount, int publicationYear) {
        super(name, price);
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getPageCount() {
        return pageCount;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public double getRating() {
        return rating;
    }
}
class Clothing extends Product{
    private  String size;
    private String material;
    private String color;
    private String gender;
    private boolean isWashable = true;
    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size  = size;
        this.material = material;
    }
    public Clothing(String name, double price, String size, String material, String color) {
        super(name, price);
        this.size = size;
        this.material = material;
        this.color = color;
    }
    public Clothing(String name, double price, String size, String material, String color, String gender) {
        super(name, price);
        this.size = size;
        this.material = material;
        this.color = color;
        this.gender = gender;
    }
    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public boolean isWashable() {
        return isWashable;
    }
}
class Electronics extends  Product{
    private String brand;
    private int warrantyPeriod;
    private  boolean hasBattery;
    private  boolean isPortable;
    private String[] connectivityOptions;
    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    public Electronics(String name, double price, String brand, int warrantyPeriod, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
        this.hasBattery = hasBattery;
    }
    public Electronics(String name, double price, String brand, int warrantyPeriod, boolean hasBattery, boolean isPortable) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
        this.hasBattery = hasBattery;
        this.isPortable = isPortable;
    }
    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public boolean hasBattery() {
        return hasBattery;
    }
    public boolean isPortable() {
        return isPortable;
    }
    public String[] getConnectivityOptions() {
        return connectivityOptions;
    }
}
class Food extends Product{
    private  String expirationDate;
    private boolean isVegetarian;
    private String[] allergens;
    private  boolean isOrganic;
    private boolean isGlutenFree;
    public Food(String name, double price, String expirationDate, boolean isVegetarian) {
        super(name, price);
        this.expirationDate = expirationDate;
        this.isVegetarian = isVegetarian;
    }
    public Food(String name, double price, String expirationDate, boolean isVegetarian, String[] allergens) {
        super(name, price);
        this.expirationDate = expirationDate;
        this.isVegetarian = isVegetarian;
        this.allergens = allergens;
    }
    public Food(String name, double price, String expirationDate, boolean isVegetarian, String[] allergens, boolean isOrganic) {
        super(name, price);
        this.expirationDate = expirationDate;
        this.isVegetarian = isVegetarian;
        this.allergens = allergens;
        this.isOrganic = isOrganic;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public String[] getAllergens() {
        return allergens;
    }
    public boolean isOrganic() {
        return isOrganic;
    }
    public boolean isGlutenFree() {
        return isGlutenFree;
    }
}
