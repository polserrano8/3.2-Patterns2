package Level3.Exercise1;

import Level3.Exercise1.Model.*;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        PaymentMethod creditCard = new CreditCardPayment("4532123456789012", "123");
        PaymentRequest request1 = new PaymentRequest(creditCard, 150.50, "Online purchase");
        gateway.processPayment(request1);


        PaymentMethod paypal = new PayPalPayment("happylife@yahoo.com");
        PaymentRequest request2 = new PaymentRequest(paypal, 75.00, "Mensual Subscription");
        gateway.processPayment(request2);


        PaymentMethod bankDebit = new BankDebitPayment("ES9121000418450200051332");
        PaymentRequest request3 = new PaymentRequest(bankDebit, 200.00, "Services Invoice");
        gateway.processPayment(request3);


        PaymentMethod creditCard2 = new CreditCardPayment("4532987654321098", "456");
        PaymentRequest request4 = new PaymentRequest(creditCard2, 15000.00, "Fraudulent charge");
        gateway.processPayment(request4);

    }
}
