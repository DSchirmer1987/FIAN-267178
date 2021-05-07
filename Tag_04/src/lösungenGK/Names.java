package lösungenGK;



public class Names {

////////////////////////////////
//start Aufgabe 1, 06.05.2021
////////////////////////////////
	
	public static void main(String[] args) {

		String vorname = "Max";
		String nachname = "Mustermann";
		String name = vorname + " " + nachname;
		String kuerzel = vorname.substring(0, 1) + nachname.substring(0, 1);



		System.out.println(name);
		System.out.println("\nLänge");
		System.out.println("==============");
		System.out.println("Vorname: " + vorname.length());
		System.out.println("Nachname: " + nachname.length());
		System.out.println("Name: " + name.length());

		System.out.println("\nInitialen: " + kuerzel);


	}

////////////////////////////////
//end Aufgabe 1, 06.05.2021
////////////////////////////////	

}

