package kaffeeAutomaten.model;

public enum Tassen {

	KLEIN (100),MITTEL(250)	,GROSS(500);
	
	private int ml;
	
	Tassen(int ml) {
		this.ml=ml;
	}

	public int getMl() {
		return ml;
	}
	
	
}
