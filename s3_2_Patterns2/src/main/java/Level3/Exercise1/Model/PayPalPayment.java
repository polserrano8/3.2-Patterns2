package Level3.Exercise1.Model;

public class PayPalPayment implements PaymentMethod{
    private String email;
    public PayPalPayment(String email){
        this.email = email;
    }
    @Override
    public void processPayment(double amount, PaymentCallBack callback){
        System.out.println("Processing payment with Paypal:");
        System.out.println("Account: " + email);
        try{
            if(email.contains("<@")){
                String txId = "PP-" + System.currentTimeMillis();
                callback.onSuccess(txId);
            }else{
                callback.onFailure("Invalid Paypal email.");
                throw new InterruptedException();
            }
        }catch(InterruptedException e){
            callback.onFailure("Paypal connection error. To review");
        }
    }

    @Override
    public String getMethodName() {
        return "PayPal Payment";
    }
}
