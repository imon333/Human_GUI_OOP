package drawingTool;

import java.awt.Color;
import java.nio.channels.CancelledKeyException;

import javax.print.attribute.HashAttributeSet;

public class Head {
	private int headLength, headWidth;
	private Eye leftEye ,rightEye; //composite
	private Nose myNose; //composite
	private Mouth myMouth; //composite
	private Hat myHat; //aggregate
	private Color color;
	private int x;
	private int y;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Head(int length, int width, int x, int y) {
		this.x = x;
		this.y = y;
		this.headLength = length;
		this.headWidth = width;
	
		leftEye = new Eye((int)(length*0.15), (int)(width*0.1001));
		rightEye = new Eye((int)(length*0.15), (int)(width*0.1001));
		
		myNose = new Nose((length/5), (int)(width*0.05));
		myMouth = new Mouth((int)(length * 0.4), (int)(width * 0.4));
		myHat = new Hat(length, width/5);
		
	}
	
	public int getLength() {
		return headLength;
	}
	
	public int getWidth() {
		return headWidth;
	}
	public void draw() {
		drawAt(x,y);
		
	}
	
	
	public void drawAt(int startX, int startY) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(startX, startY, headLength, headWidth ); 
		leftEye.drawAt(startX + (int)(headWidth/5.4), startY+(int)(headLength*0.45));
		rightEye.drawAt((int)(startX + (int)(headWidth/4.4) * 2.7), startY+(int)(headLength*0.45));
		myNose.drawAt(startX + (int)(headWidth/2.5), startY+(int)(headLength/1.5));
		myMouth.drawAt(startX+ (int)(headWidth/3.5), startY+(int)(headLength/2.5));
		myHat.drawAt(startX, startY);
	}
	

}
