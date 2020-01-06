import java.util.ArrayList;

/**Extends Draw Circle Class from Code Class. Uses array to draw circle 
 * @author 33485434
 * 
 */

public class DrawCircle extends Code
{
	public DrawCircle(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}
	
    public void Runcommand(String[] array)
    {	
		canvas.drawcircle(Integer.parseInt(array[1]));	
	}

	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
	}
}
