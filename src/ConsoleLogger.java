import java.util.Date;

public class ConsoleLogger implements LoggerLab{

	@Override
	public void info(String info) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString()+": "+info);
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println(date.toString()+": "+warning);	
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.err.println("Error: " +date.toString()+": "+error);
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.err.println("FATAL!!! " +date.toString()+": "+fatal.toUpperCase());
	}
	
	public void close() {
		
	}
	
}
