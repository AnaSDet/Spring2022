package Abstraction;

public class Instrument_13_9 {
    public static void main(String[] args) {
        Guitar g = new Guitar(6);
        Piano p = new Piano(88);
        g.play();
        g.displayInfo();
        p.play();
        p.displayInfo();
    }
}

abstract class Instrument {
    public abstract void play();
    public abstract void displayInfo();
}

class Guitar extends Instrument {
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("The guitar melody");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a guitar with " + strings + " strings");
    }
}

class Piano extends Instrument {
    private int keys;

    public Piano(int keys) {
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println("The piano melody");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a piano with " + keys + " keys");
    }
}
