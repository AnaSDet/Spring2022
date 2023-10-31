package Inheritance;

public class Constructors_In_Inheritance_12_19 {
//1. create a main method
public static void main(String[] args) {
//9.we are calling no default parameter constructor class here. it supposes to print out lines 17 and 28
    SubClass obj = new SubClass();
//10. let's create another Subclass but this time we will provide parameters
    SubClass obj2 = new SubClass(2, " Hey"); // we are calling constructor Subclass from line 33
//12. let's create another object
    SubClass obj3 = new SubClass(" Hey"); // calling line 40
   }
}
//2. create a parent class. every class has implicit default constructor with no arguments
class Superclass{
   public Superclass(){ //4. public default superclass constructor
   System.out.println("Default constructor from parent class");
   }
//6.
   public Superclass(int a, String b){
       System.out.println("two param constructor from parent class" + a + " " + b);
   }
}
//when we don't have a default constructor in the parent class,we must call a constructor with parameters explicitly.
//3. create a child class. the first statement in a constructor must be a call to a parent constructor
class SubClass extends Superclass {
    public SubClass() { //5.public SubClass constructor. Default constructors have an implicit call to default constructor of a parent class
        System.out.println("Default constructor from child class");

    }

    //8.
    public SubClass(int a, String b) {
        System.out.println("two param constructor from child class " + a + " " + b);
    }

    //11. let's create one more constructor
    public SubClass(String b) {
    super(2, b);
        System.out.println("one param constructor from child class" + b);
    }
}
