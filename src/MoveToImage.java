
public class MoveToImage  extends Code
{
	public MoveToImage (String syntax, int paramsnumber, ImageArea canvas) 
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
}