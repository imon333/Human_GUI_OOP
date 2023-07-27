package drawingTool;

import java.awt.Point;

public class Human implements LocatedRectangle {
	private Body myBody; // composite
	private Head myHead; // composite
	private Neck myNeck; // composite
	private int length;
	private int width;
	private int scale;
	private int x;
	private int y;
	
	
	public void  setMyBody(Body myBody) {
		this.myBody = myBody;
	}
	
	public Human(int x, int y, int scale) {
		int length = 155;
		int width = 135;
		this.scale = scale;
		this.x = x;
		this.y = y;
		myBody = new Body(length / scale, width / scale, x,y);

		double neckSize = 3.5;
		double neckSize2 = 3.9;
		myNeck = new Neck(((int) (length / neckSize)) / scale, ((int) (135 / neckSize2)) / scale);

		double headSize = 1.82;
		double headSize2 = 1.42;
	    myHead = new Head(((int) (length / 1.82)) / scale, (int) (width / 1.42) / scale, 
	    		x + (int) ((int) (width / 1.42) / scale / 3.5), y - (int) (((int) (length / 1.82)) / scale * 1.57));
	}

	public void drawAt(int x, int y) {
		myBody.drawAt(x, y);
		double neckSize = 1.45;
		myNeck.drawAt(x + (int) (myNeck.getWidth() * neckSize), y - myNeck.getLength());
		myHead.drawAt(x + (int) (myHead.getWidth() / 3.5), y - (int) (myHead.getLength() * 1.57));
	}

	@Override
	public Point address() {
		return new Point(x, y);
	}

	@Override
	public int width() {
		return 300 / scale;
	}

	@Override
	public int length() {
		return 700 / scale;
	}

	@Override
	public void draw() {
		this.drawAt(this.x, this.y);
		
	}
	
	public Body getMyBody() {
		return myBody;
	}
	
	
	public Head getMyHead() {
		return myHead;
	}
	

}
