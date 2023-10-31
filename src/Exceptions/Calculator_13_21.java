package Exceptions;

public class Calculator_13_21 {
    public static void main(String[] args) {

    }
}
class Calculator {
    public int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }
}