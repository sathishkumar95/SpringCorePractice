import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PaymentProcess implements PaymentProcessInterface {

    @Autowired
    @Qualifier("paymentProcess")
    private static PaymentProcess paymentProcess = null;

    @Autowired
    @Qualifier("amazon")
    private PaymentGateway paymentGateway;


    private PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }


//    public void setPaymentGateway(PaymentGateway paymentGateway) {
//        this.paymentGateway = paymentGateway;
//    }


    public void startPaymentProcess(Double price) {
        System.out.println("Moving to payment Gateway");
        getPaymentGateway().payment(price);

    }



    private PaymentProcess()
    {

    }

//    public static PaymentProcess getInstance()
//    {
//        if(paymentProcess == null)
//        {
//            paymentProcess = new PaymentProcess();
//        }
//        return paymentProcess;
//    }


}
