package flugzeugGK;

// point 10 exercise: class not extendible by final - no child possible
// look at CDoppeldecker for further information
public final class Doppeldecker extends Flugzeug {
	
	// point 7 exercise: final for one time initialization + special constructors + no setter 
	private final boolean offenesCockpit;
	// point 6 exercise: constant 
	private static final int LOOPINGSPEED = 320; // in kph

	// point 7 exercise: final for one time initialization + special constructors + no setter
	// point 9a exercise: constructor as mentioned
	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
		// point 5 exercise: exact 2 pairs of wings
		super(hersteller, maxSpeed, 2);
		// point 7 exercise: final for one time initialization + special constructors + no setter
		this.offenesCockpit = offenesCockpit;
		setImmatNummer(immatNummer);
	}

	// point 9b exercise: constructor as mentioned
	// caution! immatNummer in exercise as int -> guess, that it should be String and is wrong in exercise
	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
		// point 5 exercise: exact 2 pairs of wings
		super(hersteller, maxSpeed, 2);
		// point 7 exercise: final for one time initialization + special constructors + no setter
		this.offenesCockpit = true;
		setImmatNummer(immatNummer);
	}

	
	@Override
	public boolean getLooping() {
		// point 6 exercise: throws true, if maxSpeed > LOOPINGSPEED
		// caution! not totally clear in exercise => "Mindest..." will mean ">=" VS. "grösser" will mean ">"
		// because in text it's nearer to code with "(maxSpeed) decision to use ">"
		if (getMaxSpeed() > LOOPINGSPEED) {
			return true;
		}
		return false;
	}

	// point 8 exercise: method for return of offenesCockpit
	public boolean isOffenesCockpit() {
		return offenesCockpit;
	}

	@Override
	public String toString() {
		return "Doppeldecker [offenesCockpit=" + offenesCockpit + ", getLooping()=" + getLooping()
				+ ", isOffenesCockpit()=" + isOffenesCockpit() + ", getImmatNummer()=" + getImmatNummer()
				+ ", getMaxSpeed()=" + getMaxSpeed() + "]";
	}


	

}
