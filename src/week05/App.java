package week05;

public class App {

	public static void main(String[] args) {
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.error("356");
		spacedLogger.log("789");
		
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		asteriskLogger.error("123");
		asteriskLogger.log("456"); 

	}

}
