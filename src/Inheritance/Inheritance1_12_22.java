package Inheritance;
public class Inheritance1_12_22 {
//1. create a main method
    public static void main(String[] args) {
//4.create checkingAccount object
CheckingAccount3 account = new CheckingAccount3(55454L,  //16. in parentheses, we need to give value for accountNum
        30.00); //26.adding monthlyFee
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

//19.
CheckingAccount3 ac2 = new CheckingAccount3(129.00, 785958L, 15.00); //27.adding monthlyFee
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAccountNumber());

//just to separate
System.out.println("=============================");

//28. printing out monthlyFee for 1st account
        System.out.println(account.getMonthlyFee()); //for the first account
//30. apply monthlyFee
        account.applyMonthlyFee();
        System.out.println(account.getBalance());
//28.
        System.out.println(ac2.getMonthlyFee()); //for the second account
//30. apply MonthlyFee for 2nd account
        ac2.applyMonthlyFee();
        System.out.println(ac2.getBalance());
    }
}
//2. create a PARENT(superclass) class. instance variables
class BankAccount3{
    private double balance; //encapsulation method. we can't update the balance. but we have access to the value to update and read the balance, and we do it through the methods
//6. create a final, to make sure that we initialize that acc num only once
    private final long accountNumber;

//14. create a constructor that modifies a private parameter
    public BankAccount3(long accountNumber) {
        this.accountNumber = accountNumber;
    }
//17. create a constructor
    public BankAccount3(double balance, long accountNumber){
        this(accountNumber); //initializing account number
        this.balance = balance;
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
class CheckingAccount3 extends BankAccount3{ //our CheckingAccount became class of BankAccount,and now they're related
//20.
    private double monthlyFee;

//13. create a constructors in the CheckingAccount
    public CheckingAccount3(long accountNum, double monthlyFee){  //21. add monthlyFee after accountNum
//15. we need to call constructor in our parent class that we created(step 14) on line 29 using a super() method
        super(accountNum);
        this.monthlyFee = monthlyFee; //22.

    }
//18. crete
public CheckingAccount3(double balance, long accountNum, double monthlyFee){ //23. add monthlyFee after accountNum
  super(balance, accountNum); //we are calling the step 17
    this.monthlyFee = monthlyFee; //24.
    }
//25. create a GETTER method
    public double getMonthlyFee(){
        return monthlyFee;
    }

//29.
public void applyMonthlyFee(){
withdraw(monthlyFee);
}
 }

