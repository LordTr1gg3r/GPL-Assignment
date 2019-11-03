import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class SaveAction extends GraphicsPanel implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
    	  JFileChooser filechooser = new JFileChooser();
          FileNameExtensionFilter filter = new FileNameExtensionFilter(
                   "JPG Images", "jpg");
          filechooser.setFileFilter(filter);
          
          int result = filechooser.showSaveDialog(this);
          if (result == JFileChooser.APPROVE_OPTION) {
             File saveFile = filechooser.getSelectedFile();
    	try {
    	    // retrieve image

    	       	    ImageIO.write(image, "jpg", saveFile);
    	       	  
    	;
    	         
    	} catch (IOException e1) {
    	    System.out.println("Error");
    	}
}
    
}
}