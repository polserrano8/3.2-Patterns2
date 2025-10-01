package Level3.Exercise1.Model;

public class BankDebitPayment implements PaymentMethod{
    private String iban;
    public BankDebitPayment(String iban){
        this.iban = iban;
    }
    @Override
    public void processPayment(double amount, PaymentCallBack callback){
        System.out.println("Processing payment with Paypal:");
        System.out.println("Account: " + iban);
        try{
            if(iban.length() >= 20){
                String txId = "BD-" + System.currentTimeMillis();
                callback.onSuccess(txId);
            }else{
                callback.onFailure("Invalid IBAN.");
                throw new InterruptedException();
            }
        }catch(InterruptedException e){
            callback.onFailure("Bank connection error. To review");
        }
    }

    @Override
    public String getMethodName() {
        return "Bank Deposit Payment";
    }
}
