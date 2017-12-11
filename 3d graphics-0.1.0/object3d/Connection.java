package object3d;

public class Connection	{

	public Point startPoint;
	public Point endPoint;
	
	public Connection() {
		
		this(new Point(), new Point());
		
	}
	
	public Connection(Point startPoint, Point endPoint) {
		
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
}
