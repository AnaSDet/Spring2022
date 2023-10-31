package Exceptions;

public class Catch_Exception_Messages_13_18 {
    public static void main(String[] args) { //1.
         method1(); //9.
        System.out.println("I'm still alive");
    }

   public static void method1(){ //2.

        try { //3.
            System.out.println("Started try");
            int[] nums = new int[2]; //4.
            int num = nums[5]; //5.
            System.out.println("Everything went well and finished try"); //6.
       //what do you put in catch clause?
        }catch (ArrayIndexOutOfBoundsException e){ //7.
           //first print out "e" exception message, then
           //print out stack to be able to troubleshoot where the exception were thrown in my big framework
            System.out.println(e); //8.
            e.printStackTrace(); //10. MUST REMEMBER BY HEART. it shows the errors and where they are

        }
   }
}
