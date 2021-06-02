package musterloesungen.exceptionsGK;

public class Calculate {

	public double integerDivision(String dividend, String divisor) throws IllegalArgumentException {
		double quotient = 0;
		int dividendCalc = 0;
		int divisorCalc = 0;
		if(dividend == "" || divisor == "") {
			throw new IllegalArgumentException();
		}
		try {
			dividendCalc = Integer.parseInt(dividend);
			divisorCalc = Integer.parseInt(divisor);
			try {
				quotient = dividendCalc / divisorCalc;
				quotient = (double) dividendCalc / divisorCalc;
			} catch (ArithmeticException e) {
				System.out.println("Division durch 0 ist nicht definiert.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Sie haben keine numerischen Werte eingegeben.");
		}

		return quotient;
	}
}
