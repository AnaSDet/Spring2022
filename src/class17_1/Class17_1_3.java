package class17_1;

import java.util.Scanner;

public class Class17_1_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a season:");
        String season = input.nextLine();
        switch (season) {
            case ("winter"):
                System.out.println("December\nJanuary\nFebruary");
                break;
            case ("summer"):
                System.out.println("June\nJuly\nAugust");
                break;
            case ("spring"):
                System.out.println("March\nApril\nMay");
                break;
            case ("fall"):
                System.out.println("September\nOctober\nNovember");
                break;
        }
    }
}
