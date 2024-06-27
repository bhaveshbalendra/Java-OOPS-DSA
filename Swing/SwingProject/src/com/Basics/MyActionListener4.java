package com.Basics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyActionListener4 {
	public static Container c;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = frame.getContentPane();
		c.setLayout(null);
			
		JButton btn1 = new JButton("RED");
		JButton btn2 = new JButton("BLUE");
		JButton btn3 = new JButton("YELLOW");
		
		//Button1
		btn1.setBounds(100, 100, 100, 50);
		
		//Button2
		btn2.setBounds(250, 100, 100, 50);
		
		//Button3
		btn3.setBounds(400, 100, 100, 50);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		btn1.addActionListener(new RedClass());
		btn2.addActionListener(new BlueClass());
		btn3.addActionListener(new YellowClass());

	}

}

class RedClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		MyActionListener4.c.setBackground(Color.RED);
	}
}

class BlueClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		MyActionListener4.c.setBackground(Color.BLUE);
	}
}

class YellowClass implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		MyActionListener4.c.setBackground(Color.YELLOW);
	}
}