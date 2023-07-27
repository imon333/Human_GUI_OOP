/**
 * Provides a test application window with a panel "DrawingArea".
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you just have to change the title of your window.
 * 
 */

package drawingTool;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestDrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private MyButtonPanel button;

	public TestDrawingTool(String title) {
		super(title);

//        constructDrawingArea();
//        constructButtons();

		// setLayout(new GridLayout(2, 2)); // Set GridLayout with 2 rows and 2 columns

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);
		System.out.println(screenSize);

		this.setLayout(new GridLayout(1, 2));
		drawing = new DrawingArea();
		button = new MyButtonPanel();
		add(button, 0);
		add(drawing, 1);
		setVisible(true);

		// addACanvas(drawing, BorderLayout.CENTER);
		// addACanvas(button, BorderLayout.WEST);

		// Register the TestDrawingTool instance as the ActionListener for the button
		button.getButton().addActionListener(this);
		button.getButton1().addActionListener(this);
		button.getButton2().addActionListener(this);
		button.getRsizebutton().addActionListener(this);

		button.getSizeSbutton().addActionListener(this);
		button.getSizeMbutton().addActionListener(this);
		button.getSsizeLbutton().addActionListener(this);
		button.getRcolorbutton().addActionListener(this);
		
		button.getHeadbutton().addActionListener(this);
		button.getBodybutton().addActionListener(this);
		button.getHumanbutton().addActionListener(this);
	
	}
//    
//     public void addACanvas(JPanel p, String S) {
//		this.add(p,S);
//	}

	/*
	 * private void constructDrawingArea() { drawing = new DrawingArea();
	 * add(drawing,BorderLayout.CENTER); }
	 * 
	 * private void constructButtons() { button = new MyButtonPanel();
	 * add(button,BorderLayout.WEST); }
	 */

	public static void main(String[] args) {
		new TestDrawingTool("Draw a Human");
		Leg l = new Leg(0, 0);
		l.getwidth();
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button.getButton()) {
			tidyUpDrawingArea();
			drawing.changeColor(Color.green);

		} else if (e.getSource() == button.getButton1()) {
			tidyUpDrawingArea();
			drawing.changeColor(Color.blue);

		} else if (e.getSource() == button.getButton2()) {
			tidyUpDrawingArea();
			drawing.changeColor(Color.yellow);

		} else if (e.getSource() == button.getRsizebutton()) {
			tidyUpDrawingArea();
			drawing.changeColor(new Color((RandomNumber.between(0, 255)), RandomNumber.between(16, 195),
					RandomNumber.between(0, 45)));
		} else if (e.getSource() == button.getSizeSbutton()) {
			tidyUpDrawingArea();
			drawing.changeSize(3);

		} else if (e.getSource() == button.getSizeMbutton()) {
			tidyUpDrawingArea();
			drawing.changeSize(2);

		} else if (e.getSource() == button.getSsizeLbutton()) {
			tidyUpDrawingArea();
			drawing.changeSize(1);
			//drawing.repaint();

		} else if (e.getSource() == button.getRcolorbutton()) {
			tidyUpDrawingArea();
			drawing.changeSize(RandomNumber.between(1, 3));

			// for state pattern
			
		}else if (e.getSource() == button.getHeadbutton()) {
			Scene.setGraphicState(Scene.getGraphicState().drawHead());
			tidyUpDrawingArea();
			
			
		}else if (e.getSource() == button.getBodybutton()) {
			Scene.setGraphicState(Scene.getGraphicState().drawghost());
			tidyUpDrawingArea();
			
			
		}
		else if (e.getSource() == button.getHumanbutton()) {
			Scene.setGraphicState(Scene.getGraphicState().drawHuman());
			tidyUpDrawingArea();
			
			
		}

	}
}
