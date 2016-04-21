
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlowGUI extends JFrame implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JLabel output;
	private JButton button;

	public FlowGUI()
	{
		frame = new JFrame("Assignment 6.3");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		label1 = new JLabel();
		label1.setText("Enter some things! ");
		output = new JLabel();
		output.setText("-------");

		button = new JButton("Okay.");
		button.addActionListener(this);

		panel.add(label1);
		JTextField[] txt = new JTextField[4];
		for(int i=0; i<4; i++)
		{
			txt[i] = new JTextField(5);
			panel.add(txt[i]);
		}
			
		panel.add(button);
		panel.add(output);
		frame.add(panel);
	}
	public void actionPerformed(ActionEvent e)
	{
		output.setText("Good job!");
	}
	public static void main(String[] args)
	{
		new FlowGUI();
	}
}

