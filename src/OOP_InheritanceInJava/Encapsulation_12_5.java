package OOP_InheritanceInJava;


public class Encapsulation_12_5 {
    public static void main(String[] args) {
     ChaseCheckingAccount c1 = new ChaseCheckingAccount("Askar", "28736473829",
             1234465, 1000000.00);
//     System.out.println(c1.accountNum);

System.out.println(c1.getAccountNum());
System.out.println(c1.getRoutingNum());
System.out.println(c1.getName());
System.out.println(c1.getBalance());


//
////SETTER
//c1.setAccountNum("0000000");
//System.out.println(c1.getAccountNum());

c1.setBalance(200000.00);
System.out.println(c1.getBalance());


c1.setRoutingNum(85190017);
System.out.println(c1.getRoutingNum());
    }
}

class ChaseCheckingAccount{
    public String name;
    //making instance variables private makes sure you can not access those variables to read or modify
    //its values outside the current class.
    private String accountNum;
    private int routingNum;
    public double balance;

    public ChaseCheckingAccount(String name, String accountNum, int routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }
// getter and Setter methods.
//    getter method helps you read the values of private instance variables
//    setter method helps you the value of your private instance variable
//each instance variable should have a getter and a setter most of the times

     //GETTER
//    getter and setter methods always must be public
     public String getAccountNum(){
        return accountNum;
     }
     public int getRoutingNum(){
        return routingNum;
     }
     public String getName(){
        return name;
     }
     public double getBalance(){
        return balance;
     }

     //SETTER - helps you update private instance variables
    //setter methods must be void
    //must have 1 param with the same data type as the instance variable
    //the biggest benefit of SETTER method is that we can set logics that will
    //avoid assign unwanted values to our instance variables based on the business requirements


//    public void setAccountNum(String accountNum){
//     this.accountNum = accountNum;
//    }


    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Negative balance");
        }
    }
    public void setRoutingNum(int routingNum){
    if ((routingNum == 12345554) || (routingNum == 85190017)){
        this.routingNum = routingNum;
    }else{
        System.out.println("Number is outside our bank");
    }
    }
}