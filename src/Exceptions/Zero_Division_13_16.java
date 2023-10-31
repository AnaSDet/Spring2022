package Exceptions;

public class Zero_Division_13_16 {
    public static int divideNums(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred.");
            return 0;
        }
    }
}
