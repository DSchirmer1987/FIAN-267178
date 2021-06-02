package musterloesungen.aufgabeExceptionsKB;

public class Mathezeug {

	public double integerDivision(String eingabe)
			throws IllegalArgumentException, NumberFormatException, ArithmeticException {
		
		double ergebnis = 0;

		String tmp = eingabe;
		if(tmp.contains("/")) {
			tmp=tmp.replace("/", ":");
		}
		if (tmp == null || tmp.equals("")||!tmp.contains(":")) {
			throw new IllegalArgumentException();
		}
		String dividend = tmp.substring(0, (tmp.indexOf(':')));
		String divisor = tmp.substring(tmp.indexOf(':') + 1);
		if (divisor.equals("0")) {
			throw new ArithmeticException();
		}
		ergebnis = Double.parseDouble(dividend) / Double.parseDouble(divisor);

		return ergebnis;
	}

}
