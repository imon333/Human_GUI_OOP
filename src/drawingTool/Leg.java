package drawingTool;

import java.awt.Color;


public class Leg {
	private int length;
	private int width;
	
	
	
	public Leg(int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	
	public int getlength() {
		return length;
	}
	
	public int getwidth() {
		return width;
	}
	
	public void drawAt(int startX, int startY){
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillRect(startX, startY, width, length);
	}

}
