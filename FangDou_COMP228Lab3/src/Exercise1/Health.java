package Exercise1;

class Health extends Insurance {

    // Constructor
    public Health() {
        super("Health Insurance");
    }

    // Implementing abstract method to set the insurance cost
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    // Implementing abstract method to display insurance information
    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + insuranceType);
        System.out.println("Monthly Cost: $" + monthlyCost);
    }
}
