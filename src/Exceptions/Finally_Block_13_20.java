package Exceptions;

public class Finally_Block_13_20 {
    public static void main(String[] args) { //1.
    method1(); //9.

    }
    //finally is a block of code in try catch pair that is executed regardless of the result of try and catch.
    //it is used for cleaning up and quitting(stopping) resources.
    public static void method1() { //2.
        try { //4.
            //code that may throw an exception
            // ...
            Class.forName("kfjfdjghfg"); //3.
        } catch (Exception e) { //5.
            // Exception handling
            // ...
            System.out.println(e); //6.
        } finally { //7.
            // Cleanup operarions
            // ...
            System.out.println("Cleaning up"); //8.
        }
//Interview question: What is the difference betwen Finally and Final?
        //They are not related at all.
        //1.Final can be used with variables, methods and classes. If the variable is final it can only be initialized once.
        //If the method is final it cannot be overriden. If the class is final it cannot be extended.

        //2. Finally is a block of code in try catch pair that is executed regardless of the result of try and catch.
        //It is used for cleaning up and quitting resources.
    }
}
