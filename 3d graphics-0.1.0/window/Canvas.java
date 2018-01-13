package window;

import java.awt.*;
import object3d.*;

public class Canvas extends Painter{

	public Canvas(Logs log, int winWidth, int winHeight) {
		
		super(log, winWidth, winHeight);
		
		setBackground(Color.BLACK);
		
	}
	
	public void moveOrigin(int x, int y, int z) {
		
		camera.origin.setCoordinates(camera.origin.getX()+x, camera.origin.getY()+y, camera.origin.getZ()+z);
		
	}
	
}
