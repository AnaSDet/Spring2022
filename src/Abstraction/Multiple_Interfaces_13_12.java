package Abstraction;

public class Multiple_Interfaces_13_12 {
    public static void main(String[] args) { //1.

    Product1 product1 = new OnlineProduct(); //10.
    Shipping product2 = new OnlineProduct(); //11.
    Payment product3 = new OnlineProduct();  //12.

     OnlineProduct product4 = new OnlineProduct(); //13.
     product4.displayInfo();

    }
}
 interface Product1 { //2.
   void displayInfo(); //6. abstract method
 }
 interface Shipping { //3.
    void calculateShipping(); //7.
 }

 interface Payment{ //4.
    void processPayment(); //8.
 }

 //concrete class
class OnlineProduct implements Product1, Shipping, Payment { //5

    //9. generate -> override method (choose displayInfo, CalculateShipping<processPayment)
     @Override
     public void displayInfo() {

     }

     @Override
     public void calculateShipping() {

     }

     @Override
     public void processPayment() {

     }
 }