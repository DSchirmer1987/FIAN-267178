package cafeteriaGK;

public enum ETasse {
	klein(100), mittel(250), gross(500);

	private int volumeCup;
	
	ETasse(int volumeCup) {
		this.volumeCup = volumeCup;
	}

	public int getVolumeCup() {
		return volumeCup;
	}
}
