package javaTicketautomatGK;

public class CalcMoneyInsertion {

	public static void coin(int choice, double tocPrice) {
		
		double tocValue = TypeOfChange.values()[choice - 1].getValue();
		
		// on base Euro
		tocPrice = tocPrice - tocValue / 100;

		// recursive, if still sth. to pay
		if (tocPrice > 0) {
			CustomerDialogue.simMoneyInsertion(tocPrice);
		} else {
			System.out.println();
			OutputDisplay.yourChange(tocPrice);
		}
	
	}
}
