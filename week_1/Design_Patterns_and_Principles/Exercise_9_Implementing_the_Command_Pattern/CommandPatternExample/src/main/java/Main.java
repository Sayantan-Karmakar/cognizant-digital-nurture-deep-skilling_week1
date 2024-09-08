
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light bedroomlight = new Light();
		
		Command lightoncommand = new LightOnCommand(bedroomlight);
		Command lightoffcommand = new LightOffCommand(bedroomlight);
		
		RemoteControl wifiremote = new RemoteControl();
		
		wifiremote.setCommand(lightoncommand);
		wifiremote.pressButton();
		
		wifiremote.setCommand(lightoffcommand);
		wifiremote.pressButton();
	}

}
