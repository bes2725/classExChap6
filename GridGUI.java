/*
** Bailey Spicer
** 4/20/2016
** bes2725@email.vccs.edu
** this program is a grid layout GUI of size 2x2with only four textfields
*/


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GridGUI extends JFrame
{
	private JFrame frame;
	private JPanel panel;

	public GridGUI()
	{
		frame = new JFrame("Assignment 6.3");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		JTextField[] txt = new JTextField[4];
		for(int i=0; i<4; i++)
		{
			txt[i] = new JTextField(5);
			panel.add(txt[i]);
		}
		frame.add(panel);
	}
	public static void main(String[] args)
	{
		new GridGUI();
	}
}
