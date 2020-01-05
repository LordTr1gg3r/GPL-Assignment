import java.util.ArrayList;

/** Clear class inherits from Code and is used to clear the canvas
 * 
 * @author 33485434
 *
 */
public class Clear extends  Code 
{
	/**
	 * @param syntax
	 * @param paramsnumber
	 * @param canvas
	 */
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

	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
	}
}