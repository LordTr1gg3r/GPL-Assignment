import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Message extends JPanel
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public JTextArea TextAreaText;
		
		public Message() 
		{
			TextAreaText = new JTextArea();
			TextAreaText.setLineWrap(true);	
		}
	}