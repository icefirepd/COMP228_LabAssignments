package Exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 2.0, term);  // 2% over prime rate
    }

    @Override
    public String getMortgageType() {
        return "Personal Mortgage";
    }
}

