package Exercise1;

public class Life extends Insurance {
    public Life() {
        super("Life");
    }

    public @Override void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    public @Override void displayInfo() {
        System.out.println("Insurance Type: " + getInsurType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}