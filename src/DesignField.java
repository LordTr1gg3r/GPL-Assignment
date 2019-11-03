import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesignField extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextField TextFieldText;
	public JButton TextFieldButton;
	
	public DesignField() 
	{
		TextFieldText = new JTextField();
		TextFieldButton = new JButton("Start");
		setLayout(new GridLayout(1,0,0,0));
		setBorder(BorderFactory.createTitledBorder("Single Commands only"));
		
		add (TextFieldText);
		add (TextFieldButton);	
	}
}
