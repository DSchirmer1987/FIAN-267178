package javaTicketautomatGK;

public class OutputDisplay {
	
	public static void wantExit() {
		
		System.out.println("\n(-1) Abbruch");
	}
	
	public static void exit() {
		System.out.println("\nAuf Wiedersehen.");
	}
	
	public static void showMenu() {
		short option = 0;

		System.out.println("\n\nBitte wählen Sie die gewünschte Tarifzone aus:");

		OutputSpacer.outputSpacer45();

		// for each through enum "TypeOfCoffee"
		for (TypeOfTicket typeOfTicket : TypeOfTicket.values()) {

			option++;

			System.out.printf("(%d) %s (%1.2f Euro)\n", option, typeOfTicket, typeOfTicket.getPrice());
		}
		// extra for control of status always ready after use
		OutputDisplay.wantExit();
	}

	public static double insertMoney(int choice) {

		// chooses TypeOfCoin according to user input
		String tocName = TypeOfTicket.values()[choice - 1].name();
		double tocPrice = TypeOfTicket.values()[choice - 1].getPrice();

		System.out.printf("\nIhre Wahl: %s -> Bitte werfen Sie mind. %1.2f Euro ein (bis max. 20 Euro - Automat wechselt).\n",
				tocName, tocPrice);

		OutputSpacer.outputSpacer100();
		OutputSpacer.outputSpacer100();

		System.out.println();

		return tocPrice;
	}

	public static void stillToPay(double tocPrice) {
		if(tocPrice == 0) {
			System.exit(0);;
		}
		System.out.printf("\nZu zahlender Betrag: %1.2f Euro", tocPrice);
	}

	public static void userInstruction() {
		System.out.println();
		System.out.println(
				"\n\nBitte geben Sie die passende Auswahl zu der Banknote/Münze ein, die Sie gerade eingeworfen haben: ");

		OutputSpacer.outputSpacer100();
	}

	public static void menuTypeOfCoin() {
		short option = 0;
		for (TypeOfChange typeOfCoin : TypeOfChange.values()) {

			// 3 in a row for better console view
			if (option % 3 == 0) {
				System.out.println();
				OutputSpacer.outputSpacerUS100();
			}
			option++;

			System.out.printf("(%d) %s (%1.2f Euro)\t", option, typeOfCoin.getmName(), typeOfCoin.getValue() / 100);

		}
		System.out.println();
		OutputSpacer.outputSpacerUS100();
		System.out.println();
	}

	public static void yourChange(double tocPrice) {
		double change = Math.abs(tocPrice);

		System.out.println();
		System.out.printf("\nIhr Rückgeld beträgt %1.2f Euro. ", change);
		System.out.println("Der Münzauswurf erfolgt...");
		System.out.println();
		OutputSpacer.outputSpacer100();

		// getter
		CalcChange.getChange(change);

	}

}
