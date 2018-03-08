

public class PaymentProcess implements PaymentProcessInterface {


    private static PaymentProcess paymentProcess = null;
    private PaymentGateway paymentGateway;


    private PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }



    @Override
    public void startPaymentProcess(Double price) {
        System.out.println("Moving to payment Gateway");
        getPaymentGateway().payment(price);

    }
    private PaymentProcess()
    {

    }
    public static PaymentProcess getInstance()
    {
        if(paymentProcess == null)
        {
            paymentProcess = new PaymentProcess();
        }
        return paymentProcess;
    }


}
