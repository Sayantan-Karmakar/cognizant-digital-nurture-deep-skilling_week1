
public class GooglePayAdapter implements PaymentProcessor{

	GooglePayGateway googlepaygateway = new GooglePayGateway();
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		googlepaygateway.transaction(amount);
	}

}
