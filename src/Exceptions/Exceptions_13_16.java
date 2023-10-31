package Exceptions;

public class Exceptions_13_16 {
    public static void main(String[] args) { //1.
example();
System.out.println("Hello WeDevX");

    }

    public static void example(){ //2.
  //checked exceptions mean that you want to use methods that are known to be error-prone
  //developer makes a lot of misspelling mistakes with it
        try {
        //you write the logic(block of code) which throws a checked exception

//when the method actually fails - the code will jump to catch block by skipping the remaining code in the try block.
            Class.forName("com.WeDevX-java.class19.ClassName");
            System.out.println("Line 16");

            //catch block comes with parenthesis in which you need to put the Exception the block of code throws
        } catch(ClassNotFoundException e) {
            //everything in the catch block will be executed
            System.out.println("Something went wrong in the try block");
      }
   }
}
