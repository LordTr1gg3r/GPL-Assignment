import java.util.ArrayList;

/**Extends Circle Class from Code Class. Uses array to draw circle 
 * @author 33485434
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

	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
	}
}
