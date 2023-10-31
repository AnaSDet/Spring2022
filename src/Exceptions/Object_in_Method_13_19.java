package Exceptions;

public class Object_in_Method_13_19 {
    public static void main(String[] args) {
        performObjectOperations(10);
        performObjectOperations(null);
        performObjectOperations("Hello");
    }
    public static void performObjectOperations(Object obj) {
        try {
            int result = (int) obj / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - Division by zero.");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - Object is null.");
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException - Invalid type casting.");
        }
    }

}
