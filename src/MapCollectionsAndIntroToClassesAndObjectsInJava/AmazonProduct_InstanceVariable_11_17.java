package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class AmazonProduct_InstanceVariable_11_17 {
// instance variables => are characteristics of an object/properties of a class.
// instance variables are variables defined on class level(scope-the scopes are defined by curly braces).
// They have default values.
//    name
    String name;
    double price;
    String description;
  }

    class Main1 {
    public static void main(String[] args) {
    AmazonProduct_InstanceVariable_11_17 iphone14 = new AmazonProduct_InstanceVariable_11_17();//we're creating object,
//        using a new key word, then we are assigning properties to this project (line 16-18)
       iphone14.name = "iphone14";
       iphone14.price = 999.99;
       iphone14.description = "256GB";

       System.out.println(iphone14.name);
       System.out.println(iphone14.price);
       System.out.println(iphone14.description);

       AmazonProduct_InstanceVariable_11_17 var = new AmazonProduct_InstanceVariable_11_17();
       var.name = "GooglePixel";
       var.price = 599.99;
       var.description = "Google it";

       System.out.println(var.name);
        System.out.println(var.price);
        System.out.println(var.description);


        }
    }