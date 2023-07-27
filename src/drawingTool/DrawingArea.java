
/**
 * Provides a panel on which an object of class "Graphics" can draw.
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you have to add two lines of code:
 * 		+ instantiate one object of your domain class
 * 		+ call its drawAt-method
 */

package drawingTool;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.security.PublicKey;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {
	
	private Scene myScene;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Drawing.set(g);
		
		if(myScene == null) {
			myScene = new Scene();
			myScene.drawAt();
		} else {
			myScene.drawAt();
		}
	}

	public void changeSize(int n) {
		myScene.setN(n);
		myScene.drawAt();
	}
	
	public void changeColor(Color c) {
		myScene.changeColorAll(c);
	}
	
	
//	public Scene getMyScene() {
//		return myScene;
//	}
//	
//	public void setMyScene(Scene myScene) {
//		this.myScene = myScene;
//	}
	
}
