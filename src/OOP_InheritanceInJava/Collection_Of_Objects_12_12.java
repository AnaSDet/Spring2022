package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Collection_Of_Objects_12_12 {

//1.creating a main method
    public static void main(String[] args) {

//4.creating multiple BankingAccounts, and we want to store it in the list (STATIC METHOD)
    List<BankingAccount> allAccountsList = new ArrayList<>();

//5.creating BankingAccount objects
    BankingAccount ba1 = new BankingAccount("Chase", 1200);
    BankingAccount ba2 = new BankingAccount("BOA", 3500);
    BankingAccount ba3 = new BankingAccount("US Bank", 54845);

//6. now our list contains BakingAccount objects
    allAccountsList.add(ba1); // ba1--> [Chase, 1200]
    allAccountsList.add(ba2); // ba2--> [BOA, 3500]
    allAccountsList.add(ba3); // ba3--> [US Bank, 54845]

//7. We will use for each loop to print out banking Names from BakingAccount
    for (BankingAccount obj : allAccountsList) {
    //SOP(obj.getName); --> Chase, BOA, US Bank

//7.1. If we want to print out only one specific object, we have loop through and use if statement
    if (obj.getName().equalsIgnoreCase("chase")) {
    System.out.println(obj.getName()); // if we want to print out only Chase
      }
    }

//9. We are printing out the result of all banking accounts(15-17) it returns a Double result
    double result = calculateTotalBalanceOfAllAccounts(allAccountsList);
    System.out.println(result);
    }

//8. In CollectionOfObjects class create a static method called calculateTotalBalanceOfAllAccounts that takes a list
//of BakingAccounts as a param and sums up balance of every account and returns the total balance of all accounts(15-17)
    public static double calculateTotalBalanceOfAllAccounts(List<BankingAccount> baList){
    double sum = 0;
//We need to access the data-->we have to loop through and use Getter method in order to access the info that we are looking for
    for (BankingAccount obj : baList){
    sum+=obj.getBalance();
    }
    return sum;
   }
    }

//2.creating a class. no classes with duplicate names within the same package
    class BankingAccount {
        private String name;
        private double balance;

//3. creating constructor
        public BankingAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }
    }

//whatever  we're creating classes that have instance var, constructor, Getter and Setter,
// those type of classes known as POJO - plain old Java object (all these objects are just storing information,
// basically POJO means I'm creating this object to be a data type and store info, not anymore more than that)


