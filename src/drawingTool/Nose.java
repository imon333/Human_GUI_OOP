package drawingTool;

public class Nose {
	private int length, width;
	
	public Nose(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
		
		 Drawing.pen().drawLine(startX, startY, startX+width, startY-length);
		 Drawing.pen().drawLine(startX, startY, startX + (int)(width*3.1), startY-(int)(length*0.3));
	
	}

}
