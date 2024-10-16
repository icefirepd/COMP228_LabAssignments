package Exercise1;

abstract class Insurance {
    protected String insurType;
    protected double monthlyCost;

    public Insurance(String insurType) {
        this.insurType = insurType;
    }

    public String getInsurType() { return insurType; }
    public double getMonthlyCost() { return monthlyCost; }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}