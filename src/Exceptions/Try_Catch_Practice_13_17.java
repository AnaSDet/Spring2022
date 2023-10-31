package Exceptions;

public class Try_Catch_Practice_13_17 {
    public static void main(String[] args) { //1.

    method1(); //4.
        System.out.println("Line 6"); //5.

    }

   public static void method1(){ //2.
//catch unchecked exception

       //whenever TRY executes successfully, catch block is skipped
       try { //6.
          System.out.println("Beginning of the try"); //10.
          double result = 10/0; //3. and step //7 put double inside TRY
       }catch (ArithmeticException e){ //8.
          System.out.println("ArithmeticException: / by zero occurred, but handled"); //9.
          System.out.println("More catch stuff");
       }
//in the case of successful run of TRY we will skip catch.
   }
}
