
public class Application {

	public static void main(String[] args) {
		LoggerLab logger=new FileLogger();
		logger.info("Hello");
		logger.warning("Hello");
		logger.error("Hello");
		logger.fatal("Hello");
		
		logger.close();
	}

}
