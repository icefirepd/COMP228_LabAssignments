package Exercise2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the game tester:");
        String name = scanner.nextLine();

        System.out.println("Choose the type of game tester (1 for Full-time, 2 for Part-time):");
        int testerType = scanner.nextInt();

        GameTester tester;

        if (testerType == 1) {
            // Create a full-time game tester
            tester = new FullTimeGameTester(name);
        } else {
            // Create a part-time game tester
            System.out.println("Enter the number of hours worked:");
            int hoursWorked = scanner.nextInt();
            tester = new PartTimeGameTester(name, hoursWorked);
        }

        // Output the salary of the game tester
        System.out.println("Game Tester: " + tester.name);
        System.out.println("Salary: $" + tester.calculateSalary());

        scanner.close();
    }
}
