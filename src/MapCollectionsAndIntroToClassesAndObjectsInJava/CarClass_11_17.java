package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class CarClass_11_17 {
    String make;
    String model;
    int year;
    double mileage;
}

class Main4 {
    public static void main(String[] args) {
        CarClass_11_17 var = new CarClass_11_17();
        var.make = "Nissan";
        var.model = "Rough";
        var.year = 2023;
        var.mileage = 20.544;

        System.out.println(var.make);
        System.out.println(var.model);
        System.out.println(var.year);
        System.out.println(var.mileage);
    }
}
