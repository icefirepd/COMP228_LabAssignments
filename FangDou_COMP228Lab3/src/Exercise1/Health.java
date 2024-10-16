package Exercise1;

class Health extends Insurance {

    public Health() {
        super("Health");
    }

    public @Override void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    public @Override void displayInfo() {
        System.out.println("Insurance Type: " + getInsurType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
