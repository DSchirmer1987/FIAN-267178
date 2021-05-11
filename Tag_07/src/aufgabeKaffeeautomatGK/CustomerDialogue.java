package aufgabeKaffeeautomatGK;

public class CustomerDialogue {

	public static void simCoinInsertion(double tocPrice) {


		OutputDisplay.stillToPay(tocPrice);

		OutputDisplay.userInstruction();

		OutputDisplay.menuTypeOfCoin();

		int choice = OptionCall.menuChoice();

		CalcCoinInsertion.coin(choice, tocPrice);
		
	}
}
