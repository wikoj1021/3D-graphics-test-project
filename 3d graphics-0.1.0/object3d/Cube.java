package object3d;

public class Cube extends Object3d{

	int cubeSize;
	Origin origin;
	
	public Cube() {
	
		this(100, new Origin());
		
	}
	
	public Cube(int cubeSize) {
		
		this(cubeSize, new Origin());
		
	}
	
	public Cube(int cubeSize, Origin origin) {
		
		this.origin = origin;
		
		this.cubeSize = cubeSize;
		
		int oX = origin.getX();
		int oY = origin.getY();
		int oZ = (int)(origin.getZ()/10);
		
		addPoint(new Point(cubeSize+oX, cubeSize+oY, cubeSize+oZ));
		addPoint(new Point(cubeSize+oX, -cubeSize+oY, cubeSize+oZ));
		addPoint(new Point(-cubeSize+oX, -cubeSize+oY, cubeSize+oZ));
		addPoint(new Point(-cubeSize+oX, cubeSize+oY, cubeSize+oZ));		
		
		addPoint(new Point(cubeSize+oX, cubeSize+oY, -cubeSize+oZ));
		addPoint(new Point(cubeSize+oX, -cubeSize+oY, -cubeSize+oZ));
		addPoint(new Point(-cubeSize+oX, -cubeSize+oY, -cubeSize+oZ));
		addPoint(new Point(-cubeSize+oX, cubeSize+oY, -cubeSize+oZ));
		
		addConnection(new Connection(points.get(0), points.get(1)));
		addConnection(new Connection(points.get(1), points.get(2)));
		addConnection(new Connection(points.get(2), points.get(3)));
		addConnection(new Connection(points.get(3), points.get(0)));
		
		addConnection(new Connection(points.get(4), points.get(5)));
		addConnection(new Connection(points.get(5), points.get(6)));
		addConnection(new Connection(points.get(6), points.get(7)));
		addConnection(new Connection(points.get(7), points.get(4)));
		
		addConnection(new Connection(points.get(0), points.get(4)));
		addConnection(new Connection(points.get(1), points.get(5)));
		addConnection(new Connection(points.get(2), points.get(6)));
		addConnection(new Connection(points.get(3), points.get(7)));
		
	}
	
	
	
}
