package aufgabeKaffeeautomatGK;

public class SimKaffeeautomatGK {
	
	public static void main(String[] args) {


		OutputDisplay.showMenu();

		int choice = OptionCall.menuChoice();

		double tocPrice = OutputDisplay.insertCoins(choice);

		CustomerDialogue.simCoinInsertion(tocPrice);

	}

}
