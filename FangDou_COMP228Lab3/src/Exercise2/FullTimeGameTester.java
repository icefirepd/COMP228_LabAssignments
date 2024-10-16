package Exercise2;

// Full-time Game Tester subclass
class FullTimeGameTester extends GameTester {
    private final double baseSalary = 3000.0;

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
