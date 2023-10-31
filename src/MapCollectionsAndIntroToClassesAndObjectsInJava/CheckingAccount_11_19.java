package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class CheckingAccount_11_19 {
    public long accountNumber;
    public int routingNumber;
    public String accountHolderName;
    public String address;

//    What is Constractor?
//    Constructor is a part of the code that allows you to create an object.
//    Every CLASS has a Constructor.
//    If you don't create a constructor explicitly, then JAVA adds a default constructor into your class.

//What is DEFAULT constructor?
// is a constructor that has empty params.

    public CheckingAccount_11_19() {
// It's okay to write code inside constructor
        System.out.println("Hello I'm a constructor");
    }
}
//   what are the rules for creating a constructor?
//    1. Initializes an Object
//    2. Cannot be called like methods
//    3. Are called automatically asap objects gets created
//    4. Don't have any return type(even void)
//    5. Name is same as that of "Class Name"
//    6. Could accept parameters

class Main7{
    public static void main(String[] args) {
        CheckingAccount_11_19 var = new CheckingAccount_11_19();

    }
}
