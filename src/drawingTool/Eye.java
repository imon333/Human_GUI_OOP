package drawingTool;

import java.awt.Color;

public class Eye {
	private int length, width;
	
	public Eye (int length, int width) {
		this.length = length;
		this.width = width;
	} 

	public void drawAt(int startX, int startY) {
		
		//for left eye
		
		Drawing.pen().setColor(Color.white);
		Drawing.pen().fillOval(startX, startY, length, width);
		
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(startX, startY, (int)(length/1.3), (int)(width/1.3)); 
		
		//for right eye
	
		//Drawing.pen().setColor(Color.white);
		//Drawing.pen().fillOval(startX + (int)(width/2.5), startY, (int)(length*0.15), (int)(width*0.1001));
	
		//Drawing.pen().setColor(Color.black);
		//Drawing.pen().fillOval(startX + (int)(width/2.4), startY, (int)(length*0.1), (int)(width*0.091)); 
		
		
	}
	
}
