package Inheritance;
public class Inheritance1_12_17 {

//1. create a main method
    public static void main(String[] args) {
//4.create checkingAccount object
    CheckingAccount account = new CheckingAccount();
    account.setBalance(20);
    System.out.println(account.getBalance());
    }
}
//2. create a PARENT(superclass) class. instance variables
    class BankAccount{
    private double balance;    //encapsulation method. we can't update the balance (line 8). but we have access to
    // the value to update and read the balance, and we do it through the methods

//5. create getter and setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
//3. create a CHILD (subclass) class
//in order to create a relationship between parent and child class we have to EXTEND keyword.
//when a class extends from another class the child class inherits(takes) all public and default instance variables
//and public nd default methods
    class CheckingAccount extends BankAccount{ //our CheckingAccount became class of BankAccount,and now they're related

}
