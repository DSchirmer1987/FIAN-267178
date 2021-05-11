package aufgabeKaffeeautomatGK;

public class CalcChange {

	private static void calculateChange(int intChange) {

		int counter = 0;
		int cVal = 0;
		String cName = "";
		
		
		// for each runs through the whole enumeration "TypeOfCoin"
		for (@SuppressWarnings("unused") TypeOfCoin typeOfCoin : TypeOfCoin.values()) {
			cVal = (int) TypeOfCoin.values()[counter].getValue();
			cName = TypeOfCoin.values()[counter].getCName();
			
			// only type of coins with a number > 0 are in output for console
			if (intChange / cVal == 0) {

			} else {
				System.out.printf("\n%1d x %s", intChange / cVal, cName);
			}
			
			// remaining amount after x coins of change
			intChange = intChange % cVal;
			counter++;

		}

	}
	public static void getChange(double change) {
		
		// turns change into cents
		change = Math.round(change * 100);
		
		// turns from double into integer -> easier to loop with correct number of coins with modulo
		int intChange = (int) change;
		
		calculateChange(intChange);
	}
}
