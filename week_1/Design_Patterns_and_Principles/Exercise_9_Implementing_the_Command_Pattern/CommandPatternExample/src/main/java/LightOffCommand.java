
public class LightOffCommand implements Command{
	
	private Light light;
	
	public Light getLight() {
		return light;
	}
	public void setLight(Light light) {
		this.light = light;
	}
	
	public LightOffCommand(Light light) {
		setLight(light);
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();
	}
	

}
