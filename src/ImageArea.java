
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;
/**ImageArea were graphic's panel is created and stored
 *@author 33485434
 *
 */
public class ImageArea  extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int CoordinateX;
	int CoordinateY;
	int CoordinateZ;
	int Width;
	int Height;
	
	BufferedImage Drawing;
	Graphics g;
	
	public ImageArea(int width, int height) 
	{
		Width = width;
		Height = height;
		setPreferredSize(new Dimension(Width,Height));
		setBackground(new Color(100,100,100));//220
	
		//create a buffered image
		Drawing = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
		g = Drawing.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);	
		g.setColor(Color.WHITE);
	}
	// Draw rectangle
	public void rectangle(int width, int height) 
	{
		g.fillRect(CoordinateX, CoordinateY, width, height);
		repaint();
	}
	
public void color(){
		
		Random r = new Random();
		int rcolor = r.nextInt(7);
		
		switch (rcolor) {
		
		case 0: g.setColor(Color.blue);
			break;
		case 1: g.setColor(Color.red);
		    break;
		case 2: g.setColor(Color.PINK);
		  break;
		case 3: g.setColor(Color.YELLOW);
		break;
		case 4: g.setColor(Color.MAGENTA);
		break;
		case 5: g.setColor(Color.ORANGE);
		break;
		case 6: g.setColor(Color.WHITE);
		break;

		
		}
	}
	
	public void drawrect(int width, int height)
	{
		g.drawRect(CoordinateX, CoordinateY, width, height);
		repaint();
	}
	
	//Draw circle
	public void circle(int radius) 
	{
		g.fillOval(CoordinateX, CoordinateY, (radius*2), (radius*2));
		repaint();
	}
	//Draw Triangle 
	public void triangle(int base, int adj, int hyp) 
	{
		
		g.drawLine(CoordinateX, CoordinateY, (CoordinateX+base), CoordinateY);
		g.drawLine((CoordinateX+base), CoordinateY, (CoordinateX+base), (CoordinateY+hyp));
		g.drawLine((CoordinateX+base), (CoordinateY+hyp), CoordinateX, CoordinateY);
		repaint();
	}
	
	//Draws to coordinate 
	public void drawto(int X , int Y) 
	{
		g.drawLine(CoordinateX, CoordinateY, (CoordinateX + X), (CoordinateY + Y));
		repaint();
	}
	
	// Moves coordinate
	public void moveto(int X, int Y) 
	{
		CoordinateX = X;
		CoordinateY = Y;
	}
	
	//Reset image
    public void ResetCoordinate() 
    {
    	CoordinateX = 0;
    	CoordinateY = 0;
	}
    
    //Clears image
	public void clear()
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Width,Height);
		g.setColor(Color.WHITE);
		repaint();	
	}
	
	//Draws image 
	@Override
	protected void paintComponent(Graphics g) 
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(Drawing, 0,0, null);
	}	
}
