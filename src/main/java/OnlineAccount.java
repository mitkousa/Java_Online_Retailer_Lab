import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<PaymentCard> paymentMethods;
    public ArrayList<Double> transactionFees;

    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<>();
        this.transactionFees = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PaymentCard> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(ArrayList<PaymentCard> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public ArrayList<Double> getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(ArrayList<Double> transactionFees) {
        this.transactionFees = transactionFees;
    }
}
