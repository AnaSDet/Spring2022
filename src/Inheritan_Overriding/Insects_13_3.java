package Inheritan_Overriding;

public class Insects_13_3 {
    public static void main(String[] args) {

    }
}

class Insect {
    String name;
    int lifeSpan;
    public void setName(String name) {
        this.name = name;
    }
    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    public void displayInfo() {
        System.out.println("This is an insect.");
    }
}
class Bee extends Insect {
    @Override
    public void displayInfo() {
        name = "Bee";
        lifeSpan = 30;
        System.out.println(name + " has a lifespan of " + lifeSpan + " days.");
    }
}
class Ant extends Insect {
    @Override
    public void displayInfo() {
        name = "Ant";
        lifeSpan = 45;
        System.out.println(name + " has a lifespan of " + lifeSpan + " days.");
    }
}