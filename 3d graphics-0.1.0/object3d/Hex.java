package object3d;

public class Hex extends Object3d {

	int hexSize;
	Origin origin;
	
	public Hex() {
	
		this(100, new Origin());
		
	}
	
	public Hex(int cubeSize) {
		
		this(cubeSize, new Origin());
		
	}
	
	public Hex(int hexSize, Origin origin) {
		
		this.origin = origin;
		
		this.hexSize = hexSize;
		
		int oX = origin.getX();
		int oY = origin.getY();
		int oZ = origin.getZ();
	
		points.addElement(new Point(oX, hexSize+oY, oZ));
		points.addElement(new Point(oX, hexSize+oY, oZ));		
		
		points.addElement(new Point(oX, -hexSize+oY, oZ));
		
	}
		
}
