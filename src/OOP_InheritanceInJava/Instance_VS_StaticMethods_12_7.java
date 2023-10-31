package OOP_InheritanceInJava;

public class Instance_VS_StaticMethods_12_7 {
    public static void main(String[] args) {
//creating an object
BankAccount1 ba = new BankAccount1("ABC123");
ba.deposit(300);
ba.deposit(200);
System.out.println(ba.getAccountNumber()); //ABC123
System.out.println(ba.getBalance());


ba.withdraw(150);
System.out.println(ba.getBalance());


BankAccount1 ba2 = new BankAccount1("DEF456");
ba2.deposit(100000);
System.out.println(ba2.getAccountNumber()); //DEF456
System.out.println(ba2.getBalance());

ba2.withdraw(1000);
System.out.println(ba2.getBalance());

//static method.
// in order for us to access in static methods, we don't have to create an object.
//we just need to type the class name im MAIN method
        double interest= BankAccount1.calculateInterest(10000, 0.05, 2);
        System.out.println(interest);
    }
}

class BankAccount1{
    private String  accountNumber;
    private double balance;

    public BankAccount1(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    //STATIC METHOD
//   public static String getAccountNumber(){
//       return accountNumber;

    //INSTANCE METHOD
   //instance methods are the methods that belong to a specific instance
   //of a class. It means it belongs to an object
    //instance methods are declared without the static keyword
    //instance methods can access and manipulate instance variables.
    //To access(invoke,call) the instance methods we first have to create an object
    //Instance methods belong to only ONE SPECIFIC OBJECT.
    //Whatever we need to build method that will manipulate the state of
    //your object, that has to be an instance method.
    //Instance methods are used to either use the instance variables or manipulate the instance variables.
    //Instance variables is the state of the object in general, so we are manipulating the state of the object.
//Instance methods belong to a specific object, to a specific instance of a class instance.
//Instance methods are declared without a static keyword. Instance methods can access instance variables.

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount){
        balance += amount; //+= if we want to add and update deposit amount
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        balance -= amount; //-= if we want to take some money from our bank
    }

//static method.
//    this static method does nothing to do with above instance variable code
    public static double calculateInterest(double principal, double rate,int years){
        double interest = principal * rate * years;
        return interest;
    }
}