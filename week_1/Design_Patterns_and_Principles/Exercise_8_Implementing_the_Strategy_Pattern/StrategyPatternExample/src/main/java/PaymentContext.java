
public class PaymentContext {
	
	public PaymentStrategy paymentstrategy;
	public PaymentContext(PaymentStrategy paymentstrategy) {
		this.paymentstrategy = paymentstrategy;
	}
	public void executeStrategy(double amount) {
		paymentstrategy.pay(amount);
	}
}
