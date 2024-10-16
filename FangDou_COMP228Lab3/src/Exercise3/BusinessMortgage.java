package Exercise3;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate + 1, term);
    }

    public  @Override String getMortgageType() {
        return "Business Mortgage";
    }
}

