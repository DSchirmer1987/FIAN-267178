package vererbungII.FahrzeugrennenGK;

public class Special {

	public Special() {
		// TODO Auto-generated constructor stub
	}

	public static void competitiveEdge(Fahrzeug[] fahrzeug) {
		for (int i = 0; i < EnumRaceNSpeed.values().length; i++) {
			if (fahrzeug[i].getVehicleType() == "Fahrrad") {
				// competitive edge of 4 hours (in minutes) for bike
				fahrzeug[i].move(4 * 60);
			}
			;
		}
	}

	public static void oneHourRace(Fahrzeug[] fahrzeug) {
		for (int i = 0; i < EnumRaceNSpeed.values().length; i++) {
			// 1 hour of racing (in minutes)
			fahrzeug[i].move(1 * 60);
		}

	}
}
