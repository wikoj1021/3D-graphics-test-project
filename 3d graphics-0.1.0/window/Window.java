package window;

import javax.swing.*;

public class Window extends JFrame{

	Canvas canvas;
	//public Logs log;
	
	final int WIDTH = 800;
	final int HEIGHT = 600;
	
	public Window() {
	
		
	
		//log = new Logs();
		/*
		log.printLog("test");
		log.endLine();
		log.printLog("test");
		
		log.printLog("test");
		*/
		canvas = new Canvas(/*log,*/ WIDTH, HEIGHT);
		
		setBounds(200, 200, WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
		
		add(canvas);
		
		
		
	}
	
}
