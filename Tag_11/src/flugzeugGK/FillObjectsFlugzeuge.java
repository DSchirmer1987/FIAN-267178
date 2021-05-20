package flugzeugGK;

public class FillObjectsFlugzeuge {

	public FillObjectsFlugzeuge() {
		// TODO Auto-generated constructor stub
	}
	
	public static Flugzeug[] fillObjects() {
	// hersteller, maxSpeed, immatNummer, anzahlPassagiere
	Flugzeug verkehrsflugzeug = new Verkehrsflugzeug("Boeing", 830, "DELU1", 300);

	// hersteller, maxSpeed, immatNummer, offenesCockpit
	Flugzeug doppeldeckerOpenNLoop = new Doppeldecker("Waco", 321, "USWopen", true);

	// hersteller, maxSpeed, immatNummer, offenesCockpit
	Flugzeug doppeldeckerClosedNLoop = new Doppeldecker("Griffon", 340, "USWclosed", false);

	// hersteller, maxSpeed, immatNummer
	Flugzeug doppeldeckerOpenNoLoop = new Doppeldecker("Waco", 290, "ExerciseAsIntWrong123");
	
	Flugzeug[] flugzeuge = new Flugzeug[] { verkehrsflugzeug, doppeldeckerOpenNLoop, doppeldeckerClosedNLoop,
			doppeldeckerOpenNoLoop };
	
	return flugzeuge;
	
	}
	

}
