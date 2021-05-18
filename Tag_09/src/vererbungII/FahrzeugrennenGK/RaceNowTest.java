package vererbungII.FahrzeugrennenGK;

public class RaceNowTest {

	public RaceNowTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Fahrzeug[] fahrzeug;
		
		fahrzeug = RaceByEnum.fillArrayVehicle();
		
		Special.competitiveEdge(fahrzeug);
		Special.oneHourRace(fahrzeug);
		CalcResult.PositionRace(fahrzeug);
		OutputResult.showResult(fahrzeug);
		
		System.out.println();
		
		// first method - no loops and without calculation of position
		// including output
		RaceByEachObject.Race();
		

	
		

		
		

		
	

	}

}
