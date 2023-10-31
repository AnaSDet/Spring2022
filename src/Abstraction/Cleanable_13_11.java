package Abstraction;
import Abstraction.Cleanable;
public class Cleanable_13_11 {
    public static void main(String[] args) {
        Cleanable cleanable = new Dish("Ceramic");
        cleanable.clean();
    }
}
interface Cleanable {
    void clean();
}

class Dish implements Cleanable {
    private String material;

    public Dish(String material) {
        this.material = material;
    }


    public void scrub() {
        System.out.println("Scrubbing the dish made of Ceramic");
    }

    public void rinse() {
        System.out.println("Rinsing the dish made of Ceramic");
    }

    public void dry() {
        System.out.println("Drying the dish made of Ceramic");
    }


    @Override
    public void clean() {
        scrub();
        rinse();
        dry();
    }
}

class Floor implements Cleanable {
    private double area;

    public Floor(double area) {
        this.area = area;
    }

    public void sweep() {
        System.out.println("Sweeping the floor with an area of 50.0 square meters");
    }

    public void mop() {
        System.out.println("Mopping the floor with an area of 50.0 square meters");
    }

    public void dry() {
        System.out.println("Drying the floor with an area of 50.0 square meters");
    }


    @Override
    public void clean() {
        sweep();
        mop();
        dry();
    }
}

