
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor paytm = new PayTMAdapter();
		PaymentProcessor googlepay = new GooglePayAdapter();
		paytm.processPayment(500.0);
		googlepay.processPayment(1000.0);
	}

}
