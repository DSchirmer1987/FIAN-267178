package tag47.CafeteriaIISpecialGK.model;

public enum ECup {
	KLEIN(100), MITTEL(250), GROSS(500);

	private int volumeCup;
	
	ECup(int volumeCup) {
		this.volumeCup = volumeCup;
	}

	public int getVolumeCup() {
		return volumeCup;
	}

	public void setVolumeCup(int volumeCup) {
		this.volumeCup = volumeCup;
	}
}
