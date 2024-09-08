
public class SMSNotifierDecorator extends NotifierDecorator{

	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void send(String str) {
		// TODO Auto-generated method stub
		super.send(str);
		System.out.println("Notifies via SMS: "+str);
	}

}
