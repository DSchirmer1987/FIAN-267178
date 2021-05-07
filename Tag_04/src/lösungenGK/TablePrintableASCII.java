package lösungenGK;

public class TablePrintableASCII {
	
////////////////////////////////
//start Aufgabe 5, 06.05.2021
////////////////////////////////

	public static void main(String[] args) {
		
// complication for better view in console

// headline + column names
		System.out.println("\nTabelle für druckbare ASCII-Zeichen");
		System.out.println("========================================");
		System.out.println("Dezimalzahl\tZeichen\t\tDezimalzahl\tZeichen");

// ascii for left column
		short asclc = 32;

// offset for ascii right column
		short offsetascrc = 48;

// first line extra because <<space>> is listed as "Leerzeichen" - instead of if in the for-loop
		System.out.println(asclc + "\t\tLeerzeichen\t" + (int) (asclc + offsetascrc) + "\t\t"
				+ (char) (int) (asclc + offsetascrc));

		for (asclc = 33; asclc < 79; asclc++) {

			System.out.println(asclc + "\t\t" + (char) asclc + "\t\t" + (int) (asclc + offsetascrc) + "\t\t"
					+ (char) (int) (asclc + offsetascrc));
		}

// last line extra because <<del>> is listed as "Löschen" - instead of if in the for-loop
		System.out.println(asclc + "\t\t" + (char) asclc + "\t\t" + (int) (asclc + offsetascrc) + "\t\tLöschen");


	}
	
///////////////////////////////
//end Aufgabe 5, 06.05.2021
///////////////////////////////

}
