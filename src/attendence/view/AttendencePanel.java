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
		chatButton = new JButton("Add name to list");
		chatLabel = new JLabel("This is the class");
	
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatLabel);
		this.add(chatButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -6, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -45, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -28, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatLabel, -237, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		
	}

}
