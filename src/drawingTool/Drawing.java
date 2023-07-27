
/**
 * Provides a pen for drawing commands of class "Gaphics".
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you should change nothing!
 * You don't have to add anything here.
 */

package drawingTool;

import java.awt.Graphics;

public class Drawing {

	private static Graphics pen = null;
	
	public static void set(Graphics pen) {
		Drawing.pen = pen;
	}
	
	public static Graphics pen() {
		
		return Drawing.pen;
	}
}