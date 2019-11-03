import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;


//code panel
public class DesignText extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextArea TextAreaText;
	public DesignField CodeInput;

	
	public DesignText() 
	{	
		TextAreaText = new JTextArea();
		TextAreaText.setLineWrap(true);
		TextAreaText.setBackground(Color.white);
		TextAreaText.setPreferredSize(new Dimension(500,500));
		setLayout(new GridLayout(1,0,0,0));
		setBorder(BorderFactory.createTitledBorder("Multi-Line Text Area"));
	
		CodeInput = new DesignField();
		
		add(TextAreaText);
		add(CodeInput);
    }

}
