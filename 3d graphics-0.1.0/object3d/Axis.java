package object3d;

public class Axis extends Object3d{

	int howMany;
	Origin origin;
	int scale;
	
	public Axis(int howMany, Origin origin, int scale) {

		this.howMany = howMany;
		this.origin = origin;
		this.scale = scale;
	
		int oX = origin.getX();
		int oY = origin.getY();
		int oZ = origin.getZ();
		
		for (int i = -(int)(howMany/2); i <= (int)(howMany/2); i++) {
			
			addPoint(new Point(i * scale + oX, oY, oZ));
			addPoint(new Point(oX, i * scale + oY, oZ));
			addPoint(new Point(oX, oY, i * scale + oZ));
			
		}
		
		for (int i = 0; i < howMany-1; i++) {
			
			addConnection(new Connection(points.get(i*3), points.get((i+1)*3)));
			addConnection(new Connection(points.get(i*3+1), points.get((i+1)*3+1)));
			addConnection(new Connection(points.get(i*3+2), points.get((i+1)*3+2)));
			
		}
		
	}
	
}
