package Exercise3;

import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Enter the current prime interest rate: ");
        double primeRate = input.nextDouble();

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nMortgage #" + (i + 1));

            System.out.print("Enter mortgage number: ");
            String mortgageNumber = input.next();

            System.out.print("Enter customer name: ");
            String customerName = input.next();

            System.out.print("Enter mortgage amount: ");
            double amount = input.nextDouble();

            System.out.print("Enter term (1 for short, 3 for medium, 5 for long): ");
            int term = input.nextInt();

            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int mortgageType = input.nextInt();

            if (mortgageType == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else if (mortgageType == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type. Defaulting to Personal Mortgage.");
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
            }
        }

        System.out.println("\n--- Mortgage Details ---");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
        }

        input.close();
    }
}
