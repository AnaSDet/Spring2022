package OOP_InheritanceInJava;

public class ConstructorChaining_12_4 {

    public static void main(String[] args) {
StudentCheckingAccount sc = new StudentCheckingAccount("Elon Musk",
        100000.00, "123456732", 2343544);

StudentCheckingAccount sc2 = new StudentCheckingAccount("Bill Gates", "1234536",
        2566736);
System.out.println(sc2.studentName);
System.out.println(sc.balance); // 0.0

        StudentCheckingAccount sc3 = new StudentCheckingAccount("Beyonce", "234543");
        System.out.println(sc3.studentName);
        System.out.println(sc3.routingNum);
    }
}


class StudentCheckingAccount{
    public String studentName;
    public double balance;
    public String accountNum;
    public int routingNum;


    public StudentCheckingAccount(String studentName, double balance,
                                  String accountNum, int routingNum){
        this.studentName = studentName;
        this.balance = balance;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
    }
    //in programming having a duplicate code is a bad practice
    //we should avoid it
    //creating a new constructor overloading

//public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
//    this.studentName = studentName;
//    this.accountNum = accountNum;
//    this.routingNum = routingNum;
//
//    }
    //this() - this with parenthesis
    //what is the difference between this and this() keywords in Java?
    //this --> keyword helps us access the instance variables. We use it in constructors to differentiate between
// the instants  variables in the constructor parameters to avoid name redundancy
//    this() --> helps you access and use the other constructors in this class
//    this() keyword enable you to use constructor chaining
    //Constructor chaining is when you are calling one constructor from another.
    public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
this(studentName, 0.0, accountNum,routingNum);
    }

    // 2566736 - default routing num.
    public StudentCheckingAccount(String studentName, String accountNum){
this(studentName, accountNum, 2566736);

    }
}