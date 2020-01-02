/*
 * Inheritance Circle Class from Code Class
 * Uses array to draw circle 
 */


/**
 * @author simon
 *
 */
public class Circle extends Code
{
	public Circle(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}
	
    public void Runcommand(String[] array)
    {	
		canvas.circle(Integer.parseInt(array[1]));	
	}
}
