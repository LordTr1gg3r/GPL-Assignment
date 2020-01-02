
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Main Runnable Class
 * JFrame windows designs are established in this class
 * @author Simon Thow 
 * @param args 
 */
public class GPL
{		
	public static void main(String[] args) 
	{		
			//Design of the window    
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setName("Graphical Programming Language Application");
			window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			window.setSize(1000, 1000);
			window.setLayout(new BorderLayout());
			DesignText ProgramCode = new DesignText();
			DesignField SingleCode = ProgramCode.CodeInput;
			ImageArea Image = new ImageArea(2000,800);
			window.add(new JLabel("Commands "), BorderLayout.EAST);
			window.add(ProgramCode, BorderLayout.CENTER);
			window.add(SingleCode , BorderLayout.NORTH);
			window.add(Image, BorderLayout.SOUTH);
			window.setVisible(true);
			
			Error ErrorChecker = new Error();
			Message CodeError = new Message();
			
			// These are the Array of the user input to draw shapes, line , clear image and reset image 
			String[] UserInput = new String[] 
				{ 
				    "circle",
				    "rectangle", 
					"triangle", 
					"moveto",
					"drawto",
					"clear", 
					"reset",
				 };

			/*
			 * Create the cmds variable for all the commands 
			 */
			Commands cmds = new Commands(Image);
			
			/*
			 * This creates an ArrayList to hold all the command objects
			 */
			ArrayList<Code> CodeInput = new ArrayList<Code>();
			for (String Codes : UserInput) 
				{
				  Code Object = cmds.GetCommand(Codes);
				  CodeInput.add(Object);
				}
				
			SingleCode.TextFieldButton.addActionListener(new ActionListener() 
			    {
					public void actionPerformed(ActionEvent e) 
					{
					   /*
					    * Checks the user's input in the TextArea and take's it for later verification.
					    */
					   String TextAreaCode = ProgramCode.TextAreaText.getText().toLowerCase();
					   /*
					    *  Checks the user's input in the TextFieldText and take's it for later verification.
					    */
					   // Looks at what the user input and gets the code from the Text Field(Single line text area)
					   String SingleCommand = SingleCode.TextFieldText.getText().toString().toLowerCase();//
					   /* 
					    * Checks the user input is equal to run, checks the code and then runs the command. If incorrect then sends error which then code sent
					    * to error class for verification.
					    */ 
					   if (SingleCommand.contentEquals("run")) 
						  {
							Boolean Valid = ErrorChecker.CorrectCode(TextAreaCode, CodeInput, CodeError.TextAreaText);
							if (Valid) 
								{
								  JOptionPane.showMessageDialog(window, "Command Accepted");
								} 
								else 
								{
								  JOptionPane.showMessageDialog(window, "Sorry this command is incorrect , please try agian");
								}
						   } 
						else 
						   {
							 Boolean Valid = ErrorChecker.CorrectCode(SingleCommand, CodeInput, CodeError.TextAreaText);
								if (Valid) 
								{
								  JOptionPane.showMessageDialog(window, "Command Accepted");
								}
								else 
								{
								  JOptionPane.showMessageDialog(window, "Sorry this command is incorrect , please try agian");
								}
							}
					}
					});		
	}
}
