import java.util.ArrayList;

/**MoveTo Class 
  *@author 33485434
  *
  */
public class MoveTo  extends Code
{
	public MoveTo (String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}
	
	public void Runcommand(String[] array) 
	{
		// TODO Auto-generated method stub
		canvas.moveto(Integer.parseInt(array[1]),Integer.parseInt(array[2]));
	}

	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
	}
}