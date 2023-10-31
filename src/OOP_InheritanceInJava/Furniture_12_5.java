package OOP_InheritanceInJava;

public class Furniture_12_5 {
    private boolean type;

    public Furniture_12_5(String couch, double v, String cotton, String ikea) {
    }

    public static void main(String[] args) {
    Furniture_12_5 sc = new Furniture_12_5("Couch", 1999.99, "Cotton", "IKEA");
    System.out.println(sc.getType());
    }

    private boolean getType() {
        return type;
    }
}
class Furniture{
    public String type;
    public double price;
    private String material;
    private String brand;

    public Furniture(String type, double price, String material, String brand){
        this.type = type;
        this.price = price;
        this.material = material;
        this.brand = brand;
    }

      //GETTER
    public String getType(){
     return type;
    }
    public double getPrice(){
     return price;
    }
    public String getMaterial(){
        return material;
    }
    public String getBrand(){
        return brand;
    }
}