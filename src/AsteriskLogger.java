
public class AsteriskLogger implements Logger {
	//AsteriskLogger Class
	
	public void log(String log) {
		System.out.println("***"+log+"***");
	}

	
	public void error(String error) {
		String box = "";
		//Creates the asterisk box based on the length of error.
		for(int i=0;i<= error.length()+"ERROR:".length()+6;i++)
			box+="*";
		System.out.println(box+"\n***ERROR: "+error+"***\n"+box);
	}
	
}
