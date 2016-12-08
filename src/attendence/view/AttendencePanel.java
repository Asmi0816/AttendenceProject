package attendence.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import attendence.controller.AttendenceController;

public class AttendencePanel extends JPanel
{
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	private JLabel chatLabel;
	private AttendenceController baseController;

	public AttendencePanel(AttendenceController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5, 25);
		chatField = new JTextField(25);
		chatButton = new JButton("This one has words");
		chatLabel = new JLabel("This also has words");
	
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
