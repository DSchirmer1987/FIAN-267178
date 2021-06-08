package musterloesungen.zahlenumrechnerGK;

public class Calc {
	
	public static void checkUserInput(String strDezimal) {
	
		try {	int dezimal = Integer.parseInt(strDezimal);
		}catch(NumberFormatException e) {
			IO.errorMessage();
		}
	}
	
	public static void checkUserInputToDec(String strDezimal) {
		
		try {	int dezimal = Calc.binaryToDecimal(strDezimal);
		}catch(NumberFormatException e) {
			IO.errorMessageToDec();
		}
	}
	
	public static void checkUserInputBinaryToDec(String strDezimal) {
		
		try {	int decimal = Integer.parseInt(strDezimal, 2);
		}catch(NumberFormatException e) {
			IO.errorMessageToDec();
		}
	}
	
	public static String dezimalNachBinaer(String dezimal) {
		String binary = Integer.toBinaryString(Integer.parseInt(dezimal));
		return binary;
	}
	public static String dezimalNachHexadezimal(String dezimal) {
		String hex = Integer.toHexString(Integer.parseInt(dezimal));
		return hex;
	}
	
	public static int hexToDecimal(String dezimal) {
		int decimal = Integer.parseInt(dezimal, 16);
		return decimal;
	}
	
	public static int binaryToDecimal(String dezimal) {
		int decimal = Integer.parseInt(dezimal, 2);
		return decimal;
	}

}
