package object3d;

public class Point {

	private int x;
	private int y;
	private int z;
	
	public Point() {
		
		x = 0;
		y = 0;
		z = 0;		
		
	}
	
	public Point(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;				
		
	}
	
	public void setCoordinates(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public void setX (int x) {
		
		this.x = x;
		
	}
	
	public void setY (int y) {
			
			this.y = y;
			
	}
	
	public void setZ (int z) {
		
		this.z = z;
		
	}
	
	public int getX() {
		
		return this.x;
		
	}
	
	public int getY() {
		
		return this.y;
		
	}
	
	public int getZ() {
		
		return this.z;
		
	}
	
}
