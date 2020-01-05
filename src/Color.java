import java.util.ArrayList;

public class Color extends Code {

static private Color singleinstance;	

	private Color(String syntax, int paramsnumber, ImageArea canvas) {
		// TODO Auto-generated constructor stub
		
		setName(syntax);
		setNumOfParams(paramsnumber);
		setCanvas(canvas);
		
	}


	@Override
	public void Runcommand(ArrayList<String> array) {
		// TODO Auto-generated method stub
		
		canvas.color();
	}

	
	public static Color getInstance (String syntax, int paramsnumber, ImageArea canvas) {
		
		if(singleinstance == null) {
			
			singleinstance = new Color(syntax, paramsnumber, canvas);
			System.out.println("new instance created for " + syntax);
			return singleinstance;
			
			
		}else {
			System.out.println("Using existing Instance for " + syntax);
			return singleinstance;
		}
		
		
		
		
		
	}


	@Override
	protected void Runcommand(String[] array) {
		// TODO Auto-generated method stub
		canvas.color();
		
	}
	
}