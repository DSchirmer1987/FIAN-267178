package flugzeugGK;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Flugzeug[] flugzeug;

		flugzeug = FillObjectsFlugzeuge.fillObjects();

		OutputConsole.outputAllObjects(flugzeug);

		System.out.println();
		
		OutputConsole.outputFormattedDetails(flugzeug);
		

	}

}
