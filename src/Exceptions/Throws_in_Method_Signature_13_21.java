package Exceptions;

public class Throws_in_Method_Signature_13_21 {
    public static void main(String[] args) { //1.

    }
   //throws keyword is used to declare exceptions in the method signature. Which means the method has a block of code that
    //throws an exception
    //it's like a warning to the methods that are going to use this method
    public static void withdraw(int amount) throws Exception{ //2 + //6.add keywords throws Exception. Throws used to declare it in your method signature
        int balance = 100; //3.
        if (amount < balance) {//4.
            //throw keyword is used to actually throw an exception

            throw new Exception("Insufficient funds"); //5. Throw used to throw an exception
        }

    }
    //when you are creating a logic declare exceptions in the method signature
    // and when you are applying the method logic then use Try Catch.
    public static void transfer(){ //7.
        //in this case try and catch is the right method
        try { //8
            withdraw(50); //9.
        } catch (Exception e) { //10.
            System.out.println(e); //11.

             //or we can do this way. but the firs option is much better
            //public static void transfer() throws Exception {
           //  withdraw(50);
        }
    }
    //Interview question: What is the difference between THROW and THROWS?
    // Throw keyword is actually used to throw an exception. So it's usually wrapped in some logic inside your method.
    //Throws can only be used in the method signature.
}
