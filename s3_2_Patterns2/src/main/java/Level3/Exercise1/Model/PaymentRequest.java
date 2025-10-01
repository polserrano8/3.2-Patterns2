package Level3.Exercise1.Model;

public class PaymentRequest {
    private PaymentMethod paymentMethod;
    private double amount;
    private String description;

    public PaymentRequest(PaymentMethod paymentMethod, double amount, String description){
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.description = description;
    }
    public PaymentMethod getPaymentMethod(){
        return paymentMethod;
    }
    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

}
