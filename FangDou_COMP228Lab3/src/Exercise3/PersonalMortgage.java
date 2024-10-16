package Exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate + 2, term);
    }

    public @Override String getMortgageType() {
        return "Personal Mortgage";
    }
}

