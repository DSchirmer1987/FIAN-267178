package musterloesungen.GK;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// caution! ANSI, not UTF-8 - keep in mind the difference
		String eingabeDatei = "C:\\Daten\\TestDateiTag17(ANSI).txt";
		String filterWort = "soll";
		String ausgabeDatei = "C:\\Daten\\AusgabeTestDateiTag17.txt";

		int anzahlFilterWort = FilterNSearch.filtern(eingabeDatei, filterWort, ausgabeDatei);

		System.out.println(anzahlFilterWort);

	}

}
