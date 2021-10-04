public class GiftCard implements IChargeable{
    private String vendor;
    private double balance;

    public GiftCard(String vendor, double balance) {
        this.vendor = vendor;
        this.balance = balance;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }

    @Override
    public void charge(double purchaseAmount) {

    }
}
