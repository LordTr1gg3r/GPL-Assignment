import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class OpenAction extends GraphicsPanel implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	JFrame parentFrame = new JFrame();
    JFileChooser fileChooser = new JFileChooser();
    	FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
    	fileChooser.setFileFilter(filter);
    	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    	int userSelection = fileChooser.showOpenDialog(parentFrame);
    
    	if (userSelection == JFileChooser.APPROVE_OPTION)
    	{
    	File selectedFile = fileChooser.getSelectedFile();
   		System.out.println("Selected FIle" + selectedFile.getAbsolutePath());
    		JOptionPane.showMessageDialog(null, "Sorry Can't Open The file Chosen");
    }
    	else 
    	{
    		JOptionPane.showMessageDialog(null, "Open was cancelled");
    		
        }
  }
}