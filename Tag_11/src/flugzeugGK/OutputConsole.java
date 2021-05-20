package flugzeugGK;

public class OutputConsole {

	public OutputConsole() {

	}

	public static void outputAllObjects(Flugzeug[] flugzeuge) {
		for (int i = 0; i < flugzeuge.length; i++) {
			System.out.println(flugzeuge[i]);
		}
	}

	public static void outputFormattedDetails(Flugzeug[] flugzeuge) {
		System.out.print("Hersteller\t| Klasse\t\t|vMax |\tLooping   |\tImatNo\t\t\t|Offenes Cockpit\n");
		for (int i = 0; i < 110; i++) {
			System.out.printf("=");
		}

		for (Flugzeug tmp : flugzeuge) {
			System.out.printf("\n%-16s| %-22s| %4d|\t%-10b|\t%-24s|", tmp.getHersteller(),
					tmp.getClass().getSimpleName(), tmp.getMaxSpeed(), tmp.getLooping(), tmp.getImmatNummer());

			// caution! equals because == will not work
			if (tmp.getClass().getSimpleName().equals("Doppeldecker")) {
				// method of child class not available here => work around
				String tmpSearch = "isOffenesCockpit()=true";
				String tmpStr = tmp.toString();
				boolean oC = tmpStr.indexOf(tmpSearch) > -1;
				System.out.printf("%s", oC);
			}

		}
	}
	
}
