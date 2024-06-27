package com.Basics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyActionListener3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(100, 100, 100, 50);
		c.add(btn);
		// Anonymous inner class
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.RED);
			}
		});

	}

}
