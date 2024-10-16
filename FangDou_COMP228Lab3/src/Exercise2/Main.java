package Exercise2;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        String name = null;

        System.out.print("Choose game tester type (F for Full-time, P for Part-time): ");
        String type = console.readLine();
        if (type.equals("F") || type.equals("P")) {
            System.out.print("Enter game tester name: ");
            name = console.readLine();
        }
        else {
            System.out.println("Wrong input.");
            return;
        }

        GameTester tester;
        if (type.equals("F")) {
            tester = new FullTimeGameTester(name);
        } else {
            System.out.print("Enter number of hours worked: ");
            tester = new PartTimeGameTester(name, Integer.parseInt(console.readLine()));
        }

        System.out.println("Tester: " + tester.name);
        System.out.println("Salary: $" + tester.salary());
    }
}