package musterloesungen.aufgabeWorterbuchKB;



public class DictionaryEntry {

	private String deutsch;
	private String englisch;
	
	public DictionaryEntry(String deutsch, String englisch) {
		super();
		this.deutsch = deutsch;
		this.englisch = englisch;
	}

	@Override
	public String toString() {
		return String.format("DictionaryEntry [deutsch=" + deutsch + ", englisch=" + englisch + "]\n");
	}

	public String getDeutsch() {
		return deutsch;
	}

	public void setDeutsch(String deutsch) {
		this.deutsch = deutsch;
	}

	public String getEnglisch() {
		return englisch;
	}

	public void setEnglisch(String englisch) {
		this.englisch = englisch;
	}

	


}
	