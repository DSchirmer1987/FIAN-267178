package DateNTimeAPIgk;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class OutputDisplay {

	public static void wantExit() {

		System.out.println("\n\n(-1) Abbruch");
	}

	public static void exit() {
		System.out.println("\nAuf Wiedersehen.");
	}

	public static void showEntryDialogue() {
		System.out.println("\n\nBitte geben Sie das gewünschte Jubiläums-Datum ein:");
	}

	public static void showMenu() {
		short option = 0;

		System.out.println("\n\nBitte wählen Sie das gewünschte Hochzeitsjubiläum aus:");

		OutputSpacer.outputSpacer90();

		// for each through enum "Jubilee"
		for (Jubilee jubilee : Jubilee.values()) {

			// 3 in a row for better console view
			if (option % 3 == 0) {
				System.out.println();
				OutputSpacer.outputSpacerUS100();
			}
			option++;
			String filler = "";
			int jl = jubilee.name().length();
			if (jl < 6) {
				for(int i = 0; i < jl - 3;i++) {
					filler = filler + " ";
				}
				
			}

			System.out.printf("(%d) %s (%1.1f Jahre)%s\t", option, jubilee, jubilee.getYears(), filler);
		}
		// extra for control of status always ready after use
		OutputDisplay.wantExit();
	}
	/*
	public static void OutputFormats(String strtime) {
	
	// TODO String to LocalDateTime
	
		System.out.println(strTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(strTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
		System.out.println(strTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " " +  strTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println(strTime.format(base_ISO));
	}
*/
}
