package Exercise1;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("Enter the type of insurance (Health or Life): ");
        String insurType = console.readLine();
        if (!insurType.equals("Health") && !insurType.equals("Life")) {
            System.out.println("Wrong input.");
            return;
        }

        System.out.print("Enter the monthly cost of the insurance: ");
        double cost = Double.parseDouble(console.readLine());

        Insurance insurance = null;
        switch (insurType.toLowerCase()) {
            case "health":
                insurance = new Health();
                break;
            case "life":
                insurance = new Life();
                break;
        }
        insurance.setInsuranceCost(cost);
        insurance.displayInfo();
    }
}