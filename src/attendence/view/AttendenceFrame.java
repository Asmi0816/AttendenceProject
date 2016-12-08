package attendence.view;
import attendence.controller.AttendenceController;
import javax.swing.*;
import java.awt.Dimension;
public class AttendenceFrame extends JFrame
{
	
	private AttendenceController baseController;
	private AttendencePanel basePanel;
			
			public AttendenceFrame (AttendenceController baseController)
			{
				super();
				this.baseController = baseController;
				basePanel = new AttendencePanel(baseController);
				
				setupFrame();
			}
			
			private void setupFrame()
			{
				this.setContentPane(basePanel);
				this.setTitle("You got served sucker");
				this.setSize(new Dimension(600, 400));
				this.setResizable(false);
				this.setVisible(true);
			}
			
}
