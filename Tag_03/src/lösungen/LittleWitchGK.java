package l�sungen;

public class LittleWitchGK {

	public static void main(String[] args) {
		// Guido K., 05.05.2021
		
		
		// Deklaration
		int clock;
		
		// Eingabe - entf�llt hier
		
		// Verarbeitung + // Ausgabe
		
		for(clock = 6; clock <= 12; clock++) {
										
					// Switch-Case // Fall-Unterscheidung
					switch(clock) {
						case 6: {
							System.out.printf("Morgens fr�h um %d\nkommt die kleine Hex.", clock);
							break;
						}
						case 7: {
							System.out.printf("\nMorgens fr�h um %d\nschabt sie gelbe R�ben.", clock);
							break;
						}
						case 8: {
							System.out.printf("\nMorgens fr�h um %d\nwird der Kaffee gemacht.", clock);
							break;
						}
						case 9: {
							System.out.printf("\nMorgens fr�h um %d\ngeht sie in die Scheun'.", clock);
							break;
						}
						case 10: {
							System.out.printf("\nMorgens fr�h um %d\nhackt sie Holz und Sp�n'.", clock);
							break;
						}
						case 11: {
							System.out.printf("\nFeuert an um %d\nkocht dann bis um %d:", clock, clock + 1);
							break;
						}
						case 12: {
							System.out.printf("\nFr�schebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!");
							break;
						}
						default: {
							System.out.println("Ups, da ist was schiefgelaufen!");
							break;
						}
					}
				}

			}

}
