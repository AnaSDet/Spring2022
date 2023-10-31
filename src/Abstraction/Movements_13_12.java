package Abstraction;

public class Movements_13_12 {
    public static void main(String[] args) {

    }
}
interface Movable {
    void moveForward(int distance);
    void moveBackward(int distance);
}
interface Resizable {
    void increaseSize(int factor);
    void decreaseSize(int factor);
}
class Body implements Movable, Resizable {
    private int height;
    private int width;
    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void displaySize() {
        System.out.printf("Current size: Height=%d, Width=%d%n", height, width);
    }
    @Override
    public void moveForward(int distance) {
        height += distance;
    }
    @Override
    public void moveBackward(int distance) {
        height -= distance;
    }
    @Override
    public void increaseSize(int factor) {
        height *= factor;
        width *= factor;
    }
    @Override
    public void decreaseSize(int factor) {
        height /= factor;
        width /= factor;
    }
}
