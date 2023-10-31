package Inheritance;

public class Vehicles_12_17 {
//1. create a main method
    public static void main(String[] args) {

//8. print out the information
        Car car = new Car("Toyota", 4);
        System.out.println("Starting the " + car.brand);

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", true);
        System.out.println(motorcycle.brand);
    }
}
//2. create a base PARENT class
class Vehicle{
 protected String brand;  //Instance Variables

//3. Constructors:
    public Vehicle(String brand) {
        this.brand = brand;
    }
}

//4. creating a CHILD class(extends)
class Car extends Vehicle{
    private int numOfDoors;  //Instance Variables:

//5. Constructors:
    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }
}

//6. creating a second CHILD class(extends)
class Motorcycle extends Vehicle{
    private boolean hasSidecar;

//7.  Constructors:
    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }
}