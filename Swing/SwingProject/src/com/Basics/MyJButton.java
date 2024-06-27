package com.Basics;

import javax.swing.*;
import java.awt.*;

public class MyJButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton jb = new JButton("Click Me");
		jb.setBounds(100, 100, 120, 30);
		jb.setFont(new Font("Arial",Font.BOLD,20));
		
		//hover courser 
//		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
//		jb.setCursor(cur);
		// useable
//		jb.setEnabled(false);
		// visiblity
//		jb.setVisible(true);
//		c.add(jb);
		
		//image
		ImageIcon icon = new ImageIcon("images.png");
		JButton jb2 = new JButton(icon);
		jb2.setBounds(100, 300, icon.getIconWidth(), icon.getIconHeight());
		jb2.setFont(new Font("Arial",Font.BOLD,20));
		
		c.add(jb2);
		
	}

}
