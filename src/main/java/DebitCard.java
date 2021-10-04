public class DebitCard extends PaymentCard{
    private int sortCode;
    private int accountNumber;

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public DebitCard(int cardNumber, String expiry, int cvc, int sortCode, int accountNumber) {
        super(cardNumber, expiry, cvc);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return getCharge() * 0.02;
    }

    private double getCharge(double purchaseAmount) {
        return purchaseAmount;
    }

    @Override
    public void charge(double purchaseAmount) {
        purchaseAmount;
    }
}
