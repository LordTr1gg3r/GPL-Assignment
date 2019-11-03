import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


class MenuGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static boolean shouldDraw;
	private static Direction direction;
	private static Color setColour;
	
	//Menu Bar Icons
	ImageIcon newitem = new ImageIcon(getClass().getResource("new.png"));
	ImageIcon openitem = new ImageIcon(getClass().getResource("open.png"));
	ImageIcon exit = new ImageIcon(getClass().getResource("exit.png"));
	ImageIcon save = new ImageIcon(getClass().getResource("save.png"));
	ImageIcon about = new ImageIcon(getClass().getResource("about.png"));
	
    JMenu     m_fileMenu = new JMenu("File");// declare and create new menu
    JMenuItem m_openItem = new JMenuItem("Open", openitem); // create new menu item
    
    JMenuItem m_newItem = new JMenuItem("New", newitem); // create new menu item
    JMenuItem m_quitItem = new JMenuItem("Exit", exit); // another menu item
    JMenuItem m_saveItem = new JMenuItem("Save", save); // another menu item
    JMenu m_helpMenu = new JMenu("Help");
    JMenuItem m_aboutItem = new JMenuItem("About" , about ); // another menu item
    JButton button = new JButton("Click here!");
    JPanel panel = new JPanel();
    
//constructor
    public MenuGUI() throws IOException {
        //... Add listeners to menu items
        m_openItem.addActionListener(new OpenAction());
        //m_newItem.addActionListener(new NewAction());
        m_aboutItem.addActionListener(new AboutAction());
        //m_saveItem.addActionListener(new SaveAction());
        m_quitItem.addActionListener(new ExitAction());

        
        //... Menubar, menus, menu items.  Use indentation to show structure.
        JMenuBar menubar = new JMenuBar();
        // declare and create new menu bar
            menubar.add(m_fileMenu);        // add the menu to the menubar
                m_fileMenu.add(m_newItem); // add the menu item to the menu
                m_newItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));//shortcut key
                m_fileMenu.addSeparator(); 
                m_openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));//shortcut key 
                m_fileMenu.add(m_openItem); // add the menu item to the menu
                m_fileMenu.addSeparator(); // add separator line to menu
                m_fileMenu.add(m_saveItem); // add the menu item to the menu
                m_saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));//shortcut key
                m_fileMenu.addSeparator(); 
                m_fileMenu.add(m_quitItem);
                m_quitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));//shortcut key
                menubar.add(m_helpMenu);
                m_helpMenu.add(m_aboutItem);
               
                // Main Pane
                JPanel panel = new JPanel();                
                panel.setLayout(new BorderLayout(0,0));

        		
 //... Set JFrame's menubar, content pane, and title.
 this.setContentPane(panel);       // Set windows content pane..
 this.setJMenuBar(menubar);          // Set windows menubar.
 this.pack();
 this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
 this.setTitle("Assignment");
 //getContentPane().setBackground(Color.DARK_GRAY);
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	public enum Direction 
	   {
	    	UP,		//0
	    	RIGHT,	//1
	    	DOWN,	//2
	    	LEFT,	//3
	   }
}
