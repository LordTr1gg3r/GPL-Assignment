/**Class inherits from code and DrawTo as integer, String and ImageArea variables
  *
  *
  *@author 33485434
  *
  */
public class DrawTo extends Code
{
	public DrawTo(String syntax, int paramsnumber, ImageArea canvas) 
	{
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
	}	
	
	public void Runcommand(String[] array) 
	{
		canvas.drawto(Integer.parseInt(array[1]), Integer.parseInt(array[2]));
	}
}
