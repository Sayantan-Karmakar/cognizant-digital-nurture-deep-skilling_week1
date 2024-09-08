
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentContext payment1 = new PaymentContext(new CreditCardPayment("1234-2345-3456-4567"));
		PaymentContext payment2 = new PaymentContext(new PayPalPayment("abc123@gmail.com"));
		payment1.executeStrategy(150.5);
		payment2.executeStrategy(250.5);
	}

}
