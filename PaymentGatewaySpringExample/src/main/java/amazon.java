public class amazon implements PaymentGateway {
    public boolean payment(Double Amount) {

            System.out.println("Amazon in Action");
            System.out.println("Executing the order of price : " + Amount);
            System.out.println("Successfull Transaction");
            return true;

    }
}
