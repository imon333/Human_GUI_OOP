package drawingTool;

import java.awt.Color;

public class Hat  {
	
private int length, width;
	
	public Hat(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
		
		  //ground part of hat
		  Drawing.pen().setColor(Color.red); 
		  Drawing.pen().fillRect(startX, startY, length, width);
		 
		  //upper part of hat
		  Drawing.pen().setColor(Color.green); 
		  Drawing.pen().drawLine(startX, startY, startX+(int)(width*1.9), startY-(int)(length/1.5));
		  Drawing.pen().drawLine(startX+(int)(width*1.9), startY-(int)(length/1.5), startX+length, startY);
		  
		  //for upper circle
		  Drawing.pen().setColor(Color.red); 
		  Drawing.pen().fillOval(startX+(int)(width*1.5), startY-(int)(length/1.2),width,width);
		  


		
	}

}
