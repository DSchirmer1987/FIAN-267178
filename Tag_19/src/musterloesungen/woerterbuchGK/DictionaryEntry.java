package musterloesungen.woerterbuchGK;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryEntry {

	private ArrayList<PairOfVocabulary> vocabulary = new ArrayList<PairOfVocabulary>();
	Scanner scanner = new Scanner(System.in);
	String input;

	public void addEntryWithoutArgs() {
		vocabulary.add(new PairOfVocabulary());
	}

	public void addEntryWithArgs(String germanVocabulary, String englishVocabulary) {
		vocabulary.add(new PairOfVocabulary(germanVocabulary, englishVocabulary));
	}

	public void translateGermanEnglish() {
		System.out.println("Bitte geben Sie die deutsche Vokabel ein:");
		input = scanner.nextLine();
		for (PairOfVocabulary p : vocabulary) {
			if (input.equals(p.getGermanVocabulary())) {
				System.out.println(p.getEnglishVocabulary());
			}
		}
	}

	public void translateEnglishGerman() {
		System.out.println("Bitte geben Sie die englische Vokabel ein:");
		input = scanner.nextLine();
		for (PairOfVocabulary p : vocabulary) {
			if (input.equals(p.getEnglishVocabulary())) {
				System.out.println(p.getGermanVocabulary());
			}
		}
	}

	public void outputDictionary() {
		System.out.println("\nAusgabe Wörterbuch deutsch - englisch");
		System.out.println("=============================================");
		String tmp = "";
		for (int i = 0; i < vocabulary.size(); i++) {

			// better looking output in console
			if ((i + 1) < 10) {
				tmp = " ";
			}
			System.out.println(tmp + (i + 1) + ".:\t" + vocabulary.get(i).getGermanVocabulary() + tmp + " - "
					+ vocabulary.get(i).getEnglishVocabulary());
			tmp = "";
		}
	}
	

	public void orderByGermanVocabulary() {
		PairOfVocabulary[] tmpPov = new PairOfVocabulary[vocabulary.size()];
		
		// temporary array for sort to keep array vocabulary in original
		for (int i = 0; i < vocabulary.size(); i++) {
			tmpPov[i] = vocabulary.get(i);
		}

		
		// sort in temporary array
		for (int i = 0; i < tmpPov.length; i++) {
			for (int j = tmpPov.length - 1; j > 0; j--) {
				int compare = tmpPov[j].getGermanVocabulary().compareToIgnoreCase(tmpPov[j-1].getGermanVocabulary());

				if (compare > 0) {
					PairOfVocabulary tmp = tmpPov[j];
					tmpPov[j] = tmpPov[j - 1];
					tmpPov[j - 1] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.println("\nAusgabe Wörterbuch deutsch - englisch - sortiert nach deutschen Vokabeln");
		System.out.println("===============================================================================");
		
		for (int i = 0; i < tmpPov.length; i++) {
			String tmp = " ";
			if(tmpPov[i].getGermanVocabulary().length() > 9) {
				tmp = "";
			}
			System.out.println(tmpPov[i].getGermanVocabulary() + tmp + " - " + tmpPov[i].getEnglishVocabulary());
		}
		

	}

	public void orderByEnglishVocabulary() {
	PairOfVocabulary[] tmpPov = new PairOfVocabulary[vocabulary.size()];
		
		// temporary array for sort to keep array vocabulary in original
		for (int i = 0; i < vocabulary.size(); i++) {
			tmpPov[i] = vocabulary.get(i);
		}

		
		// sort in temporary array
		for (int i = 0; i < tmpPov.length; i++) {
			for (int j = tmpPov.length - 1; j > 0; j--) {
				int compare = tmpPov[j].getEnglishVocabulary().compareToIgnoreCase(tmpPov[j-1].getEnglishVocabulary());

				if (compare > 0) {
					PairOfVocabulary tmp = tmpPov[j];
					tmpPov[j] = tmpPov[j - 1];
					tmpPov[j - 1] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.println("\nAusgabe Wörterbuch deutsch - englisch - sortiert nach englischen Vokabeln");
		System.out.println("===============================================================================");
		
		for (int i = 0; i < tmpPov.length; i++) {
			String tmp = " ";
			if(tmpPov[i].getGermanVocabulary().length() > 9) {
				tmp = "";
			}
			System.out.println(tmpPov[i].getGermanVocabulary() + tmp + " - " + tmpPov[i].getEnglishVocabulary());
		}
	}

	@Override
	public String toString() {
		return "DictionaryEntry [vocabulary=" + vocabulary + "]";
	}

}
