package vererbungII.FahrzeugrennenGK;

public class CalcResult {

	public CalcResult() {
		// TODO Auto-generated constructor stub
	}

	public static void PositionRace(Fahrzeug[] fahrzeug) {
		String tmpType;
		Double tmpPositionKm;

		for (int j = 0; j < fahrzeug.length - 1; j++) {

			for (int i = 0; i < fahrzeug.length - 1; i++) {
				if (fahrzeug[i].getCurrentPositionKm() > fahrzeug[i + 1].getCurrentPositionKm()) {
				} else {
					tmpType = fahrzeug[i + 1].getVehicleType();
					tmpPositionKm = fahrzeug[i + 1].getCurrentPositionKm();
					fahrzeug[i + 1].setVehicleType(fahrzeug[i].getVehicleType());
					fahrzeug[i + 1].setCurrentPositionKm(fahrzeug[i].getCurrentPositionKm());
					fahrzeug[i].setVehicleType(tmpType);
					fahrzeug[i].setCurrentPositionKm(tmpPositionKm);

				}


			}

			
		}
	}
}