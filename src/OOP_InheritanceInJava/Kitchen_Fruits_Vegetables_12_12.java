package OOP_InheritanceInJava;

import java.util.HashMap;
import java.util.Map;

class Kitchen {
    private Map<Veges, Double> vegesInventory;
    private Map<Fruits, Double> fruitsInventory;

    public Kitchen() {
        vegesInventory = new HashMap<>();
        fruitsInventory = new HashMap<>();
    }

    public void addVegetable(Veges vege, double weight) {
        vegesInventory.put(vege, weight);
    }

    public void addFruit(Fruits fruit, double weight) {
        fruitsInventory.put(fruit, weight);
    }

    public void removeVegetable(Veges vege) {
        vegesInventory.remove(vege);
    }

    public void removeFruit(Fruits fruit) {
        fruitsInventory.remove(fruit);
    }

    public Map<Veges, Double> getVegeInventory() {
        return vegesInventory;
    }

    public Map<Fruits, Double> getFruitInventory() {
        return fruitsInventory;
    }
}

class Veges {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Veges(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}

class Fruits {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Fruits(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}
