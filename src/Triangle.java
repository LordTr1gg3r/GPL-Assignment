
public class Triangle extends Code 
{

	public Triangle(String syntax, int paramsnumber, ImageArea canvas) 
	{
		// TODO Auto-generated constructor stub
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}

	public void Runcommand(String[] array) 
	{	
		canvas.triangle(Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]));
	}
}
