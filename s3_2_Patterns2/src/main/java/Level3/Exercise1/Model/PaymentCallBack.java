package Level3.Exercise1.Model;

public interface PaymentCallBack {
    void onSuccess(String transactionId);
    void onFailure(String errorMessage);

}
