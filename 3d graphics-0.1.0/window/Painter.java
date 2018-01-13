package window;

import java.awt.*;
import javax.swing.*;

import object3d.*;
import object3d.Point;

public class Painter extends JPanel{

	Camera camera;
	object3d.Cube cube;
	Object3d obj;
	Logs log;
	
	double cx,cy;
	
	boolean displayDots = false;
	boolean displayConnections = true;
	
	int dotSize = 10;
	
	public Painter(Logs log, int winWidth, int winHeight) {

		this.log = log;
		
		camera = new Camera(new Origin(0, 0, 0));
		
		cx = winWidth/2;
		cy = winHeight/2;
		
	}
	
	void reDraw() {
		
		this.repaint();
		
	}
	
		
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		if (displayConnections)drawObjectConnections(g, new Cube(3, new Origin(0, 0, 100)));
		if (displayDots)drawObjectPoints(g, new Cube(20, new Origin(0, 0, -10)));
		
	}
	
	void drawObjectPoints(Graphics g,Object3d o) {
		
		int i = 0;
		
		log.printLog("_______start points_______");
		log.endLine();
		log.endLine();
		log.endLine();
		
		for (Point point: o.getPoints()) {
			
			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();
			
			log.printLog("points:");
			log.endLine();
			log.printLog("x : "+x+" y: "+y+" z: "+z);
			log.endLine();
			
			log.printLog("camera: ");
			log.endLine();
			log.printLog("x : "+camera.origin.getX()+" y: "+camera.origin.getY()+" z: "+camera.origin.getZ());
			log.endLine();
			
			log.printLog("points & camera: ");
			log.endLine();

			x += camera.origin.getX();
			y += camera.origin.getY();
			z += camera.origin.getZ();
			
			log.printLog("x : "+x+" y: "+y+" z: "+z);
			log.endLine();
			
			if(z > 0) {
				
				
				double f = 200/z;
				
				x = x/f;
				y = y/f;
				
				log.printLog("x : "+x+" y: "+y+" f: "+f);
				log.endLine();
				
				g.setColor(Color.CYAN);
				
				g.drawOval((int)x-(int)(dotSize/2), (int)y-(int)(dotSize/2), dotSize, dotSize);
				
				i++;
			}
			else {
				log.printLog("not drawing");
				log.endLine();
			}
			
			log.endLine();
			log.endLine();
		}
	
		log.printLog("_______end points_______");
		log.endLine();
		log.endLine();
	}
	
	void drawObjectConnections(Graphics g,Object3d o) {
		
		//int i = 0;
		
		double x[] = new double[2];
		double y[] = new double[2];
		double z[] = new double[2];
		
		double f;
		
		g.setColor(Color.CYAN);
		
		//int i = 0;
		
		log.printLog("_______start points_______");
		log.endLine();
		
		for (Connection connection: o.getConnetions()) {
			
			
			
			x[0] = connection.startPoint.getX();
			y[0] = connection.startPoint.getY();
			z[0] = connection.startPoint.getZ();
			
			x[1] = connection.endPoint.getX();
			y[1] = connection.endPoint.getY();
			z[1] = connection.endPoint.getZ();		
			
			for(int i = 0; i < 2; i++) {
				
				x[i] -= camera.origin.getX();
				y[i] -= camera.origin.getY();
				z[i] -= camera.origin.getZ();				
				
				//System.out.println(x[i]+" , "+z[i]);
				
				x[i] = x[i]*Math.cos(camera.rotation[0]) - z[i]*Math.sin(camera.rotation[0]);
				z[i] = x[i]*Math.sin(camera.rotation[0]) + z[i]*Math.cos(camera.rotation[0]);
				
				y[i] = y[i]*Math.cos(camera.rotation[1]) - z[i]*Math.sin(camera.rotation[1]);
				z[i] = y[i]*Math.sin(camera.rotation[1]) + z[i]*Math.cos(camera.rotation[1]);
				
				f = 200/z[i];
				
				x[i] *= f;  
				y[i] *= f; 
				
			}
			
			g.drawLine((int)(x[0]+cx), (int)(y[0]+cy), (int)(x[1]+cx), (int)(y[1]+cy));
			}
		}
		/*
		for (Connection connection: o.getConnetions()) {
			
			x1 = connection.startPoint.getX();
			y1 = connection.startPoint.getY();
			z1 = connection.startPoint.getZ();
			
			x2 = connection.endPoint.getX();
			y2 = connection.endPoint.getY();
			z2 = connection.endPoint.getZ();
			
			
			log.printLog("points: ");
			log.endLine();

			log.printLog("x1: "+x1+" y1: "+y1+" z1: "+z1);
			log.endLine();
			
			log.printLog("x2: "+x2+" y2: "+y2+" z2: "+z1);
			log.endLine();
			
			x1 -= camera.origin.getX();
			y1 -= camera.origin.getY();
			z1 -= camera.origin.getZ();
			
			x2 -= camera.origin.getX();
			y2 -= camera.origin.getY();
			z2 -= camera.origin.getZ();
			
			log.printLog("camera:");
			log.endLine();
			log.printLog("x: "+camera.origin.getX()+" y: "+camera.origin.getY()+" z: "+camera.origin.getZ());
			log.endLine();
			
			log.printLog("points & camera: ");
			log.endLine();
			
			f = 100/z1; 
			
			x1 = (x1 / f);
			y1 = (y1 / f);
			
			log.printLog("x1: "+x1+" y1: "+y1+" z1: "+z1+" f1: "+f);
			log.endLine();
			
			f = 100/z2; 
			
			x2 = (x2 / f);
			y2 = (y2 / f);
			
			log.printLog("x2: "+x2+" y2: "+y2+" z2: "+z1+" f2: "+f);
			
			g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
			
			i++;
			
			
		}
		
		log.printLog("_______end points_______");
		log.endLine();
		log.endLine();
		
	}
	*/
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
