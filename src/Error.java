import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Error  
{

	ArrayList<Code> ActualUserInputCodes;
	ArrayList<String[]> ApprovedUserInputCodes;
	JFrame frame = new JFrame();

	public Boolean CorrectCode(String UserInputCode, ArrayList<Code> Code, JTextArea TextAreaText)
	{
		
		String[] UserInput = UserInputCode.split("\\r?\\n|\\r");
		ActualUserInputCodes = Code;
		ApprovedUserInputCodes = new ArrayList<String[]>();
		ArrayList<String> BlankLines= new ArrayList<String>();

		/* 
		 *  ApprovedUserInputCodes holds the correct commands and loops the array until it finds the right match
		 *  ActualUserInputCodes if matched the user input, it then checks the correct parameters 
		 *  Returns false if it is not true, If all commands are successful it will return rue  
		 */
		
		//Checks to see if the text field or text area is left blank by the user, if it is then it will  give  and error 
		for (String A : UserInput) 
		{
			if (!A.trim().equals("")) 
			{
				BlankLines.add(A);
			} 
		}

		// Check if there are any commands after empty lines have been removed
		// return false if it is not the case.

		if (BlankLines.size() == 0) 
		{
			JOptionPane.showMessageDialog(frame, "Please enter a command");
			return false;
		}

		// loop the BlankLine and runs CorrectCode for the strings
		for (String SingleLineText : BlankLines) 
		{
			if (!CorrectCode(SingleLineText))  
			{
				return false; 
			}
		}

		//matches code 
		for (String[] array : ApprovedUserInputCodes)
		{
			for (Code B : Code) 
			{
				if (array[0].equals(B.getName())) 
				{
					B.Runcommand(array);
				}
			}
		}

		return true; 
	}
	
	private Boolean CorrectCode(String UserCodes)
	{


		// Checks and gives the user input code and parameters   
		String[] UserInputCorrect = UserCodes.split(" ");

		for (Code C : ActualUserInputCodes) 
		{
			if (UserInputCorrect[0].equals(C.getName())) 
			{
				if (CheckParamaters(C.getNumOfParams(), UserInputCorrect)) 
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
		}
		  JOptionPane.showMessageDialog(frame, "Command is incorrect, please try again");
		  return false;
	}
	
	private boolean CheckParamaters(int D, String[] Check)
	{
				
		// this checks to see if the parameter and int are there and if not send error.
		for (int E = 1; E <= D; E++) 
		{
			try 
			{
				Integer.parseInt(Check[E]);
			} catch (Exception e) 
			{
				JOptionPane.showMessageDialog(frame, "The value you entered is incorrect, please try again eg rectangle 100 10 100");
				return false;
			}
		}
		
		ApprovedUserInputCodes.add(Check);
		return true;
	}
}


