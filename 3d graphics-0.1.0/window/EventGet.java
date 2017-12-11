package window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventGet extends Window{

	//enum dir{UP,DOWN,FORWARD,BACKWARDS,LEFT,RIGHT}
	
	KeyListener key;
	MouseMotionListener mouse;
	
	int lastMousePosX = -1;
	int lastMousePosY = -1;
	
	public EventGet() {
		
		super();
		
		mouse = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				
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
		
		addKeyListener(key);
		
	}
	
	void move(KeyEvent e) {
		
		int id = e.getKeyCode(); 
		
		System.out.println(id);
		
		switch (id) {
		
		case KeyEvent.VK_W:
			canvas.camera.origin.setZ(canvas.camera.origin.getZ()+1);
		break;
		
		case KeyEvent.VK_S:
			canvas.camera.origin.setZ(canvas.camera.origin.getZ()-1);
		break;
		
		case KeyEvent.VK_A:
			canvas.camera.origin.setX(canvas.camera.origin.getX()-10);
		break;
		
		case KeyEvent.VK_D:
			canvas.camera.origin.setX(canvas.camera.origin.getX()+10);
		break;
		
		case KeyEvent.VK_Q:
			canvas.camera.origin.setY(canvas.camera.origin.getY()+10);
		break;
		
		case KeyEvent.VK_E:
			canvas.camera.origin.setY(canvas.camera.origin.getY()-10);
		break;
		
		}
		
		canvas.repaint();
		
	}
	
	void startRotate(MouseEvent e){
	
		int startX = e.getX();
		int startY = e.getY();
		
	}
	
	void rotate(MouseEvent e){
		
		
		
	}
	
	
}
