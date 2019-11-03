import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;



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
        m_newItem.addActionListener(new NewAction());
        m_aboutItem.addActionListener(new AboutAction());
        m_saveItem.addActionListener(new SaveAction());
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
                
              //Left Text Pane
        		JTextArea text = new JTextArea(10,40);
        		text.setLayout(null);
        		text.setSize(32, 128);
        		text.setPreferredSize(new Dimension (10,40));	
        		text.setForeground(Color.white);
        		text.setBorder(BorderFactory.createLoweredBevelBorder());
        		text.setBorder(BorderFactory.createTitledBorder(null, "Commands", WIDTH, HEIGHT, getFont(), Color.white));
        		text.setBackground(Color.DARK_GRAY);
        	    panel.add(text, BorderLayout.LINE_START);

              //Right Graphic Pane
        		GraphicsPanel gp = new GraphicsPanel();
        		panel.add(gp,  BorderLayout.CENTER);
        	    
        	    
        		Point penPoint = new Point(10,5);
        		shouldDraw = false;
        	    direction = Direction.RIGHT;
        	    setColour = Color.WHITE;
        		
        	    JButton button = new JButton("Click Here to Draw");
        	    button.setPreferredSize(new Dimension(30, 40));
        	    button.addActionListener(new ActionListener() 
        	    {
        	    	@Override
        			public void actionPerformed(ActionEvent e) {
        	    	//stuff
    				String inputStr = text.getText();
    				
    				String[] cmds = inputStr.split(" ");
    				
    				Object g = null;
					switch(cmds[0].toLowerCase()) {
    					case "penup":
    						shouldDraw = false;
    						break;
    					
    					case "pendown":
    						shouldDraw = true;
    						break;
    					
    					case "turnright":
    					case "turnleft":
    						if(cmds[0].equalsIgnoreCase("turnright"))
    							direction =
    									direction == Direction.UP ? Direction.RIGHT :
    											direction == Direction.RIGHT ? Direction.DOWN :
    													direction == Direction.DOWN ? Direction.LEFT :
    															Direction.UP;
    						else
    							direction =
    								direction == Direction.UP ? Direction.LEFT :
    										direction == Direction.LEFT ? Direction.DOWN :
    												direction == Direction.DOWN ? Direction.RIGHT :
    														Direction.UP;
    						break;
    					case "square":
    						// center of the 
    				        int cx, cy; 
    				  
    				        // center of th ellipse 
    				        cx = 150; 
    				        cy = 175; 
    						for (int i = 0; i <= 360; i++) { 
    				            double x, y; 
    				            double A = 75, B = 50, px = 0, py = 0; 
								x = A * Math.sin(Math.toRadians(i)); 
    				            y = B * Math.cos(Math.toRadians(i)); 
    				  
    				            if (i != 0) { 
    				                // draw a line joining previous and new point . 
    				                ((Graphics) g).drawLine((int)px + cx, (int)py + cy, 
    				                                (int)x + cx, (int)y + cy); 
    				            } 
    				  
    				            // store the previous points 
    				            px = x; 
    				            py = y; }
    						break;
    					
    					case "backward":
    					case "forward":
    						//Make sure 0its forward <distance>
    						if (cmds.length != 2)
    							return;
    						
    						int distance = Integer.parseInt(cmds[1]);
    						
    						Point oldPosition = new Point(penPoint.x, penPoint.y);
    						
    						//Moves from current location
    						
    						if(cmds[0].equalsIgnoreCase("backward")) {
    							penPoint.setLocation(
    									penPoint.getX() + (direction == Direction.RIGHT ? -distance : direction == Direction.LEFT ? distance : 0),
    									penPoint.getY() + (direction == Direction.DOWN ? -distance : direction == Direction.UP ? distance : 0)
    							);
    						} else {
    							penPoint.setLocation(
    									penPoint.getX() + (direction == Direction.RIGHT ? distance : direction == Direction.LEFT ? -distance : 0),
    									penPoint.getY() + (direction == Direction.DOWN ? distance : direction == Direction.UP ? -distance : 0)
    							);
    						}
    						
    				
    						//Draws the pen or what ever c;
    						if(shouldDraw) {
    							gp.drawLine(setColour, oldPosition.x, oldPosition.y, penPoint.x, penPoint.y);
    							gp.repaint();
    						}
    						break;
    					//Colour of Pen	
    					case "red":
    					case "blue":
    					case "black":
    					case "white":
    					case "green":	
    						setColour = cmds[0].equalsIgnoreCase("red") ? Color.red :
    									cmds[0].equalsIgnoreCase("black") ? Color.black :
    									cmds[0].equalsIgnoreCase("white") ? Color.white :
    									cmds[0].equalsIgnoreCase("blue") ? Color.blue :
    												Color.green;
    						
    						break;
    					
    						
    					case "reset":
    						gp.clear();
    						gp.repaint();
    						break;
    						
    					default:
    						JOptionPane.showMessageDialog(null, "Invalid command!");
    					
    				}
    				
    				text.setText("");
    			}
    		});
    	    
    	    panel.add(button, BorderLayout.PAGE_END);
    		//look at turtule java// draw button //actionlsit
               
        	    
        	    
        	    
        	    
        	    
        		
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
