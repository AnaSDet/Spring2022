package OOP_InheritanceInJava;

public class CarPosting_12_2 {

    public String make;
    public String model;
    public int year;
    public double askingPrice;
    public int mileage;
    public String drive;
    public String color;
    public boolean isCleanTitle;


//    constructors are used to initialize an object and initialize the instance variables (characteristics)



    public CarPosting_12_2(String carMake, String carModel, int carYear, double carAskingPrice, int carMileage,
                           String carDrive, String carColor, boolean isCarCleanTitle){

        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;
        mileage = carMileage;
        drive = carDrive;
        color = carColor;
        isCleanTitle = isCarCleanTitle;
    }

//    constructor overloading gives you an ability to create multiple
//    constructors with different set of parameters

    public CarPosting_12_2(String carMake, String carModel, int carYear, double carAskingPrice){
        make = carMake;
        model = carModel;
        year = carYear;
        askingPrice = carAskingPrice;
    }
public CarPosting_12_2(double carAskingPrice, int carMileage){
    carAskingPrice = carAskingPrice;
    mileage = carMileage;
}
}


class Main10{
    public static void main(String[] args) {
    CarPosting_12_2 post1 = new CarPosting_12_2("Ferrari", "418", 2022, 35000.00,
            100, "RVD", "Red", true);
    System.out.println(post1.askingPrice);
    System.out.println(post1.color);

CarPosting_12_2 post2 = new CarPosting_12_2("Rolls Royce", "Cullinan", 2023, 450000.00);


CarPosting_12_2 post3 = new CarPosting_12_2(10000.00, 50000);

System.out.println(post2.askingPrice);
System.out.println(post3.mileage);

System.out.println(post2.color);
    }
}