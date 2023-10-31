package Inheritance;

public class Shape_12_22 {
    public static void main(String[] args) {

    }
}
class Shape {
    protected String name;
    protected double area;

    public Shape(String name) {
        this.name = name;
    }

    public void printArea() {
        System.out.println("The area of the " + name + " is: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void printAreaCircle() {
        super.area = 3.14 * radius * radius;
        super.printArea();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void printAreaRectangle() {
        super.area = length * width;
        super.printArea();
    }
}