package Level3.Exercise1.Model;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    @Override
    public void processPayment(double amount, PaymentCallBack callback){
        System.out.println("Processing payment with credit card...");
        System.out.println("Card: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));

        try{
            if(amount>0 && amount <10000){
                String txId = "CC-" + System.currentTimeMillis();
                callback.onSuccess(txId);
            }else{
                callback.onFailure("Unsuccessful transaction, amount is higher than the limit. Try to use less than 10000");
                throw new InterruptedException();
            }
        }catch (InterruptedException e){
            callback.onFailure("Communication failure with the bank.");
        }
    }

    @Override
    public String getMethodName() {
        return "Credit Card Payment";
    }

}
