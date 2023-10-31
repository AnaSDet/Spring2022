package Exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class No_More_Elements_13_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readNextElement(scanner);
        scanner.close();
    }

    public static String readNextElement(Scanner scanner) {
        try {
            return scanner.next();
        } catch (NoSuchElementException e) {
            System.out.println("Error: No more elements to read.");
            return "";
        }
    }
}



