package aufgabeKaffeeautomatGK;

public class OutputDisplay {

	public static void showMenu() {
		short option = 0;

		System.out.println("Bitte wählen Sie die gewünschte Sorte aus");

		OutputSpacer.outputSpacer45();

		// for each through enum "TypeOfCoffee"
		for (TypeOfCoffee typeOfCoffee : TypeOfCoffee.values()) {

			option++;

			System.out.printf("(%d) %s (%1.2f Euro)\n", option, typeOfCoffee, typeOfCoffee.getPrice());
		}
	}

	public static double insertCoins(int choice) {

		// chooses TypeOfCoin according to user input
		String tocName = TypeOfCoffee.values()[choice - 1].name();
		double tocPrice = TypeOfCoffee.values()[choice - 1].getPrice();

		System.out.printf("\nIhre Wahl: %s -> Bitte werfen Sie mind. %1.2f Euro in Münzen ein (Automat wechselt).\n",
				tocName, tocPrice);

		OutputSpacer.outputSpacer90();
		OutputSpacer.outputSpacer90();

		System.out.println();

		return tocPrice;
	}

	public static void stillToPay(double tocPrice) {
		System.out.printf("\nZu zahlender Betrag: %1.2f Euro", tocPrice);
	}

	public static void userInstruction() {
		System.out.println();
		System.out.println(
				"\n\nBitte geben Sie die passende Auswahl zu der Münze ein, die Sie gerade eingeworfen haben: ");

		OutputSpacer.outputSpacer90();
	}

	public static void menuTypeOfCoin() {
		short option = 0;
		for (TypeOfCoin typeOfCoin : TypeOfCoin.values()) {

			// 3 in a row for better console view
			if (option % 3 == 0) {
				System.out.println();
				OutputSpacer.outputSpacerUS90();
			}
			option++;

			System.out.printf("(%d) %s (%1.2f Euro)\t", option, typeOfCoin.getCName(), typeOfCoin.getValue() / 100);

		}
		System.out.println();
		OutputSpacer.outputSpacerUS90();
		System.out.println();
	}

	public static void yourChange(double tocPrice) {
		double change = Math.abs(tocPrice);

		System.out.println();
		System.out.printf("\nIhr Rückgeld beträgt %1.2f Euro. ", change);
		System.out.println("Der Münzauswurf erfolgt...");
		System.out.println();
		OutputSpacer.outputSpacer90();

		// getter
		CalcChange.getChange(change);

	}

}
