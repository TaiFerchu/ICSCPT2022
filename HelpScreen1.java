import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.event.*;

/**
 * <h1>First Help Screen</h1>
 * <p>GUI for the First Help Screen</p>
 */
public class HelpScreen1 extends JPanel implements ActionListener{
	//Properties
	/** help screen background image*/	
	BufferedImage helpBG = null;
	/** example board image*/	
	BufferedImage help1 = null;
	/** example board image*/	
	BufferedImage help2 = null;
	/** example board image*/	
	BufferedImage help3 = null;
	
	/** first text area*/	
	JTextArea helpText;
	/** second text area*/	
	JTextArea helpText2;
	/** continues to next help page*/	
	JButton continueButton;
	
	//Methods
	public void actionPerformed(ActionEvent evt){
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// Images
		g.drawImage(helpBG, 0,0, null);
		g.drawImage(help1, 200,400, this);
		g.drawImage(help2, 400,400, this);
		g.drawImage(help3, 600,400, this);
	}
	// Constructor	
	/** constructor, load images, set state of JComponents*/	
	public HelpScreen1(){
		super();
		try{
			helpBG = ImageIO.read(new File("HelpBG.png"));
			help1 = ImageIO.read(new File("SampleBoardHelp1.png"));
			help2 = ImageIO.read(new File("SampleBoardHelp2.png"));
			help3 = ImageIO.read(new File("SampleBoardHelp3.png"));
		}catch(IOException e){
			System.out.println("Image Error");
		}
		helpText = new JTextArea();
		helpText.setText("Connecting to the Server: \n Your IP Address: 123.114.3.25.6\n    -     Make sure you have the 'server' player connect first!\n    -     Make sure you have the 'client' player connect after, with the exact same IP address and Port!");
		helpText.setEditable(false);
		helpText.setSize(400,400);
		helpText.setLocation(100, 100);
		this.add(helpText);
		
		helpText2 = new JTextArea();
		helpText2.setText("How to play Connect 4: \n You and your opoponents will take turns placing pieces on the board. The first person to get 4 pieces in a row wins (Vertically, Horizontally or Diagonally!\n Here are examples of winning boards (for red):");
		helpText2.setEditable(false);
		helpText2.setSize(400,400);
		helpText2.setLocation(500, 100);
		this.add(helpText2);
		
		continueButton = new JButton();
		continueButton.setSize(new Dimension(200, 100));
		continueButton.setLocation(1000, 500);
		continueButton.setText("Continue!");
		this.add(continueButton);
	}
}
