package demoInterfaces;

public class Word {
	public String word;
	public int ID;
	
	public Word(String word, int ID) {
		super();
		this.word = word;
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", ID=" + ID + "]";
	}
	
	
}
