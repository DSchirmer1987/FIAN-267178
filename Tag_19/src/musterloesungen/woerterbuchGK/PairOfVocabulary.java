package musterloesungen.woerterbuchGK;

import java.util.Scanner;

public class PairOfVocabulary {
	private String germanVocabulary;
	private String englishVocabulary;
	
	public PairOfVocabulary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die deutsche Vokabel ein: ");
		String input = scanner.nextLine();
		this.germanVocabulary = input;
		System.out.println("Bitte geben Sie die englische Vokabel ein: ");
		input = scanner.nextLine();
		this.englishVocabulary = input;
		scanner.close();
	}
	
	public PairOfVocabulary(String germanVocabulary, String englishVocabulary) {
		this.germanVocabulary = germanVocabulary;
		this.englishVocabulary = englishVocabulary;
	}
	
	public String getGermanVocabulary() {
		return germanVocabulary;
	}
	public void setGermanVocabulary(String germanVocabulary) {
		this.germanVocabulary = germanVocabulary;
	}
	public String getEnglishVocabulary() {
		return englishVocabulary;
	}
	public void setEnglishVocabulary(String englishVocabulary) {
		this.englishVocabulary = englishVocabulary;
	}
	@Override
	public String toString() {
		return "PairOfVocabulary [germanVocabulary=" + germanVocabulary + ", englishVocabulary=" + englishVocabulary
				+ ", getGermanVocabulary()=" + getGermanVocabulary() + ", getEnglishVocabulary()="
				+ getEnglishVocabulary() + "]";
	}

}
