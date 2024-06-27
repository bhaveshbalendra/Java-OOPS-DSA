package com.Basics;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class My extends JFrame implements ActionListener {

	Container c;
	JButton btn1 = new JButton("RED");
	JButton btn2 = new JButton("BLUE");
	JButton btn3 = new JButton("YELLOW");

	My () {
		c = this.getContentPane();
		c.setLayout(null);
		
		//Button1
		btn1.setBounds(100, 100, 100, 50);
		
		//Button2
		
		btn2.setBounds(250, 100, 100, 50);
		//Button3
		
		btn3.setBounds(400, 100, 100, 50);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) c.setBackground(Color.RED);	
		else if (e.getSource() == btn2) c.setBackground(Color.BLUE);
		else c.setBackground(Color.YELLOW);
	}
}

public class MyActionListener2 {

	public static void main(String[] args) {
		
		My mf = new My();
		mf.setBounds(100,100,1000,500);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
