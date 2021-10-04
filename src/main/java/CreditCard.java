public class CreditCard extends PaymentCard {
    private int creditLimit;
    private double riskModifier;

    public CreditCard(int cardNumber, String expiry, int cvc, int creditLimit, double riskModifier) {
        super(cardNumber, expiry, cvc);
        this.creditLimit = creditLimit;
        this.riskModifier = riskModifier;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getRiskModifier() {
        return riskModifier;
    }

    public void setRiskModifier(double riskModifier) {
        this.riskModifier = riskModifier;
    }

    public double getTransactionFee(double fee) {
        return riskModifier * 0.02;
    }

    public void charge(double purchaseAmount) {
        double balance = this.creditLimit;
        balance -= purchaseAmount;

    }
}


