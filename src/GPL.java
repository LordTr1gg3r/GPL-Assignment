
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



//main
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

			// Create the factory for all the commands 
			Commands Factory = new Commands(Image);
			
			// This create an ArrayList to hold all the command objects
			ArrayList<Code> CodeInput = new ArrayList<Code>();
			for (String Codes : UserInput) 
				{
				  Code Object = Factory.GetCommand(Codes);
				  CodeInput.add(Object);
				}
				
			SingleCode.TextFieldButton.addActionListener(new ActionListener() 
			    {
					public void actionPerformed(ActionEvent e) 
					{
					   // Looks at what the user input and gets the code from the Text Area(Program area)
					   String TextAreaCode = ProgramCode.TextAreaText.getText().toLowerCase();
					   
					   // Looks at what the user input and gets the code from the Text Field(Single line text area)
					   String SingleCommand = SingleCode.TextFieldText.getText().toString().toLowerCase();//
					   /* If the user input in text field is equal to run , it checks the code and runs the command, if incorrect send error.
					     Sends the code to the error class to validate.
					   */ 
					   if (SingleCommand.contentEquals("run")) 
						  {
							Boolean Valid = ErrorChecker.CorrectCode(TextAreaCode, CodeInput, CodeError.TextAreaText);
							if (Valid) 
								{
								  JOptionPane.showMessageDialog(window, "The command has been entered");
								} 
								else 
								{
								  JOptionPane.showMessageDialog(window, "Sorry the command is incorrect , please try agian");
								}
						   } 
						else 
						   {
							 Boolean Valid = ErrorChecker.CorrectCode(SingleCommand, CodeInput, CodeError.TextAreaText);
								if (Valid) 
								{
								  JOptionPane.showMessageDialog(window, "The command has been entered");
								}
								else 
								{
								  JOptionPane.showMessageDialog(window, "Sorry the command is incorrect , please try agian");
								}
							}
					}
					});		
	}
}
