package vererbungII.FahrzeugrennenGK;

public class OutputResult {

	public static void showResult(Fahrzeug[] fahrzeug) {

		String firstLast;
		
		for(int i = 0; i < fahrzeug.length; i++) {
			firstLast = "";
		// first, last
			if(i == 0) {
				firstLast = "-> Erster";
			}
			if(i == fahrzeug.length -1) {
				firstLast = "-> Letzter";
			}
			
		System.out.printf("Pos. %d - %-15s %6.1f %-10s%n", (i + 1), fahrzeug[i].getVehicleType()+":", fahrzeug[i].getCurrentPositionKm(), firstLast);	
		}
			
	}
	
	public static void showResultEachObject(Fahrzeug fahrrad, Fahrzeug auto, Fahrzeug rennwagen, Fahrzeug krankenwagen) {
		

		
		System.out.println("Fahrrad: " + fahrrad.getCurrentPositionKm());
		System.out.println("Auto: " + auto.getCurrentPositionKm());
		System.out.println("Rennwagen: " + rennwagen.getCurrentPositionKm());
		System.out.println("Krankenwagen: " + krankenwagen.getCurrentPositionKm());
	}

}
