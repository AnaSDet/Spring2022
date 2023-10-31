package OOP_InheritanceInJava;

public class SavingsAccount_12_1 {
    public long accountNum;
    public String accountHolderName;
    public double balance;

//    constructors with params are used to initialize the value of instance variables.
    public SavingsAccount_12_1(long num, String name, double d){
     accountNum = num;
     accountHolderName = name;
     balance = d;
    }

    public SavingsAccount_12_1(){

    }

}

class Main8{
    public static void main(String[] args) {
        SavingsAccount_12_1 var = new SavingsAccount_12_1();
        var.accountNum = 123456789;
        var.accountHolderName = "Joe Doe";
        var.balance = 278000.00;

        System.out.println(var.accountNum);
        System.out.println(var.accountHolderName);
        System.out.println(var.balance);

        SavingsAccount_12_1 var2 = new SavingsAccount_12_1(444423445, "Elon Musk", 255.00);
        System.out.println(var2.accountNum);
        System.out.println(var2.accountHolderName);
        System.out.println(var2.balance);
    }
}