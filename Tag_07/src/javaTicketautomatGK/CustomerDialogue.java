package javaTicketautomatGK;

public class CustomerDialogue {

	public static void simMoneyInsertion(double tocPrice) {
		OutputDisplay.stillToPay(tocPrice);

		OutputDisplay.userInstruction();

		OutputDisplay.menuTypeOfCoin();

		int choice = OptionCall.menuChoice();

		CalcMoneyInsertion.coin(choice, tocPrice);

	}
}
