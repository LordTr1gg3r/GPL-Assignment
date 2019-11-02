import java.io.IOException;

import javax.swing.JFrame;
/**
 * @author simon
 *
 */
public class StartAction {
	public static void main(final String[] args) throws IOException {
		JFrame win = new MenuGUI();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

	}
}
