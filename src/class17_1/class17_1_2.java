package class17_1;

import java.util.Scanner;

public class class17_1_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12:");
        int num = sc.nextInt();
          switch (num) {
                    case 1:
                        System.out.println("The corresponding month of the year is January");
                        break;
                    case 2:
                        System.out.println("The corresponding month of the year is February");
                        break;
                    case 3:
                        System.out.println("The corresponding month of the year is March");
                        break;
                    case 4:
                        System.out.println("The corresponding month of the year is April");
                        break;
                    case 5:
                        System.out.println("The corresponding month of the year is May");
                        break;
                    case 6:
                        System.out.println("The corresponding month of the year is June");
                        break;
                    case 7:
                        System.out.println("The corresponding month of the year is July");
                        break;
                    case 8:
                        System.out.println("The corresponding month of the year is August");
                        break;
                    case 9:
                        System.out.println("The corresponding month of the year is September");
                        break;
                    case 10:
                        System.out.println("The corresponding month of the year is October");
                        break;
                    case 11:
                        System.out.println("The corresponding month of the year is November");
                        break;
                    case 12:
                        System.out.println("The corresponding month of the year is December");
                        break;
                }
            }
        }