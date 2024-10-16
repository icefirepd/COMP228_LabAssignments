package Exercise2;

class PartTimeGameTester extends GameTester {
    private int hours;

    public PartTimeGameTester(String name, int hours) {
        super(name, false);
        this.hours = hours;
    }

    public @Override double salary() {
        return hours * 20;
    }
}