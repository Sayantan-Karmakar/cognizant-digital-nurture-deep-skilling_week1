
public class WebApp implements Observer{

private String webapp;
	
	public String getWebapp() {
		return webapp;
	}
	public void setWebapp(String webapp) {
		this.webapp = webapp;
	}
	
	public WebApp(String webapp) {
		setWebapp(webapp);
	}
	@Override
	public void update(String str, double price) {
		// TODO Auto-generated method stub
		System.out.println("Stock: "+str+" Price: "+price+" for: "+webapp);
		
	}

}
