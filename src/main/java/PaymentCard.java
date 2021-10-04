import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable{
   private int cardNumber;
   private String expiry;
   private int cvc;
   private ArrayList<Double> charges;

    public PaymentCard(int cardNumber, String expiry, int cvc) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvc = cvc;
        this.charges = new ArrayList<Double>();
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);
    }
}
