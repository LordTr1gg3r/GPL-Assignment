import javax.swing.JPanel;
import javax.swing.JTextArea;
/**MessageBox class 
 *
 *@author 33485434
 *
 */
public class Message extends JPanel
	{
		private static final long serialVersionUID = 1L;
		
		public JTextArea TextAreaText;
		
		public Message() 
		{
			TextAreaText = new JTextArea();
			TextAreaText.setLineWrap(true);	
		}
	}