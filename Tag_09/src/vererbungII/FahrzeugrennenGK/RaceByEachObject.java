package vererbungII.FahrzeugrennenGK;

public class RaceByEachObject {

	public RaceByEachObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Race() {
		Fahrzeug fahrrad = new Fahrrad();
		Fahrzeug auto = new Auto();
		Fahrzeug rennwagen = new Rennwagen();
		Fahrzeug krankenwagen = new Krankenwagen();
		
		
		fahrrad.setCurrentSpeedKph(20.0);
		auto.setCurrentSpeedKph(150.0);
		rennwagen.setCurrentSpeedKph(200.0);
		krankenwagen.setCurrentSpeedKph(80.0);
		
		Fahrzeug[] fahrzeuge = new Fahrzeug[] {fahrrad, auto, rennwagen, krankenwagen};
		

		// competitive edge of 4 hours (in minutes)
		fahrrad.move(4 * 60);

	
		
		// race of 1 hour duration (in minutes)
		double tmpDuration = 1 * 60;
		
		fahrrad.move(tmpDuration);
		auto.move(tmpDuration);
		rennwagen.move(tmpDuration);
		krankenwagen.move(tmpDuration);
		
		OutputResult.showResultEachObject(fahrrad, auto, rennwagen, krankenwagen);
	}

}
