
public class ResetImage extends Code
{
	public ResetImage(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}

	public void Runcommand(String[] array)
	{
		canvas.ResetCoordinate();
	}
}
