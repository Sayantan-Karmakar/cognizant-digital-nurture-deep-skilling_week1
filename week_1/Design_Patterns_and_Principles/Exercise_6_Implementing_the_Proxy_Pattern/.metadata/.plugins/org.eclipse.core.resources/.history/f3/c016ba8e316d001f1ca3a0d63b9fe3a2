
public class ProxyImage implements Image{
	
	public String filename;
	public RealImage realimage;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realimage == null) {
			realimage = new RealImage(filename);
		}
		else {
			System.out.println("Stored in cache: "+filename);
			realimage.display();
		}
	}
	
	
}
