package object3d;

public class Camera {

	public Origin origin;
	public double rotation[] = {0,0};
	
	public Camera(){
	
		this(new Origin());
		
	}	
	
	public Camera(Origin origin) {
		
		this.origin  = origin;
		
	}
	
}
