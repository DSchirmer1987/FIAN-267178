package musterloesungen.aufgabeWorterbuchKB;

import java.util.Scanner;

public class DictionaryController {
	Dictionary d;
	public DictionaryController() {
		d = new Dictionary();
//		d.loadDictionary();
//		System.out.println(d.toString());
		run();
	}
	
	public void run() {
		boolean end = false;
		boolean nofailure = false;
		int intChoice = 0;
		String choice;
		String fehler = "Ihre Eingabe war nicht korrekt. Bitte wählen Sie ein Zahl zwischen 1 und 6!\n";
		Scanner sc = new Scanner(System.in);
		
		d.loadDictionary();

		while (!end) {
			System.out.println("Was möchten Sie tun?\n" + "1: Eintrag vornehmen\n"
					+ "2: Übersetzen Deutsch zu Englisch\n"
					+ "3: Übersetzen Englisch zu Deutsch\n4: Wörterbuch speichern\n5: Wörterbuch ausgeben\n6: Beenden");
			while (!nofailure) {
				choice = sc.nextLine();
				try {
					intChoice = Integer.parseInt(choice);

					nofailure = (intChoice > 0 && intChoice < 7);
					if (!nofailure) {

						System.out.println(fehler);
					}

				} catch (NumberFormatException e) {

					System.out.println(fehler);
				}
			}
			switch (intChoice) {
			case 1: {
				nofailure = false;
				System.out.println("Bitte geben sie Ihren Eintrag wie folgt ein: deutsch:englisch");
				String tmp = null;
				sc = new Scanner(System.in);
				tmp = sc.nextLine();

				if (tmp.contains(":")) {
					String deutsch = tmp.substring(0, (tmp.indexOf(':')));
					String englisch = tmp.substring(tmp.indexOf(':') + 1);
					d.addPair(deutsch, englisch);
				}

			}
				break;
			case 2: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu übersetzende Wort ein:");
				System.out.println(d.deutschNachEnglisch(sc.next()));

			}
				break;
			case 3: {
				nofailure = false;
				System.out.println("Bitte geben Sie das zu übersetzende Wort ein:");
				System.out.println(d.englischNachDeutsch(sc.next()));

			}
				break;
			case 4: {
				nofailure = false;
				d.saveDictionary();

			}
				break;
			case 5: {
				nofailure = false;
				System.out.println(d.toString());

			}
				break;
			case 6: {
				nofailure = false;
				while (!nofailure) {
					System.out.println("Möchten Sie vor dem Beenden das Wörterbuch speichern? j/n");
					String tmp=sc.nextLine();
					if (tmp.equalsIgnoreCase("j")) {
						nofailure=true;
						d.saveDictionary();
					}else if(tmp.equalsIgnoreCase("n")){
						nofailure=true;
					}else {
						System.out.println("Flasche Eingabe!");
					}
				}
				System.out.println("Tschüss!");
				end = true;
			}
			}
		}
	}
}
