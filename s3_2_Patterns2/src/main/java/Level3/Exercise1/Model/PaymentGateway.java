package Level3.Exercise1.Model;

public class PaymentGateway {
    public void processPayment(PaymentRequest request) {
        System.out.println("\n=== Payment Gateway ===");
        System.out.println("Method: " + request.getPaymentMethod().getMethodName());
        System.out.println("Amount: " + request.getAmount() + "€");
        System.out.println("Description: " + request.getDescription());
        System.out.println("================================\n");

        request.getPaymentMethod().processPayment(request.getAmount(), new PaymentCallBack() {
            @Override
            public void onSuccess(String transactionId) {
                System.out.println("\n✓ Payment Successfull!");
                System.out.println("TransactionID: " + transactionId);
                System.out.println("Charged amount: " + request.getAmount() + "€\n");

            }

            @Override
            public void onFailure(String errorMessage) {
                System.out.println("\n✗ Payment UnSuccessfully");
                System.out.println("Reason: " + errorMessage);
                System.out.println("Amount not charged: " + request.getAmount() + "€\n");
            }
        });
    }
}
