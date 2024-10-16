package Exercise2;

class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    public @Override double salary() {
        return 3000;
    }
}
