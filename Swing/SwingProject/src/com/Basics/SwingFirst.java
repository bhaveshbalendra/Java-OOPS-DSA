package com.Basics;
import java.awt.*;

import javax.swing.*;
public class SwingFirst {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1366,720);
		f.setLocation(60,60);
		f.setTitle("Hello");
		
		ImageIcon ig = new ImageIcon("images.png");
	
		Container con = f.getContentPane();
		con.setBackground(Color.RED);
	}

}
