package window;

import javax.swing.*;

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
