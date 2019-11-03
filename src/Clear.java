
public class Clear extends  Code 
{

	public Clear(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}
	
	public void Runcommand(String[] array) 
	{
		canvas.clear();
	}
}