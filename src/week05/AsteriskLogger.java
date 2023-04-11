package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println(asterisk(error));
		System.out.println("***Error: " + error + "***");
		System.out.println(asterisk(error));
		
	}

	public String asterisk(String error) {
		String addaster = "";
		int asterisk = 13 + error.length(); 
		for (int i = 1; i >= asterisk; i++) {
			addaster += "*";
		}
		return addaster;
	}
	
}
