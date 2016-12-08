package attendence.controller;


import attendence.view.AttendenceFrame;
import attendence.model.ChatBot;
import attendence.view.AttendencePanel;

import javax.swing.JOptionPane;
import java.util.ArrayList;




public class AttendenceController 
{
	
	private ChatBot myBot;
	private AttendencePanel chatView;
	private AttendenceFrame baseFrame;
	private ArrayList<String> names;
	
	public  AttendenceController()
	{
		myBot = new ChatBot();
		chatView = new AttendencePanel(this);
		baseFrame = new AttendenceFrame(this);
		names = new ArrayList<String>();
		buildnames();
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Class!");
	}
	
	public void buildnames()
	{
		names.add("Jake");
		names.add("Herold");
		names.add("Maddi");
		names.add("Seth");
		
	}
}
