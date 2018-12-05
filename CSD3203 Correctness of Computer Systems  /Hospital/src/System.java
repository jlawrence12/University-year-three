import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Vector;

public class System {
	

	public static void main(String[] args) {
	
		JFrame myFrame = new JFrame("Windows");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Cluster");
		//myFrame.getContentPane().add(new System());
		myFrame.setSize(800,700);
		myFrame.setLocation(320,100);
		myFrame.setVisible(true);
		//myFrame.getContentPane().setBackground(Color.blue);
		
		JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        
        myFrame.add(p1);
    	JButton b=new JButton("Submit");
		p1.setBounds(100,100,100,100);
		myFrame.add(b);
		
        p1.setBackground(Color.black);
        p1.setForeground(Color.blue);
        p1.setToolTipText("Click here to give the Hawk a command");
        
    	JButton c=new JButton("Cancel");
		p1.setBounds(100,100,100,100);
		myFrame.add(c);
		
        p1.setBackground(Color.black);
        p1.setForeground(Color.white);
        p1.setToolTipText("Click here to give the Hawk a command");
		
		
		
        
		
	}

	
	
	
	
	
	
	
	
}
