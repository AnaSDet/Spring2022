package Inheritan_Overriding;

public class BankAccount_13_1_version4 {
    public static void main(String[] args) {    //1. create a main method
//4.create checkingAccount object
    CheckingAccount4 account = new CheckingAccount4(55454L,  //16. in parentheses, we need to give value for accountNum
                30.00); //26.adding monthlyFee
        account.setBalance(20);  // --> object
        System.out.println(account.getBalance()); //20.0
//8. Get updated balance
        System.out.println(account.getAccountNumber()); //0 (because we updated our balance on line 19)

//11. let's deposit some money to our account, and then we will see updated amount after depositing money
        account.deposit(500);
        System.out.println(account.getBalance()); //520.0 (calculates deposit + balance)

        account.withdraw(200);//12. let's withdraw some money from our account
        System.out.println(account.getBalance()); //320.0 (step 11 - minus step 12)

//19.
    CheckingAccount4 ac2 = new CheckingAccount4(129.00, 785958L, 15.00); //27.adding monthlyFee
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAccountNumber());

System.out.println("==============================================================================");//just to separate

        System.out.println(account.getMonthlyFee()); //28. printing out monthlyFee for 1st account
        account.applyMonthlyFee();//30. apply monthlyFee for the first account
        System.out.println(account.getBalance());

        System.out.println(ac2.getMonthlyFee()); ////28.for the second account
        ac2.applyMonthlyFee();//30. apply MonthlyFee for 2nd account
        System.out.println(ac2.getBalance());
System.out.println("===========================Method Overriding=============================");//just to separate
   CheckingAccount4 ac3 = new CheckingAccount4(5000, 25546546l, 20.00);//34.
   ac3.withdraw(900);
   System.out.println(ac3.getBalance()); //4100.0
   ac3.withdraw(400);
   System.out.println(ac3.getBalance());//You reached your daily limit you can withdraw 100.0
    }
}
class BankAccount4{//2. create a PARENT(superclass) class. instance variables
    private double balance; //encapsulation method. we can't update the balance. but we have access to the value to update and read the balance, and we do it through the methods

    private final long accountNumber;//6. create a final, to make sure that we initialize that acc num only once


    public BankAccount4(long accountNumber) {//14. create a constructor that modifies a private parameter
        this.accountNumber = accountNumber;
    }

    public BankAccount4(double balance, long accountNumber){  //17. create a constructor
        this(accountNumber); //initializing account number
        this.balance = balance;
    }


    public double getBalance() {    //5. create getter and setter for balance
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() { //7. create a Getter method for long
        return accountNumber;
    }

    public  void withdraw(double amount){ //9. creating withdraw method
        balance -= amount;
    }

    public void deposit(double amount){  //10. creating deposit method
        balance += amount;
    }
}
//3. create a CHILD (subclass) class
//in order to create a relationship between parent and child class we have to EXTEND keyword.
//when a class extends from another class the child class inherits(takes) all public and default instance variables
//and public nd default methods
class CheckingAccount4 extends BankAccount4 { //our CheckingAccount became class of BankAccount,and now they're related

    private double monthlyFee;  //20.

    private double dailyWithdrawalAmount; //32.

    //13. create a constructors in the CheckingAccount
    public CheckingAccount4(long accountNum, double monthlyFee) {  //21. add double monthlyFee after accountNum
//15. we need to call constructor in our parent class that we created(step 14)
        super(accountNum);
        this.monthlyFee = monthlyFee; //22.

    }

    //18. crete
    public CheckingAccount4(double balance, long accountNum, double monthlyFee) { //23. add monthlyFee after accountNum
        super(balance, accountNum); //we are calling the step 17
        this.monthlyFee = monthlyFee; //24.
    }

    //25. create a GETTER method
    public double getMonthlyFee() {
        return monthlyFee;
    }

    //29.
    public void applyMonthlyFee() {
        withdraw(monthlyFee);
    }

    //31.the users can only withdraw $1000 per day
    @Override
    public void withdraw(double amount) { //look at step 9. it has to be written the same way for Overriding method
        if (dailyWithdrawalAmount + amount > 1000) {//33.
            System.out.println("You reached your daily limit you can withdraw " + (1000 - dailyWithdrawalAmount));
        } else {
            setBalance(getBalance() - amount);
            dailyWithdrawalAmount += amount;
        }
    }
}



