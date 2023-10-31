package Inheritance;

public class Inheritance1_12_20 {
    //1. create a main method
    public static void main(String[] args) {
//4.create checkingAccount object
        CheckingAccount2 account = new CheckingAccount2(55454l); //16. in parentheses, we need to give value for accountNum
        account.setBalance(20);  // --> object
        System.out.println(account.getBalance()); //20.0
//8. Get updated balance
        System.out.println(account.getAccountNumber()); //0 (because we updated our balance on line 19)

//11. let's deposit some money to our account, and then we will see updated amount after depositing money
        account.deposit(500);
        System.out.println(account.getBalance()); //520.0 (calculates line 9 and line 14)

//12. let's withdraw some money from our account
        account.withdraw(200);
        System.out.println(account.getBalance()); //320.0 (line 14 minus line 18)
    }
}
//2. create a PARENT(superclass) class. instance variables
class BankAccount2{
    private double balance; //encapsulation method. we can't update the balance (line 8). but we have access to the value to update and read the balance, and we do it through the methods
    //6. create a final, to make sure that we initialize that acc num only once
    private final long accountNumber;

//14. create a constructor that modifies a private parameter on line 26
    public BankAccount2(long accountNumber){
    this.accountNumber = accountNumber;
    }

//5. create getter and setter for balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
//7. create a Getter method for long
    public long getAccountNumber() {
        return accountNumber;
    }
//9. creating withdraw method
    public  void withdraw(double amount){
        balance -= amount;
    }
//10. creating deposit method
    public void deposit(double amount){
        balance += amount;
    }
}
//3. create a CHILD (subclass) class
//in order to create a relationship between parent and child class we have to EXTEND keyword.
//when a class extends from another class the child class inherits(takes) all public and default instance variables
//and public nd default methods
class CheckingAccount2 extends BankAccount2{ //our CheckingAccount became class of BankAccount,and now they're related

//13. create a constructors in the CheckingAccount
    public CheckingAccount2(long accountNum){
//15. we need to call constructor in our parent class that we created(step 14) on line 29 using a super() method
    super(accountNum);
    }
}

