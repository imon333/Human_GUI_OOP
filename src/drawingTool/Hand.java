package drawingTool;

import java.awt.Color;

public class Hand {
	private int length;
	private int width;
	
	public Hand(int length, int width) {
		this.length = length;
		this.width = width;
	}
		public int getWidth() {
		
		return width;
		
	     }
		public int getLength() {
			
			return length;
		}
	
		
	public void drawAt(int StartX, int StartY, boolean x){
			Drawing.pen().setColor(Color.blue);
	        Drawing.pen().fillRect(StartX, StartY, width, length);
	}
	
	public void drawAt(int startX, int startY){
		Drawing.pen().setColor(Color.blue);
        Drawing.pen().fillRect(startX, startY, width, length);
        
		// right hand
		//Drawing.pen().fillRect(startX + width+width/4, startY, width/4, length-20); 
	}


}
