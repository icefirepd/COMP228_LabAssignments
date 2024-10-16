package Exercise2;

abstract class GameTester {
    protected String name;
    protected boolean status;

    public GameTester(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public abstract double salary();
}