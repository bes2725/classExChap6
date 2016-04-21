/*
** Bailey Spicer
** bes2725@email.vccs.edu
** 4/20/2016
** this program uses an array to create four textfields in border layout swing GUI 
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderGUI extends JFrame
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;

	public BorderGUI()
	{
		frame = new JFrame("Assignment 6.3");
		frame.setVisible(true);
		frame.setSize(500,175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		label = new JLabel();
		label.setText("Enter some things! ");

		panel.add(label, BorderLayout.NORTH);
		//array
		JTextField[] txt = new JTextField[4];
		for(int i=0; i<4; i++)
		{
			txt[i] = new JTextField(5);
			panel.add(txt[i]);
		}
		//I couldn't figure out how to get the array to add the textfields :(
		panel.add(txt[0], BorderLayout.WEST);
		panel.add(txt[1], BorderLayout.EAST);
		panel.add(txt[2], BorderLayout.CENTER);
		panel.add(txt[3], BorderLayout.SOUTH);

		frame.add(panel);
	}
	public static void main(String[] args)
	{
		new BorderGUI();
	}
}
