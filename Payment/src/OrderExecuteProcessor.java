public class OrderExecuteProcessor {
     private Orders order;

    private static OrderExecuteProcessor orderExecuteProcessor = null;
    private PaymentProcess paymentProcess = null;

    private void setPaymentProcess(PaymentProcess paymentProcess) {
        this.paymentProcess = paymentProcess;
    }

    public PaymentProcess getPaymentProcess() {
        return paymentProcess;
    }

    private OrderExecuteProcessor()
    {

    }

    public static OrderExecuteProcessor getInstance()
    {
        if(orderExecuteProcessor == null)
        {
            orderExecuteProcessor = new OrderExecuteProcessor();
        }
        return orderExecuteProcessor;
    }

    public void setOrder(Orders order) {
        this.order = order;
        System.out.println("Got the order!! Moving to Payment");
        paymentProcess = PaymentProcess.getInstance();
    }

    public void startPaymentProcess()
    {
        paymentProcess = PaymentProcess.getInstance();
        setPaymentProcess(paymentProcess);
        paymentProcess.startPaymentProcess(order.getTotalPrice());
    }



}
