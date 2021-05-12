package vererbungI.loesungGK;

//Datei: Motorrad.java
class Motorrad extends Fahrzeug {
	private String fahrzeugtyp = "Motorrad";

	public void print() {
		System.out.println("\nFahrzeugtyp : " + fahrzeugtyp);
		super.print();
	}
}