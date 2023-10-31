package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Basic_Banking_System_12_14__12_15_OOP {

    public static void main(String[] args) {
//  create address for customer 1,2,3
        Address c1Address = new Address("123 Main str", "Patterson", 64001, "USA");
        Address c2Address = new Address("12 Central Park str", "New Jersey", 20015, "USA");
        Address c3Address = new Address("256 Ave", "Utah", 84137, "USA");

//  create banking accounts for Joe Doe
        Account1 johnDoeChecking = new Account1("456545", 45566);
        Account1 johnDoeCSavings = new Account1("41541541", 426565);

//  create all John Doe accounts in a List
        List<Account1> johnDoeAccounts = new ArrayList<>();
        johnDoeAccounts.add(johnDoeChecking);
        johnDoeAccounts.add(johnDoeCSavings);

//  create banking accounts for Elon Musk
        Account1 elonChecking = new Account1("55254", 54245);
        Account1 elonCSavings = new Account1("535363", 53663);

//  create all Elon Musk accounts in a List
        List<Account1> elonAccounts = new ArrayList<>();
        elonAccounts.add(elonChecking);
        elonAccounts.add(elonCSavings);

//  create banking accounts for Jessica Alba
        Account1 jessChecking = new Account1("7585254", 754245);
        Account1 jessCSavings = new Account1("754242554", 753521);
        Account1 jessCSavings2 = new Account1("78646545",713553);
//  create all Jessica Alba accounts in a List
        List<Account1> jessAccounts = new ArrayList<>();
        jessAccounts.add(jessChecking);
        jessAccounts.add(jessCSavings);
        jessAccounts.add(jessCSavings2);

//  creating all customers
        Customer1 c1 = new Customer1("John Doe",c1Address, johnDoeAccounts );
        Customer1 c2 = new Customer1("Elon Musk", c2Address, elonAccounts);
        Customer1 c3 = new Customer1("Jessica Alba", c3Address, jessAccounts);

//  adding all customers to a List.
        List<Customer1> customersList = new ArrayList<>();
        customersList.add(c1);
        customersList.add(c2);
        customersList.add(c3);

//  creating one bank with list of customers, where each customer has a list of accounts
        Bank1 chaseBank = new Bank1("Chase", customersList);
        printAllAccounts(chaseBank);

        double result = depositFunds(chaseBank, "Elon Musk","55254", 1000 );
        System.out.println(result);
        }
//        System.out.println(chaseBank.getName());
//        List<Customer1> cList = chaseBank.getCustomerList();
//
//        for (Customer1 obj : cList){
//
//            if (obj.getName().equalsIgnoreCase("Elon Musk")){
//                System.out.println(obj.getName());
//                System.out.println(obj.getAddress().getStreet());
//                System.out.println(obj.getAddress().getCity());
//                System.out.println(obj.getAddress().getZipcode());
//                System.out.println(obj.getAddress().getCountry());
//            }
//        }

//    create a method that will print out all accounts of all customers
    public static void printAllAccounts(Bank1 bank){
      List<Customer1> customerList = bank.getCustomerList();

      for (Customer1 customerObj : customerList){
          System.out.println(customerObj.getName());
          List<Account1> accountList = customerObj.getAccountsList();
          for (Account1 accountObj : accountList){
              System.out.println("Account number:" + accountObj.getAccountNumber());
              System.out.println("Balance:" + accountObj.getBalance());
          }
      }
    }
    //create a method to deposit that takes 1. Custom name, 2. accountNum, 3. deposit amount
    //return the updated balance in double
    public static double depositFunds(Bank1 bank, String costumerName, String accountNum, double amount ){
    List<Customer1> customerList = bank.getCustomerList();

    for (Customer1 customerObj : customerList){
       if (customerObj.getName().equalsIgnoreCase(costumerName)){
        List <Account1> accountList =  customerObj.getAccountsList();
        for (Account1 accountObj : accountList) {
            if (accountObj.getAccountNumber().equalsIgnoreCase(accountNum)){
                accountObj.deposit(amount);
              return   accountObj.getBalance();
            }
         }
       }
    }
    return -1;
   }
}

class Customer1{
    private String name;
    private Address address;
    private List<Account1> accountsList;

    public Customer1(String name, Address address, List<Account1> accountsList) {
        this.name = name;
        this.address = address;
        this.accountsList = accountsList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Account1> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<Account1> accountsList) {
        this.accountsList = accountsList;
    }
}

class Address1{
    private String street;
    private String city;
    private int zipcode;
    private String country;


    public Address1(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipcode() {
        return zipcode;
    }
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}

class Bank1{
    private String name;
    private List<Customer1> customerList;

    public Bank1(String name, List<Customer1> customerList) {
        this.name = name;
        this.customerList = customerList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer1> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer1> customerList) {
        this.customerList = customerList;
    }
}
class Account1{
    private String accountNumber;
    private double balance;

    public Account1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double depositAmount){
    balance += depositAmount;
    }
    public void withdraw (double withdrawAmount){
        if (withdrawAmount > balance){
            System.out.println("Insufficient funds");
        }else {
            balance-=withdrawAmount;
        }
    }
}


