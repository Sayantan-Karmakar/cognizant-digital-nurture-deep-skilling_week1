
public class CreditCardPayment implements PaymentStrategy{
	
	private String cardnumber;
	public CreditCardPayment(String cardnumber) {
		setCardnumber(cardnumber);
	}
	
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying "+amount+"/- via Credit Card, Card Number: "+cardnumber);
		
	}
	
}
