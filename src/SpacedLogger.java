
public class SpacedLogger implements Logger{
	//SpacedLogger Class
	@Override
	public void log(String log) {
		System.out.println(this.spaceStr(log));
	}

		

	@Override
	public void error(String error) {	
		System.out.println("ERROR: "+this.spaceStr(error));
	
	
	
	}
	
	private String spaceStr (String str) {
		//Private method to eliminate redundant code
		return str.replace((""), " ").trim();
		
	}

}
	
	

