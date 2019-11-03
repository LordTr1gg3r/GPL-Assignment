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
