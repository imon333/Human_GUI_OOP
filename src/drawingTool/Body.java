package drawingTool;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.util.logging.Handler;
import java.util.random.RandomGenerator.LeapableGenerator;

public class Body {
	private int length;
	private int width;
	private Hand myHand, myHand2; //composite
	private Leg myLeg, myLeg2; // composite
	private Color color;
	private int x,y;
	
	public void setColor(Color color) {
		this.color = color;
	}
	public Body(int length, int width,int x, int y){
		this.x = x;
		this.y = y;
		
		this.length = length;
		this.width = width;
		
		switch(RandomNumber.between(1, 1))
		{
		case 1:
			myLeg = new ShoedLeg(length, width/3); 
			myLeg2 = new ShoedLeg(length, width/3);
		break;
		
		case 2:
			myLeg = new Leg(length, width/3); 
			myLeg2 = new Leg(length, width/3);
			
		}
		
		myHand = new Hand(length-20, width/4);
		myHand2 = new Hand(length-20, width/4);
					
	}
		public int getWidth() {
		
		return width+myHand.getWidth();
	     }
		
		public int getLength() {
			
			return length+myHand.getLength();
		}
		
		public void draw() {
			drawAt(x,y);
			
		}
	
	public void drawAt(int startX ,int startY ) {
		
		    //drawing the body only with line″
		
		    Drawing.pen().setColor(color);
		    Drawing.pen().drawLine(startX, startY, startX + width, startY);
		    Drawing.pen().drawLine(startX + width, startY, startX + width-5, startY + length);
		    Drawing.pen().drawLine(startX + width-5, startY + length, startX+5 , startY + length);
		    Drawing.pen().drawLine(startX+5, startY+length, startX, startY );
		    
		    
		    //we can draw the body only with rectShape
		    //Drawing.pen().fillRect(startX, startY, width, length); 
		    			
		    
		    // Create a Path2D.Double object with the lines
		    Path2D.Double shape = new Path2D.Double();
		    shape.moveTo(startX, startY);
		    shape.lineTo(startX + width, startY);
		    shape.lineTo(startX + width - 5, startY + length);
		    shape.lineTo(startX + 5, startY + length);
		    shape.closePath();

		    // Fill the shape with the current color
		    Graphics2D g2d = (Graphics2D) Drawing.pen();
		    g2d.fill(shape);
		    
		    
		    myLeg.drawAt( startX+5, startY + myLeg.getlength());
		    myLeg2.drawAt( startX+width-width/3-5, startY + myLeg.getlength());
		    
		   switch(RandomNumber.between(1, 2)) {
		   case 1:
			   myHand.drawAt(startX - width/4, startY);
			   myHand2.drawAt(startX + width, startY);
			   break;
			   
		   case 2:
			   myHand.drawAt(startX - width/4, startY, true);
			   myHand2.drawAt(startX + width, startY, true);
			   break;
		   }
		   
		    
		    
	}
	
}
