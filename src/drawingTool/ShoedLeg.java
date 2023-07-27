package drawingTool;

import java.awt.Color;

public class ShoedLeg extends Leg {
	
	public ShoedLeg(int length, int width){
		super(length, width);
	}
	
	@Override
	public void drawAt(int StartX, int StartY){
		super.drawAt( StartX,StartY);
		Drawing.pen().setColor(Color.green);
		Drawing.pen().fillRect(StartX, StartY+super.getlength(), super.getlength()/3, super.getwidth()/3);
	}
	
	

}
