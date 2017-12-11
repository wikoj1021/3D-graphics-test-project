package window;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Window extends JFrame{

	Canvas canvas;
	
	public Window() {
	
		canvas = new Canvas();
		
		setBounds(200, 200, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
		
		add(canvas);
		
	}
	
}
