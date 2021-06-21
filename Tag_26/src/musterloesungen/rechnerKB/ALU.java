package musterloesungen.rechnerKB;

public class ALU {

	public static double addieren(String eingabe) {

		double ergebnis = 0;

		String tmp = eingabe;

		String a = tmp.substring(0, (tmp.indexOf('+')));
		String b = tmp.substring(tmp.indexOf('+') + 1);

		ergebnis = Double.parseDouble(a) + Double.parseDouble(b);

		return ergebnis;
	}

	public static double subtrahieren(String eingabe) {

		double ergebnis = 0;

		String tmp = eingabe;

		String a = tmp.substring(0, (tmp.indexOf('-')));
		String b = tmp.substring(tmp.indexOf('-') + 1);

		ergebnis = Double.parseDouble(a) - Double.parseDouble(b);

		return ergebnis;
	}

	public static double multiplizieren(String eingabe) {

		double ergebnis = 0;

		String tmp = eingabe;

		String n = tmp.substring(0, (tmp.indexOf('*')));
		String m = tmp.substring(tmp.indexOf('*') + 1);
		ergebnis = Double.parseDouble(n) * Double.parseDouble(m);

		return ergebnis;
	}

	public static double dividieren(String eingabe) throws ArithmeticException {

		double ergebnis = 0;

		String tmp = eingabe;

		String dividend = tmp.substring(0, (tmp.indexOf('/')));
		String divisor = tmp.substring(tmp.indexOf('/') + 1);
		if (divisor.equals("0")) {
			throw new ArithmeticException();
		}
		ergebnis = Double.parseDouble(dividend) / Double.parseDouble(divisor);

		return ergebnis;
	}

	public static String ausrechnen (String eingabe) {
		double ergebnis=0;
		
		if(eingabe.contains("+")){
		ergebnis=addieren(eingabe);
		}
		else if(eingabe.contains("-")){
			ergebnis=subtrahieren(eingabe);
		}
		else if(eingabe.contains("*")){
			ergebnis=multiplizieren(eingabe);
		}
		else if(eingabe.contains("/")){
			ergebnis=dividieren(eingabe);
		}
		String ergebnisText = ""+ergebnis;
		return ergebnisText;
	}

}
