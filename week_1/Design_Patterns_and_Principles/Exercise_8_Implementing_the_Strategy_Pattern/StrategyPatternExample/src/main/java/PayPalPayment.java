
public class PayPalPayment implements PaymentStrategy{

	private String email;
	public PayPalPayment(String email) {
		setCardnumber(email);
	}
	
	public String getCardnumber() {
		return email;
	}
	public void setCardnumber(String email) {
		this.email = email;
	}
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying "+amount+"/- via PayPal, Email: "+email);
		
	}

}
