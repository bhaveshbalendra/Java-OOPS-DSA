package com.Basics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class MyFrame extends JFrame implements ActionListener {

	Container c;
	JButton btn;
	
	MyFrame () {
		c = this.getContentPane();
		c.setLayout(null);
		
		btn = new JButton("Click Me");
		btn.setBounds(100, 100, 100, 50);
		c.add(btn);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		c.setBackground(Color.CYAN);	
	}
}

public class MyActionListener {

	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
		mf.setBounds(100,100,1000,500);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
