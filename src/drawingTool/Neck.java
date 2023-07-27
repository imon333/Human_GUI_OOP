package drawingTool;

import java.awt.Color;

public class Neck {
	private  int length;
	private int width;
	
	public Neck(int length, int width) { 
		this.length = length;
		this.width = width;
		
	}

	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
public void drawAt(int startX, int startY){
		
		Drawing.pen().setColor(Color.gray);
	    Drawing.pen().drawRect(startX, startY ,width, length);
	    
	}

}
