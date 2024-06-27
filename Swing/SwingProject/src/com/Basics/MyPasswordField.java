package com.Basics;

import javax.swing.*;
import java.awt.*;
public class MyPasswordField {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JPasswordField pf = new JPasswordField();
		pf.setBounds(100,50,100,30);
		pf.setBackground(Color.CYAN);
		pf.setForeground(Color.BLUE);
		pf.setFont(new Font ("Arial",Font.PLAIN,30));
		pf.setText("10000");
		pf.setEchoChar('*'); // 
		//pf.setEchoChar((char)0); // visiblity 
		
		c.add(pf);
		
	}

}
