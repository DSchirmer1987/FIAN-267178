package musterloesungen.calculatorGK;

public class CalcTest {


	private String[] result = new String[4];

	public void testInteger() {

		int first = 24;
		int second = 8;
		
		result[0] = CalcBasic.sum(first, second);
		result[1] = CalcBasic.prod(first, second);
		result[2] = CalcBasic.subt(first, second);
		second = 0;

		try {
			result[3] = CalcBasic.div(first, second);
		} catch (ArithmeticException e) {
			System.out.println("Division durch 0 nicht definiert. Hier mit Datentyp int.");
		}

		outputTest();
		
	}

	public void testDouble() {
		
		double first = 24;
		double second = 8;

		result[0] = CalcBasic.sum(first, second);
		result[1] = CalcBasic.prod(first, second);
		result[2] = CalcBasic.subt(first, second);
		second = 0;

		try {
			result[3] = CalcBasic.div(first, second);
			if (second == 0)
				throw new ArithmeticException();
		} catch (ArithmeticException e) {
			result[3] = null;
			System.out.println("Division durch 0 nicht definiert. Hier mit Datentyp double.");
		}
		
		outputTest();

	}

	public void outputTest() {
		for (int i = 0; i < 4; i++) {
			System.out.println(result[i]);
		}
	}

}
