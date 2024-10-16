package Exercise1;

class Life extends Insurance {

    // Constructor
    public Life() {
        super("Life Insurance");
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

