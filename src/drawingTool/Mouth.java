package drawingTool;

//import java.awt.Color;

public class Mouth {

private int length, width;
	
	public Mouth(int length, int width) {
		this.length = length;
		this.width = width;
	} 
	
	public void drawAt(int startX, int startY) {
		
	      // Drawing.pen().drawArc(50, 50, 20, 20, -45, -90);
	      
		Drawing.pen().drawArc(startX, startY,length, width, -45, -90);
		
	}
}
		
	


