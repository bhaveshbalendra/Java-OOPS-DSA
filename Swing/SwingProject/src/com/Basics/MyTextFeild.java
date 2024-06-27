package com.Basics;
import javax.swing.*;
import java.awt.*;
public class MyTextFeild {

	public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,1000,500);
	Container c = frame.getContentPane();
	c.setLayout(null);
	
	JTextField tf = new JTextField();
	tf.setBounds(100,50,120,120);
	tf.setText("Bhavesh");
	Font font = new Font("Arial",Font.BOLD,25);
	tf.setForeground(Color.GREEN);
	tf.setFont(font);
	tf.setBackground(Color.RED);
	tf.setEditable(false);
	c.add(tf);
	
	
	frame.setVisible(true);

	}

}
