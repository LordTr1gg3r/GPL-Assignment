import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


class AboutAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "***************Commands***************\n"+
       		 							 "penup(Lifts the pen from the canvas, so that movement does not get shown)\n"+
				 							 "pendown(Places the pen down on the canvas so movement gets shown as a drawn line)\n"+
				 							 "turnleft(Turn the pens direction by 90 degrees to the left)\n"+
				 							 "turnright(Turn the pens direction by  90 degrees to the right)\n"+
				 							 "forward <distance> (Moves forward to the specified distance)\n"+
					                         "backward <distance> (Move backwards to thespecified distance)\n"+
					                         "black(Sets pen colour to black)\n"+
					                         "green(Sets pen colour to green)\n"+
					                         "red (Sets pen colour to red)\n"+
					                         "reset (Resets the canvas to blank.\n"+
					                         "***************Shortcut Keys***************\n"+
					                         "Control Key+N(New File)\n"+
					                         "Control Key+O(Open File\n"+
					                         "Control Key+S(Sabe File\n"+
					                         "Escape Key(Quit)"
					                         
    );
    }
}