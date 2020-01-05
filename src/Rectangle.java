import java.util.ArrayList;

/**Rectangle Class that extends from code. 
  *
  *@author 33485434
  *
  */
public class Rectangle extends Code
{
	public Rectangle(String syntax, int paramsnumber, ImageArea canvas)
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}

	public void Runcommand(String[] array) 
	{
		canvas.rectangle(Integer.parseInt(array[1]) ,Integer.parseInt(array[2]) );	
	}

	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
	}
}