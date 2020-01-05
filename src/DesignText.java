import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**DesignText inherits JPanel were Mutli line commands design is chosen in this class 
 * @author 33485434
 * 
 */
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
		setBorder(BorderFactory.createTitledBorder("Multi Line Commands"));
	
		CodeInput = new DesignField();
		
		add(TextAreaText);
		add(CodeInput);
    }

}
