package Exceptions;

public class Age_identifier_13_21 {
    public static void main(String[] args) {

    }
}
class AgeVerifier {
    public static void verifyAge(int age){
        if (age < 0){
            throw new IllegalArgumentException ( "Age cannot be negative");
        }
        if (age < 18){
            throw new IllegalArgumentException ("Age must be at least 18");
        }
        System.out.println("Age verification successful") ;
    }
}