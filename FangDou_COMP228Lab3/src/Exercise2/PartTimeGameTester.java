package Exercise2;

// Part-time Game Tester subclass
class PartTimeGameTester extends GameTester {
    private int hoursWorked;
    private final double hourlyRate = 20.0;

    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

