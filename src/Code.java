import java.util.ArrayList;

/** Code Class were commands are verfied 
 * 
 * @author 33485434
 *
 */
//command class
public abstract class Code {
	
	abstract public  void Runcommand(ArrayList<String> array);
	
	private String name = "";
	private int numOfParams = 0;
	ImageArea canvas;
	
	
	public ImageArea getCanvas() {
		return canvas;
	}
	public void setCanvas(ImageArea canvas) {
		this.canvas = canvas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfParams() {
		return numOfParams;
	}
	public void setNumOfParams(int numOfParams) {
		this.numOfParams = numOfParams;
	}
	protected abstract void Runcommand(String[] array);
	
	

	
	
	

}
