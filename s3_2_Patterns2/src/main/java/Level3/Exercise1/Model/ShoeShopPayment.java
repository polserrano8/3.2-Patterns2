package Level3.Exercise1.Model;

public class ShoeShopPayment {
    PaymentGateway gateway;

    public ShoeShopPayment(){
        this.gateway  = new PaymentGateway();
    }
    public PaymentGateway getGateway(){
        return this.gateway;
    }
    public void processPayment(PaymentRequest paymentRequest1){
        gateway.processPayment(paymentRequest1);
    }

}
