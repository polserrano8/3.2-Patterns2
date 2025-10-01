package Level3.Exercise1.Model;

public interface PaymentMethod {
    void processPayment(double amount, PaymentCallBack callBack);
    String getMethodName();
}
