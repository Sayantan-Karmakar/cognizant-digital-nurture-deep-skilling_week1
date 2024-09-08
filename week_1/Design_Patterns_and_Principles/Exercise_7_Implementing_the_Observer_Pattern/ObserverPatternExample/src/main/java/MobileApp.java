
public class MobileApp implements Observer{
	
	private String mobileapp;
	
	public String getMobileapp() {
		return mobileapp;
	}
	public void setMobileapp(String mobileapp) {
		this.mobileapp = mobileapp;
	}
	
	public MobileApp(String mobileapp) {
		setMobileapp(mobileapp);
	}
	@Override
	public void update(String str, double price) {
		// TODO Auto-generated method stub
		System.out.println("Stock: "+str+" Price: "+price+" for: "+mobileapp);
		
	}

}
