package Abstraction;

public class MultiLevel_Abstraction_13_10 {
    public static void main(String[] args) { //1.
  Product phone = new Electronics("Phone", 999.99, "Iphone 14");//25.
  Books books = new Books("American Character", 24.99, "Walter Issaccon"); //26.
     phone.getProductInfo(); //27.
     books.getProductInfo(); //28.

     System.out.println(phone.getProductType()); //29.
     System.out.println(phone.getProductType()); //30.

     System.out.println(phone.calculateShippingCost()); //31.
     System.out.println(books.calculateShippingCost()); //32.


    }
}
abstract class ShippingProvider { //2.
   public abstract double calculateShippingCost(); //3.

}
abstract class Product extends ShippingProvider{ //4. Abstract classes can have both abstract methods and regular instance methods
  private String name; //15.create properties for product class
  private double price; //16.

    //17.create a constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getProductType();//6.

    //concrete method
    public void getProductInfo(){ //13.
        System.out.println("Product name: " + name); //14.
        System.out.println("Price: " + price);
    }
}
//concrete class - non-abstract class
class Electronics extends Product{ //5.
    private String brand; //17.

 //18. create a constructor
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override //7.
   public double calculateShippingCost(){ //8.
    return 10.0;  //9.
   }
   @Override //10.
   public String getProductType(){ //11.
    return "Electronics"; //12.
   }
}
class Books extends Product{ //19.
private String author; //20.

    //21. create a constructor
    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
     //22 generate-> override methods -> getproductType():String  &  calculateShippingCost(): double
    @Override
    public double calculateShippingCost() {
        return 3.0; //23. change the cost of shipping
    }

    @Override
    public String getProductType() {
        return "Books"; // 24. change null on String
    }
}
