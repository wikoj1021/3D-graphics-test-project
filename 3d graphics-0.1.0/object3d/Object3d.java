package object3d;

import java.util.Vector;

public class Object3d {

	Vector<Point> points;
	Vector<Connection> connections;
	
	public Object3d() {
		
		points = new Vector<>();
		connections = new Vector<>();
		
	}
	
	public Vector<Point> getPoints() {
		
		return points;
		
	}
	
	public Point[] getPointsArray () {
		
		Point[] points = new Point[0]; 
		
		this.points.toArray(points);
		
		return points;
		
	}
	
	public void addPoint(Point point) {

		points.addElement(point);
		
	}
	
	public Vector<Connection> getConnetions() {
		
		return connections;
		
	}
	
	public Connection[] getConnectionsArray () {
		
		Connection[] connections = new Connection[0]; 
		
		this.connections.toArray(connections);
		
		return connections;
		
	}
	
	public void addConnection(Connection connection) {
		
		connections.addElement(connection);
		
	}
		
}
