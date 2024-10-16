package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        Insurance[] insuranceArray = new Insurance[2]; // Array to hold insurance objects

        // Loop to create insurance objects
        for (int i = 0; i < insuranceArray.length; i++) {
            System.out.println("Enter the type of insurance (Health or Life):");
            String type = scanner.nextLine();

            System.out.println("Enter the monthly cost of the insurance:");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if (type.equalsIgnoreCase("Health")) {
                insuranceArray[i] = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insuranceArray[i] = new Life();
            } else {
                System.out.println("Invalid insurance type. Skipping.");
                i--; // Ensure that the loop continues correctly
                continue;
            }

            // Setting the cost of the insurance
            insuranceArray[i].setInsuranceCost(cost);
        }

        // Polymorphic screen manager to display insurance info
        System.out.println("\nInsurance Details:");
        for (Insurance insurance : insuranceArray) {
            insurance.displayInfo();
            System.out.println("--------------------");
        }

        scanner.close();
    }
}

