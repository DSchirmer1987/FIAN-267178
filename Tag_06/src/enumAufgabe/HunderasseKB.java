package enumAufgabe;

public enum HunderasseKB {
	Dackel(0.5), Collie(1.0), Dogge(1.5);

	private final double hight;

	HunderasseKB(double hight) {
		this.hight = hight;
	}

	public double getHight() {
		return hight;
	}

}
