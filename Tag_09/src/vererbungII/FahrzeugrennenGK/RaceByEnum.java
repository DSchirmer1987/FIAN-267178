package vererbungII.FahrzeugrennenGK;

public class RaceByEnum {

	public static int anzFahrzeuge = EnumRaceNSpeed.values().length;
	public static Fahrzeug[] fahrzeug = new Fahrzeug[anzFahrzeuge];
	
	public static Fahrzeug[] fillArrayVehicle() {
				
		for (int i = 0; i < anzFahrzeuge ; i++) {
			switch(EnumRaceNSpeed.values()[i].getOrderNumber()) {
			case 0: {
				fahrzeug[i] = new Fahrrad();
				break;
			}
			case 1: {
				fahrzeug[i] = new Auto();
				break;
			}
			case 2: {
				fahrzeug[i] = new Rennwagen();
				break;
			}
			case 3: {
				fahrzeug[i] = new Krankenwagen();
				break;
			}
			default: {
				System.out.println("Unerwartetes Ereignis.");
				break;
			}
			}
			
			fahrzeug[i].setCurrentSpeedKph(EnumRaceNSpeed.values()[i].getRaceSpeed());
			fahrzeug[i].setVehicleType(EnumRaceNSpeed.values()[i].getVehicleType());
			
		}
		

		return fahrzeug;
	}


}
