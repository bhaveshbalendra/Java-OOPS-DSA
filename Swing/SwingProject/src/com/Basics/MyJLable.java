package com.Basics;
import javax.swing.*;
import java.awt.*;
public class MyJLable {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1366,720);
		frame.setLocation(60,60);
		frame.setTitle("Hello");
		
		Container con = frame.getContentPane();
		con.setLayout(null);
		
//		JLabel label = new JLabel("Username");
//		label.setBounds(100, 50, 100, 30);
//		
//		con.add(label);
//		
//		label.setText("Password");
//		
//		Font font = new Font("Arial",Font.ITALIC,20);
//		label.setFont(font);
		
		// for image
//		ImageIcon ii = new ImageIcon("images.png");
//		JLabel label1 = new JLabel(ii);
//		
//		label1.setBounds(50, 50, ii.getIconHeight(), ii.getIconWidth());
//		
//		con.add(label1);
		
		// image + text
		
		ImageIcon icon = null;
		try {
			icon = new ImageIcon("images.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel label = new JLabel("Text",icon,JLabel.CENTER);
		label.setBounds(0,100,500,200);
		frame.add(label);
		
		
	}

}
