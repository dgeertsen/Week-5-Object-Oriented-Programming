
public class App {

	public static void main(String[] args) {
		
		//Asterisk Logger Answers
		Logger asteriskLogger=new AsteriskLogger();
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
		//Spaced Logger
		Logger spacedLogger= new SpacedLogger();
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
		

	}

}
