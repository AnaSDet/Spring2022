package Inheritance;

public class Building_12_19 {
    public static void main(String[] args) {
Building building = new Building("Oasis", 8);
System.out.println(building.getName());
System.out.println(building.getFloors());

House house = new House("Happy Home", 3, 5);
System.out.println(house.getName());
System.out.println(house.getFloors());
System.out.println(house.getBedrooms());

Skyscraper sky = new Skyscraper("Sky", 19,2);
System.out.println(sky.getName());
System.out.println(sky.getFloors());
System.out.println(sky.getElevators());
    }
}
class Building {
    private String name;
    private int floors;

    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public Building(String name) {
        this.name = name;
        this.floors = 1;
    }

    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }
}

class House extends Building {
    private int bedrooms;

    public House(String name, int floors, int bedrooms) {
        super(name, floors);
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}

class Skyscraper extends Building {
    private int elevators;

    public Skyscraper(String name, int floors, int elevators) {
        super(name, floors);
        this.elevators = elevators;
    }

    public int getElevators() {
        return elevators;
    }
}