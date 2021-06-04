package musterloesungen.ausflugGK;

import java.util.Scanner;

public class IO {
	
	// conditions according to user input
	public static boolean weekend;
	public static boolean rainy;
	public static boolean holidays;
	public static boolean evening;
	public static boolean children;

	// array of all choices (only for test purposes) - contains boolean of weekend, rainy, holidays, evening, children
	private static boolean[] allChoices = new boolean[5];

	private static Scanner sc = new Scanner(System.in);
	private static String input;

	// menu for the planner with throws exception to guarantee input of 1 or 2
	public static void menuPlanner() throws IllegalArgumentException {

		// multi use for the allowed choices
		String tmp = " (1 / 2)";

		// header
		System.out.println("Option 1 /\t\tOption 2");
		System.out.println("===================================================================");

		// initialize options for planning 
		String[][] qNA = new String[][] { { "Wochentag /\t\tWochenende", "-1" },
				{ "Schönes Wetter /\tRegenwetter", "-1" }, { "Schulferien /\t\tSchule", "-1" },
				{ "Tagsüber /\t\tAbend", "-1" }, { "Mit Kindern /\t\tohne Kinder", "-1" } };

		// loop through the options
		for (int i = 0; i < qNA.length; i++) {
			System.out.println(qNA[i][0] + tmp);
			input = sc.nextLine();
			qNA[i][1] = input;
			// try/catch for correct input of choice
			try {
				if (!input.equals("1") && !input.equals("2")) {
					throw new IllegalArgumentException();
				}
				;
			// if input not correct question comes again by i--
			} catch (IllegalArgumentException e) {
				System.out.println("Ungültige Eingabe (nur 1 oder 2 eingeben).");
				i--;
			}

			// user input is set to the right boolean -> identification by order of questions
			// guess that there are better ways to solve -> teacher help?
			// // allChoices (only for test purposes) - contains boolean of weekend, rainy, holidays, evening, children
			switch (i) {
			case 0:
				if (input.equals("1")) {
					weekend = false;
				} else {
					weekend = true;
				}
				allChoices[i] = weekend;
				break;
			case 1:
				if (input.equals("1")) {
					rainy = false;
				} else {
					rainy = true;
				}
				allChoices[i] = rainy;
				break;
			case 2:
				if (input.equals("2")) {
					holidays = false;
				} else {
					holidays = true;
				}
				allChoices[i] = holidays;
				break;
			case 3:
				if (input.equals("1")) {
					evening = false;
				} else {
					evening = true;
				}
				allChoices[i] = evening;
				break;
			case 4:
				if (input.equals("1")) {
					children = false;
				} else {
					children = true;
				}
				allChoices[i] = children;
				break;
			default:
				System.out.println("Unerwartetes Ereignis. Bitte melden.");
				break;
			}

		}
		
		// control output
		// allChoices (only for test purposes) - contains boolean of weekend, rainy, holidays, evening, children
		for (int i = 0; i < qNA.length; i++) {
			// for better view in console
			if(qNA[i][0].length()>22) {
				tmp = "";
			}else {
				tmp = "\t";
			}
			
			System.out.println(qNA[i][0] + "\t" + tmp + "-- " + qNA[i][1] + " -- " + allChoices[i]);
		}

		
		// only test purposes - other idea behind which was not continued
		// boolean[] output = new boolean[14];

		// initialize array of enum TripIdeas
		// caution! allows iterating for-loop - if not: only for each will be possible
		TripIdeas[] ti = TripIdeas.values();
	
		// loop through enum - version 1 and version 2
		for (int i = 0; i < ti.length; i++) {
			
			// version 1: enum contains name of event 
			// comments above cases to know where you are (for programmer ->
			// easier by control output - containing index, event, full description of event, pseudo-boolean of conditions "logic")
			// pseudo-boolean uses AND/OR instead of &&/|| for better differentiation to real code
			/*
			switch (i) {
			// Kegeln: evening OR weekend
			case 0: {
				if (evening || weekend) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Freibad: !rainy AND evening
			case 1: {
				if (!rainy && evening) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Hallenbad: !(holidays AND weekend)
			case 2: {
				if (!(holidays && weekend)) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Wandern_im_Dunkelwald: !rainy AND !evening
			case 3: {
				if (!rainy && !evening) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Freikurs_Musik: !holidays AND !weekend AND evening
			case 4: {
				if (!holidays && !weekend && evening) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Brotbackkurs: weekend AND rainy
			case 5: {
				if (weekend && rainy) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Schieferbergwerk: !evening OR (holidays AND weekend)
			case 6: {
				if (!evening || (holidays && weekend)) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Go_Kurse: (weekend AND rainy) OR (!weekend AND !rainy AND evening)
			case 7: {
				if ((weekend && rainy) || (!weekend && !rainy && evening)) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Billard: (evening OR weekend) AND !children
			case 8: {
				if ((evening || weekend) && !children) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Rennautofahren: !children AND !evening AND weekend AND holidays
			case 9: {
				if (!children && !evening && weekend && holidays) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Open_Air_Kino: !rainy AND (evening OR weekend)
			case 10: {
				if (!rainy && (evening || weekend)) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Korbflechten: !weekend AND holidays AND rainy
			case 11: {
				if (!weekend && holidays && rainy) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Besuch_des_Wasserfalls: !evening
			case 12: {
				if (!evening) {
					output[i] = true;
				} else {
					output[i] = false;
				}
				break;
			}
			// Zoobesuch: always
			case 13: {
				output[i] = true;
				break;
			}
			default:{
				System.out.println("Fallauswahl nicht möglich. Bitte melden.");
				break;
			}

			}*/
			

			
			// for better view in console
			if(ti[i].name().length()>20) {
				tmp = "";
			}else if(ti[i].name().length()>8){
				tmp = "\t";
			}else {
				tmp = "\t\t";
			}
			// output all choices with output true/false for testing
			// in the loop to avoid extra loop through all enum values
			// TODO better output for GUI etc.
			System.out.println(i + " -- " + ti[i] + ": " + tmp + "\tAusgabe (output): " + /*output[i] +*/ " -- "
			// ti[i].output with parameters to return the special(!) method of enum TripIdeas
					// depending on the respective event/trip
					// look at TripIdeas.java version 2
					+ ti[i].output(weekend, rainy, holidays, evening, children));
		}



	}
}
