package javaTicketautomatGK;

public class CalcChange {

	private static void calculateChange(int intChange) {
	
		int counter = 0;
		int cVal = 0;
		String cName = "";
		String cType = "";

		// for each runs through the whole enumeration "TypeOfCoin"
		for (@SuppressWarnings("unused")
		TypeOfChange typeOfCoin : TypeOfChange.values()) {
			cVal = (int) TypeOfChange.values()[counter].getValue();
			cName = TypeOfChange.values()[counter].getmName();
			cType = TypeOfChange.values()[counter].getType();

			// only type of coins with a number > 0 (or not type "Banknote") are in output for
			// console
			if (intChange / cVal == 0 || cType == "Banknote") {

			} else {
				System.out.printf("\n%1d x %s", intChange / cVal, cName);
				// remaining amount after x coins of change

				/*
				 * !!!
				 * 
				 * vs. SimKaffeeautomat this line below into else{} due to condition
				 * "|| cType == "Banknote"") -> otherwise it would calculate with type "Banknote"
				 * but will not output these cases
				 * 
				 * !!!
				 */

				intChange = intChange % cVal;

			}

			counter++;

		}

	}

	public static void getChange(double change) {

		// turns change into cents
		// caution! if only change *= 100, there will be incorrect changes due to round effects/transformation euro/cent
		change = Math.round(change * 100);
		
		// turns from double into integer -> easier to loop with correct number of coins
		// with modulo
		int intChange = (int) change;

		calculateChange(intChange);
	}
}
