package Exceptions;

import java.util.concurrent.ExecutionException;

public class Multipl_Catch_Blocks_13_19 {
    public static void main(String[] args) { //1.
        method1(); //12.

    }
    public static void method1(){ //2.
     //imagine there is one try block where there are 2 problematic statements


     try { //3.
         System.out.println("Try start"); //9.
         String var = null; //4.
         //NullPointException
         var.toLowerCase(); //5
         System.out.println("Done with String"); //10.

         Class.forName("ffhvbxfhndk"); //6.
         System.out.println("Done with Class for Name"); //11.

         double result = 10 / 0; //16
     }catch (Exception e) {  //17
         System.out.println(e); //18
     }
//     }catch (ClassNotFoundException e){ //7.
//       System.out.println("Could find the class"); //8.
//     }catch (NullPointerException e){ //13.
//         System.out.println("Second catch"); //14.
//         System.out.println(e); //15.
//     }
    }
}
