package Exercise3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        if (amount > maxMortgageAmount) {
            System.out.println("mortgage amounts over the max limit");
            return;
        }
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.interestRate = interestRate;
        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        } else {
            this.term = term;
        }
    }

    public double calculateTotalOwed() {
        return amount + (amount * (interestRate / 100) * term);
    }

    public abstract String getMortgageType();

    public String getMortgageInfo() {
        return "--- " + bankName + " ---" + "\nMortgage Type: " + getMortgageType() + "\nMortgage Number: " + mortgageNumber + "\nCustomer Name: " + customerName + "\nAmount: $" + amount + "\nInterest Rate: " + interestRate + "%\nTerm: " + term + " years" + "\nTotal Amount Owed: $" + calculateTotalOwed() + "\n";
    }
}

