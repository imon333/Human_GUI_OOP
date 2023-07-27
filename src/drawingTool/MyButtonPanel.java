package drawingTool;
import javax.management.loading.PrivateClassLoader;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class MyButtonPanel extends JPanel {
	
    private JButton aButton,aButton1,aButton2,sizeS,sizeM,sizeL,rBcolor,rBSize,headB,bodyB,humanB;
    private JPanel colorPanel, sizePanel, statePanel;

    public MyButtonPanel() {
    	this.setPreferredSize(new Dimension(200, 100));
		this.setBackground(Color.gray);
		this.setLayout(new GridLayout(3,1,10,10));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		colorPanel = new JPanel();
		sizePanel = new JPanel();
		statePanel = new JPanel();
    	
		colorPanel.setPreferredSize(new Dimension(200, 100));
		sizePanel.setPreferredSize(new Dimension(200, 100));
		statePanel.setPreferredSize(new Dimension(200, 100));

		colorPanel.setBackground(new Color(255,255,255)); 
		sizePanel.setBackground(new Color(255,255,255));
		statePanel.setBackground(new Color(255,255,255));
    	
		this.add(colorPanel);
		this.add(sizePanel);
		this.add(statePanel);
		
		this.constructMyButtons();
    }
		
		private void constructMyButtons() {
			
			aButton = new JButton("Green");	   
	    	aButton1 = new JButton("Blue");	    	
	    	aButton2 = new JButton("Yellow");	    	
	        rBcolor = new JButton("Random");	    	
	        sizeS = new JButton("Small");        
	    	sizeM = new JButton("Medium");
	    	sizeL = new JButton("Large");
	        rBSize = new JButton("Random");
	        headB = new JButton("Just_Head");
	        bodyB = new JButton("Gost");
	        humanB = new JButton("full Human");

			JLabel colorHumanPanel = new JLabel();
			colorHumanPanel.setText("Please choose the Color!");
			colorHumanPanel.setHorizontalAlignment(JLabel.CENTER);
			
			colorPanel.setLayout(new GridLayout(5,1,10,10));
			colorPanel.add(colorHumanPanel);		
			colorPanel.add(aButton);
			colorPanel.add(aButton1);
			colorPanel.add(aButton2);
			colorPanel.add(rBcolor);
			
			JLabel sizeHumanPanel = new JLabel();
			sizeHumanPanel.setText("Resize , if you want to:");
			sizeHumanPanel.setHorizontalAlignment(JLabel.CENTER);
			
			sizePanel.setLayout(new GridLayout(5,1,10,10));
			
			sizePanel.add(sizeHumanPanel);		
			sizePanel.add(sizeS);
			sizePanel.add(sizeM);
			sizePanel.add(sizeL);
			sizePanel.add(rBSize);
		 	
			JLabel stateHumanPanel = new JLabel();
			stateHumanPanel.setText("What do you want to keep");
			stateHumanPanel.setHorizontalAlignment(JLabel.CENTER);
			
			statePanel.setLayout(new GridLayout(4,1,10,10));
			
			statePanel.add(stateHumanPanel);		
			statePanel.add(headB);
			statePanel.add(bodyB);
			statePanel.add(humanB);

		}
        
    public JButton getButton() {
    	return aButton;
    }
    public JButton getButton1() {
    	return aButton1;
    }
    public JButton getButton2() {
    	return aButton2;
    }
    public JButton getSizeSbutton() {
    	return sizeS;
    }
    public JButton getSizeMbutton() {
    	return sizeM;
    }
    public JButton getSsizeLbutton() {
    	return sizeL;
    }
    public JButton getRsizebutton() {
    	return rBcolor;
    }
    public JButton getRcolorbutton() {
    	return rBSize;
    }
    public JButton getHeadbutton() {
    	return headB;
    }
    public JButton getBodybutton() {
    	return bodyB;
    }
    public JButton getHumanbutton() {
    	return humanB;
    }
}
