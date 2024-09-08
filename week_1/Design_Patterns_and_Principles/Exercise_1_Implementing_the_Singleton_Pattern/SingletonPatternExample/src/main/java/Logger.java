
public class Logger {
	private static Logger obj;
	private Logger(){
		
	}
	public static Logger getInstance() {
		if(obj==null) {
			obj = new Logger();
		}
		return obj;
	}
	public void show(String str, Logger log) {
		System.out.println("Logger: "+str + "-> Address: " + log.hashCode());
	}
}
