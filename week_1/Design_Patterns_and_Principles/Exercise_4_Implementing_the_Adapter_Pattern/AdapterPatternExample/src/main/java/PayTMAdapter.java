
public class PayTMAdapter implements PaymentProcessor{
	
	PayTMGateway paytmgateway = new PayTMGateway();
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		paytmgateway.payment(amount);
	}

}
