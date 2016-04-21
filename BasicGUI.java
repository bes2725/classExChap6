
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BasicGUI extends JFrame implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JLabel output;
	private JTextField txt1;
	private JTextField txt2;
	private JButton button;

	public BasicGUI()
	{
		frame = new JFrame("Assignment 6.1");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		
		label1 = new JLabel();
		label1.setText("Enter a number: ");
		label2 = new JLabel();
		label2.setText("Enter a second number: ");
		output = new JLabel();
		output.setText("-------");

		txt1 = new JTextField(5);
		txt2 = new JTextField(5);
		
		button = new JButton("Calculate");
		button.addActionListener(this);

		panel.add(label1);
		panel.add(txt1);
		panel.add(label2);
		panel.add(txt2);
		panel.add(button);
		panel.add(output);
		frame.add(panel);
	}
	public void actionPerformed(ActionEvent e)
	{
		double sum;
		double num1 = Double.parseDouble(txt1.getText());
		double num2 = Double.parseDouble(txt2.getText());
		sum = num1 + num2;
		output.setText(String.valueOf(sum));
	}
	public static void main(String[] args)
	{
		new BasicGUI();
	}
}


