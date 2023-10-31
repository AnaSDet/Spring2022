package OOP_InheritanceInJava;

public class Guest_12_10 {
    public static void main(String[] args) {
Guest guest = new Guest(134, "Joe Doe", 30, true);
guest.displayGuestDetails();

Guest guest1 = new Guest(2, "Jane Smith", 25, false);
guest1.displayGuestDetails();

    }
}

//Create a class called Guest that represents a hotel guest. The class should have several static and non-static
// variables, including two final variables, as well as instance and static methods. Implement a full-parameter
// constructor to initialize the guest object.
class Guest{
    //Static Variables:
    private static int totalGuests;
    private static String hotelName;

    //Instance Variables:
    private int guestId;
    private String guestName;
    private int age;
    private boolean isRegular;

    //Final Variables:
    private final int MAX_AGE = 100;
    private final int MAX_GUESTS = 100;

    //Static Methods:
    public static String getHotelName(){
        return hotelName;
    }
    public static void setHotelName(String name){
        hotelName = name;
    }

    //Instance Methods:
    public Guest(int guestId, String guestName, int age, boolean isRegular){
        this.guestId = guestId;
        this.guestName = guestName;
        this.age = age;
        this.isRegular = isRegular;
        totalGuests++;
    }
    public void displayGuestDetails(){
        System.out.println("Guest Details:");
        System.out.println("Guest ID: "+guestId);
        System.out.println("Name: "+guestName);
        System.out.println("Age: "+age);
        System.out.println("Regular: "+isRegular);
    }
}
