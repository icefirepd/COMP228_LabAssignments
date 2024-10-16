package Exercise3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        if (amount > MAX_MORTGAGE_AMOUNT) {
            throw new IllegalArgumentException("Mortgage amount cannot exceed $" + MAX_MORTGAGE_AMOUNT);
        }
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.interestRate = interestRate;
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;  // Default to short-term if an invalid term is provided
        } else {
            this.term = term;
        }
    }

    public double calculateTotalOwed() {
        return amount + (amount * (interestRate / 100) * term);
    }

    public abstract String getMortgageType();

    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Mortgage Type: " + getMortgageType() + "\n" +
                "Amount: $" + amount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " years\n" +
                "Total Amount Owed: $" + calculateTotalOwed() + "\n";
    }
}

