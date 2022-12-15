
public class SpacedLogger implements Logger{
	//SpacedLogger Class
	//Has the two methods from interface
	//Also has a private method to make string spaced.
	public void log(String log) {
		System.out.println(this.spaceStr(log));
		
	}

		

	public void error(String error) {	
		System.out.println("ERROR: "+this.spaceStr(error));
	
	
	
	}
	
	private String spaceStr (String str) {
		//Private method to eliminate redundant code
		return str.replace((""), " ").trim();
		
	}

}
	
	

