/**
  *This is the commands that are used within the program to get desired shape.
  *Uses Switch statement
  *Commands are Circle, Rectangle, Triangle, MoveTo, DrawTo, Clear and reset 
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

		// Circle
		case "circle":
			Code = new Circle("circle", 1, PictureBox);
			break;
			
        // Rectangle
		case "rectangle":
			Code = new Rectangle("rectangle", 2, PictureBox);
			break;
			
		// Draw Rectangle
		case "drawrect":
			Code = new DrawRect("rectangle", 2, PictureBox);
		    break;
		// Triangle
		case "triangle":
			Code = new Triangle("triangle", 3, PictureBox);
			break;
			
		// DrawTo
		case "drawto":
			Code = new DrawTo("drawto", 2, PictureBox);
			break;

		// MoveTo
		case "moveto":
			Code = new MoveTo("moveto", 2, PictureBox);
			break;

		// Clear
		case "clear":
			Code = new Clear("clear", 0, PictureBox);
			break;

		// Reset
		case "reset":
			Code = new ResetImage("reset", 0, PictureBox);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + Shape);
		}

		return Code;
	}
	

}
