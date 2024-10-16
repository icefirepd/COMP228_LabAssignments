package Exercise3;
import java.io.Console;

public class ProcessMortgage {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("Enter the current interest rate (%): ");
        double interestRate = Double.parseDouble(console.readLine());

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mortgage type (B for Business, P for Personal): ");
            String mortgageType = console.readLine();
            if (!mortgageType.equals("P") && !mortgageType.equals("B")) {
                System.out.print("Wrong mortgage type.");
                return;
            }
            System.out.print("Enter mortgage number: ");
            String mortgageNumber = console.readLine();
            System.out.print("Enter customer name: ");
            String customerName = console.readLine();
            System.out.print("Enter mortgage amount: ");
            double amount = Double.parseDouble(console.readLine());
            System.out.print("Enter term (1=short, 3=medium, 5=long): ");
            int term = Integer.parseInt(console.readLine());


            if (mortgageType.equals("B")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, interestRate, term);
            } else {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, interestRate, term);
            }
        }

        System.out.println("Display all mortgages:\n");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
        }
    }
}
