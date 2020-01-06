/**
  *This is the commands that are used within the program to get desired shape.
  *Uses Switch statement
  *Commands are Circle, DrawCircle, Color, Rectangle, DrawReact, Triangle, MoveTo, DrawTo, Clear and reset 
  *
  *@author 33485434
  *
  */
public class Commands
{
	Code Code;
	ImageArea PictureBox;
	public Commands(ImageArea DrawArea) 
	{
		// TODO Auto-generated constructor stub
		PictureBox = DrawArea;
	}
	
	
	public Code GetCommand(String Shape) 
	{
		switch (Shape) 
		{

		/**
		 * Fill Circle
		 */
		case "circle":
			Code = new Circle("circle", 1, PictureBox);
			break;
		/**
		 * Draw Circle
		 */
		case "drawcircle":
		Code = new DrawCircle("drawcircle", 1, PictureBox);
			break;
		/**
		 * Set's Pen Colour	
		 */
		case "color":
			Code = Color.getInstance("color", 0, PictureBox);
			break;
			
		/**
		 * Fill Rectangle
		 */
		case "rectangle":
			Code = new Rectangle("rectangle", 2, PictureBox);
			break;
			
		/**
		 * Draw Rectangle
		 */
		case "drawrect":
			Code = new DrawRect("drawrect", 2, PictureBox);
		    break;
		/**
		 * Draw Triangle
		 */
		case "triangle":
			Code = new Triangle("triangle", 3, PictureBox);
			break;
			
		/**
		 * Draw To User Location
		 */
		case "drawto":
			Code = new DrawTo("drawto", 2, PictureBox);
			break;

		/**
		 * Move's to user desired location
		 */
		case "moveto":
			Code = new MoveTo("moveto", 2, PictureBox);
			break;

		/**
		 * Clear's Buffered Image
		 */
		case "clear":
			Code = new Clear("clear", 0, PictureBox);
			break;

		/**
		 * Reset's Pen's Location
		 */
		case "reset":
			Code = new ResetImage("reset", 0, PictureBox);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + Shape);
		}

		return Code;
	}
	

}
