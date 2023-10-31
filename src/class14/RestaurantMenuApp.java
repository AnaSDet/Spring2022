package class14;//should be package keyword and the package name.
import java.util.Scanner;
public class RestaurantMenuApp {
    public static void main(String[] args) {

    //Restaurant menu app.

    //write a program that will display the menu options
    //first it should prompt the options like
    //1. Appetizers
    //2. Main Course


    //if the users picks Appetizers then
    //user should be displayed with the following two options
    //1. Spring rolls
    //2. Egg rolls


    //user should be able to choose of the above options:
    //if the user chooses 1. Spring rolls
    //then the user should be displayed with a message saying
    //your spring rolls are being prepared.

    //if the user chooses 2. Egg rolls
    //should be displayed with a message saying
    //your egg rolls are being prepared

    //if thr user selects main course
    //user should be displayed with two mail course options
    //1. Chicken Curry
    //2. New Rib Eye Steak

    //users should be able to pick one of the above main course options
    //if user picks 1. Chicken Curry then the user should be printed out with a message
    //Your Chicken Curry is being prepared by our chef
    //if user picks 2. New York Rib Eye = then user should see
    //Your New York Rib Eye is being grilled by our Chef

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to DevX Restaurant!\n");
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Appetizers");
            System.out.println("2. Main Course");

            String firstOption = scanner.nextLine();

            if (firstOption.equals("1") || firstOption.equalsIgnoreCase("Appetizers")) {
                System.out.println("1. Spring Rolls");
                System.out.println("2. Egg Rolls");

                String appetizerChoice = scanner.nextLine();

                if (appetizerChoice.equals("1") || appetizerChoice.equalsIgnoreCase("Spring Rolls")) {
                    System.out.println("Your Spring Rolls are being prepared.");
                } else if (appetizerChoice.equals("2") || appetizerChoice.equalsIgnoreCase("Egg Rolls")) {
                    System.out.println("Your Egg Rolls are being prepared.");
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            } else if (firstOption.equals("2") || firstOption.equalsIgnoreCase("Main Course")) {
                System.out.println("1. Chicken Curry");
                System.out.println("2. New York Rib Eye");

                String mainCourseChoice = scanner.nextLine();

                if (mainCourseChoice.equals("1") || mainCourseChoice.equalsIgnoreCase("Chicken Curry")) {
                    System.out.println("Your Chicken Curry is being prepared by our Chef.");
                } else if (mainCourseChoice.equals("2") || mainCourseChoice.equalsIgnoreCase("New York Rib Eye")) {
                    System.out.println("Your New York Rib Eye is being grilled by our Chef.");
                } else {
                    System.out.println("Invalid Main Course Choice, please try again.");
                }
            } else {
                System.out.println("Invalid option, only Appetizers and Main Course are available.");
            }
        }
    }
}

