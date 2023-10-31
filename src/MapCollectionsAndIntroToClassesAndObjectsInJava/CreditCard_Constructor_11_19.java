package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class CreditCard_Constructor_11_19 {
    public String cardNumber;
    public String cardHolderName;
    public double creditLimit;
    public double currentBalance;
    public boolean isBlocked;

    public CreditCard_Constructor_11_19() {
    System.out.println("Hello from Constructor");
    }
}

class Main8 {
    public static void main(String[] args) {
        CreditCard_Constructor_11_19 var = new CreditCard_Constructor_11_19();
        var.cardNumber = "3254467";
        var.cardHolderName = "Sasha Duachenko";
        var.creditLimit = 17.000;
        var.currentBalance = 100.31;
        var.isBlocked = false;

        System.out.println(var.cardNumber);
        System.out.println(var.cardHolderName);
        System.out.println(var.creditLimit);
        System.out.println(var.currentBalance);
        System.out.println(false);

    }
}