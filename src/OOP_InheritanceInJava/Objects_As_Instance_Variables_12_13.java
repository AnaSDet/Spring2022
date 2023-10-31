package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Objects_As_Instance_Variables_12_13 {
    //Requirements: We want to be able to store info about the Bank. We will create 2 classes :bank and costumer classes
    //*name: "Chase"
    //*custumers: [{"John Doe"}, {"Elon"}, {"Jessica"}]
    //*address: street(String), city(String), zipcode(int), country(String).

//1. Create a main method
public static void main(String[] args) {
//20. because we added Address to our class we have to create
    Address c1Address = new Address("123 Main str", "Patterson", 64001, "USA");
    Address c2Address = new Address("12 Central Park str", "New Jersey", 20015, "USA");
    Address c3Address = new Address("256 Ave", "Utah", 84137, "USA");

//8. creating costumer list           +      //21. after name add Address
    Customer c1 = new Customer("John Doe",c1Address );
    Customer c2 = new Customer("Elon Musk", c2Address);
    Customer c3 = new Customer("Jessica Alba", c3Address);

//9. creating list of costumers
List<Customer> customersList = new ArrayList<>();
customersList.add(c1);
customersList.add(c2);
customersList.add(c3);

//10. creating Bank object "Chase" and passing the list of customers
    Bank chaseBank = new Bank("Chase", customersList);
    System.out.println(chaseBank.getName()); //-->printing out a bank "Chase"
//11. print out all the customers that we have in our Chase bank
    List<Customer> cList = chaseBank.getCustomerList(); //customerList(142) getter method returns a list
//12. now we have to loop through that costumer list using for each loop, and printing out each name of the costumer object
    for (Customer obj : cList){
//22. we are looking for Elon Mask info to print out
        if (obj.getName().equalsIgnoreCase("Elon Musk")){
            System.out.println(obj.getName());
            System.out.println(obj.getAddress().getStreet());
            System.out.println(obj.getAddress().getCity());
            System.out.println(obj.getAddress().getZipcode());
            System.out.println(obj.getAddress().getCountry());
        }
        //System.out.println(obj.getName()); //if we want to print all costumer names
    }
  }
}
//2. creating a costumer class first, from the lower to up.
class Customer{
    private String name;
//16. now we can add Addres to the cosrumer class list
    private Address address;

//3. creating a constructor
    //public Customer(String name) {
// 17. we modified our Costumer constructor. it was (public Customer(String name))
public Customer(String name, Address address) {
    this.name = name;
//18. we add this.address
    this.address = address;
    }
//4. creating GETTER and SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//19.creating GETTER and SETTER

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
//13. creating Address class
class Address{
    private String street;
    private String city;
    private int zipcode;
    private String country;

//14. create a constructor
    public Address(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

//15. create GETTERS and SETTERS for Address class
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
//5. creating a Bank class
class Bank{  //we can have a list of objects or objects by themselves without a list as instance variables depending on
            // the structure of data type that we're creating, on what type of information we need to store
    private String name;
    private List<Customer> customerList;

//6. create a constructor

    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }
//7. create GETTER and SETTER for Bank class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() { //line 34
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
