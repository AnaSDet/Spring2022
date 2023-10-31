package Class16;

import java.util.Scanner;
public class FitnessLevel {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your health status (good/bad): ");
            String healthStatus = scanner.nextLine();

            if (healthStatus.equals("good")) {
                System.out.println("Enter your fitness level (high/medium/low): ");
                String fitnessLevel = scanner.nextLine();

                switch (fitnessLevel) {
                    case "high":
                        System.out.println("We recommend you to prepare for a full marathon");
                        break;
                    case "medium":
                        System.out.println("We recommend you to prepare for a half marathon");
                        break;
                    case "low":
                        System.out.println("We recommend you to prepare for a 5k run");
                        break;
                    default:
                        System.out.println("Wrong entry for fitness level");
                        break;
                }
            } else if (healthStatus.equals("bad")) {
                System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
            } else {
                System.out.println("Wrong entry for health status");
            }
        }
    }

