package lösungen;

public class LittleWitchGK {

	public static void main(String[] args) {
		// Guido K., 05.05.2021
		
		
		// Deklaration
		int clock;
		
		// Eingabe - entfällt hier
		
		// Verarbeitung + // Ausgabe
		
		for(clock = 6; clock <= 12; clock++) {
										
					// Switch-Case // Fall-Unterscheidung
					switch(clock) {
						case 6: {
							System.out.printf("Morgens früh um %d\nkommt die kleine Hex.", clock);
							break;
						}
						case 7: {
							System.out.printf("\nMorgens früh um %d\nschabt sie gelbe Rüben.", clock);
							break;
						}
						case 8: {
							System.out.printf("\nMorgens früh um %d\nwird der Kaffee gemacht.", clock);
							break;
						}
						case 9: {
							System.out.printf("\nMorgens früh um %d\ngeht sie in die Scheun'.", clock);
							break;
						}
						case 10: {
							System.out.printf("\nMorgens früh um %d\nhackt sie Holz und Spän'.", clock);
							break;
						}
						case 11: {
							System.out.printf("\nFeuert an um %d\nkocht dann bis um %d:", clock, clock + 1);
							break;
						}
						case 12: {
							System.out.printf("\nFröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch!");
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
