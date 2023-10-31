package OOP_InheritanceInJava;

public class Passenger_12_10 {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(123, "John Doe", 30, true);
        passenger.displayPassengerDetails();
    }
}

class Passenger {
    public static final int MAX_CAPACITY = 200;
    public static final String PASSENGER_TYPE = "Regular";
    private int passengerId;
    private String passengerName;
    private int age;
    private boolean isFrequentFlyer;
    private static int totalPassengers;
    private static String airlineName;

    // Creating a constructor
    public Passenger(int passengerId, String passengerName, int age, boolean isFrequentFlyer) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.isFrequentFlyer = isFrequentFlyer;
        totalPassengers++;
    }

    public void printPassengerType() {
        System.out.println(Passenger.PASSENGER_TYPE);
    }

    public void changePassengerName(String newName) {
        passengerName = newName;
    }

    public static int getTotalPassengers() {
        return totalPassengers;
    }

    public static String getAirlineName() {
        return airlineName;
    }

    public static void setAirlineName(String name) {
        airlineName = name;
    }

    public void displayPassengerDetails() {
        System.out.println("Passenger Details:\nPassenger ID: " + passengerId + "\nName: " + passengerName +
                "\nAge: " + age + "\nFrequent Flyer: " + isFrequentFlyer);
    }
}