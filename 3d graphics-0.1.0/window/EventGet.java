package window;

import java.awt.event.*;

public class EventGet extends Window{

	//enum dir{UP,DOWN,FORWARD,BACKWARDS,LEFT,RIGHT}
	
	KeyListener key;
	MouseMotionListener mouse;
	WindowListener winEvent;
	
	int speed = 5;
	int lastMousePosX = -1;
	int lastMousePosY = -1;
	boolean isFirstMouse = true;
	
	public EventGet() {
		
		super();
		
		mouse = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				rotate(e);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		};
		
		key = new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				move(e);
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		};
		
		winEvent = new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
				log.closeStream();
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		addWindowListener(winEvent);
		addKeyListener(key);
		addMouseMotionListener(mouse);
		
	}
	
	void move(KeyEvent e) {
		
		int id = e.getKeyCode();
		
		switch (id) {
		
		case KeyEvent.VK_W:
			canvas.camera.origin.setZ(canvas.camera.origin.getZ()+speed);
		break;
		
		case KeyEvent.VK_S:
			canvas.camera.origin.setZ(canvas.camera.origin.getZ()-speed);
		break;
		
		case KeyEvent.VK_A:
			canvas.camera.origin.setX(canvas.camera.origin.getX()-speed);
		break;
		
		case KeyEvent.VK_D:
			canvas.camera.origin.setX(canvas.camera.origin.getX()+speed);
		break;
		
		case KeyEvent.VK_Q:
			canvas.camera.origin.setY(canvas.camera.origin.getY()+speed);
		break;
		
		case KeyEvent.VK_E:
			canvas.camera.origin.setY(canvas.camera.origin.getY()-speed);
		break;
		
		case KeyEvent.VK_Z:
			canvas.displayConnections = !canvas.displayConnections;
		break;
			
		case KeyEvent.VK_X:
			canvas.displayDots = !canvas.displayDots;
		break;
		
		case KeyEvent.VK_U:
			canvas.dotSize++;
		break;
		
		case KeyEvent.VK_J:
			canvas.dotSize--;
		break;
		
		case KeyEvent.VK_LEFT:
			rotateByKey(1,0);
			break;
		
		case KeyEvent.VK_RIGHT:
			rotateByKey(-1,0);
			break;
			
		case KeyEvent.VK_UP:
			rotateByKey(0,1);
			break;
		
		case KeyEvent.VK_DOWN:
			rotateByKey(0,-1);
			break;	
		}
		
		canvas.repaint();
		
	}
	
	void rotateByKey(int rotX,int rotY) {
		
		canvas.camera.rotation[0] += 0.02*rotX;
		canvas.camera.rotation[1] += 0.02*rotY;
		canvas.repaint();
		
	}
	
	void rotate(MouseEvent e) {
		/*
		int x = e.getX();
		int y = e.getY();
		
		if(!isFirstMouse) {
			
			canvas.camera.rotation[0] += Math.toRadians((double)(lastMousePosX - x));
			canvas.camera.rotation[1] += Math.toRadians((double)(lastMousePosY - y));
			
		}		
		
		lastMousePosX = x;
		lastMousePosY = y;
		
		isFirstMouse = false;
		
		canvas.repaint();
		*/
	}
	
	void startRotate(MouseEvent e){
	
		int startX = e.getX();
		int startY = e.getY();
		
	}
	
	
}
