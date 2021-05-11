package javaTicketautomatGK;

public class TicketautomatGK {

	public static void main(String[] args) {

		// extra for control of status always ready after use
		while(true) {
		OutputDisplay.showMenu();

//		int choice = OptionCall.menuChoice();
		int choice = aufgabeKaffeeautomatGK.OptionCall.menuChoice();
		
		// extra for control of status always ready after use
		if(choice == -1) {
			OutputDisplay.exit();
			System.exit(0);
		}
		
		double tocPrice = OutputDisplay.insertMoney(choice);

		CustomerDialogue.simMoneyInsertion(tocPrice);
		}
	}

}
