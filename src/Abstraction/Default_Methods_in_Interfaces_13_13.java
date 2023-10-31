package Abstraction;

public class Default_Methods_in_Interfaces_13_13 {
    public static void main(String[] args) {//1.
   BankingTransaction withdrawal = new WithdrawalTransaction(); //12. creating objects
   BankingTransaction deposit = new DepositTransacrion(); //13.

   //runtime polymorphism
   withdrawal.execute(); //14.
   withdrawal.logTransaction(); //15.

    deposit.execute(); //16.
    deposit.logTransaction(); //17.

    }
}
interface BankingTransaction { //2.
   void execute(); //5.

   default void logTransaction(){ //8. create a default method
       System.out.println("Logging transaction..."); //9.
   }
}

class WithdrawalTransaction implements BankingTransaction{ //3.
 //6. Override method using generator

    @Override
    public void execute() {
        System.out.println("Performing withdrawal transaction..."); //10.
    }
}

class DepositTransacrion implements BankingTransaction{ //4.
    //7. Override method using generator
    @Override
    public void execute() {
        System.out.println("Performing deposit transaction..."); //11.
    }
    @Override
    public void logTransaction(){

    }
}