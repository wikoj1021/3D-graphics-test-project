package window;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import object3d.Axis;
import object3d.Camera;
import object3d.Connection;
import object3d.Cube;
import object3d.Object3d;
import object3d.Origin;
import object3d.Point;

public class Painter extends JPanel{

	Camera camera;
	object3d.Cube cube;
	
	public Painter() {

		camera = new Camera(new Origin(400, 200, 0));
		//cube = new Cube();		
	
		//cube.getPoints().get(0).setCoordinates(0, 100, 70);
		
		//cube.getPoints().get(0).setCoordinates(10, 10, 5);
		
	}
	
	void reDraw() {
		
		this.repaint();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		drawObjectConnections(g, new Cube(20, new Origin(10, 10, -10)));
		//drawObjectPoints(g, new Axis(20, new Origin(0, 0, 0), 5));
	}
	
	void drawObjectPoints(Graphics g,Object3d o) {
		
		int i = 0;
		
		for (Point point: o.getPoints()) {
			
			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();
			
			System.out.println(i+" "+x+" "+y+" "+z);
			
			x += camera.origin.getX();
			y += camera.origin.getY();
			z += camera.origin.getZ();
			
			double f = 200/z; 
			
			x = (x / f);
			y = y / f;
			
			g.setColor(Color.CYAN);
			
			g.drawOval((int)x, (int)y, 10, 10);
			
			i++;
			
		}
		
	}
	
	void drawObjectConnections(Graphics g,Object3d o) {
		
		//int i = 0;
		
		double x1;
		double y1;
		double z1;
		
		double x2;
		double y2;
		double z2;
		
		double f;
		
		g.setColor(Color.CYAN);
		
		int i = 0;
		
		for (Connection connection: o.getConnetions()) {
			
			x1 = connection.startPoint.getX();
			y1 = connection.startPoint.getY();
			z1 = connection.startPoint.getZ();
			
			x2 = connection.endPoint.getX();
			y2 = connection.endPoint.getY();
			z2 = connection.endPoint.getZ();
						
			x1 += camera.origin.getX();
			y1 += camera.origin.getY();
			z1 += camera.origin.getZ();
			
			x2 += camera.origin.getX();
			y2 += camera.origin.getY();
			z2 += camera.origin.getZ();
			
			//System.out.println(x1+" "+x2);
			//System.out.println(y1+" "+y2);
			//System.out.println(z1+" "+z2);
			
			f = 200/z1; 
			
			x1 = (x1 / f);
			y1 = (y1 / f);
			

			f = 200/z2; 
			
			x2 = (x2 / f);
			y2 = (y2 / f);
			
	//		System.out.println(i+ " " +(x2 - x1));
			
			g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
			
			i++;
			
		}
		
	}
	
	void drawObjectSides(Graphics g,Object3d o) {
		
		int x[];
		int y[];
		int z[];
		int f;
		
		g.setColor(Color.CYAN);
		
		for (Connection connection: o.getConnetions()) {
	
			
			
		}
		
	}
	
	void drawPoint(Graphics g, object3d.Point p){
		
		int x = p.getX();
		int y = p.getY();
		int z = p.getZ();
		
		x += camera.origin.getX();
		y += camera.origin.getY();
		z += camera.origin.getZ();
		
		int f = (int)(z/2); 
		
		x += f;
		y += f;
		
		g.setColor(Color.CYAN);
		
		g.drawOval(x, y, 5, 5);
		
	}
	
}
