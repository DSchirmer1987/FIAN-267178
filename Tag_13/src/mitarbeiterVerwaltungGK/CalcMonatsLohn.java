package mitarbeiterVerwaltungGK;

public class CalcMonatsLohn {
	private static double fixGehalt;
	private static double umsatz;
	private static double provision;
	private static double stundenlohn;
	private static double anzahlstunden;
	private static double ueberstundenzuschlag;
	private static double anzahlueberstunden;
	
	public CalcMonatsLohn() {
		// TODO Auto-generated constructor stub
	}
	
	public static double MonatslohnHilfsarbeiter(double stundenlohn, double anzahlstunden, double ueberstundenzuschlag, double anzahlueberstunden) {
	return stundenlohn*anzahlstunden + ueberstundenzuschlag*anzahlueberstunden;	
	}
	
	public static double MonatslohnVerkaeufer(double fixGehalt, double umsatz, double provision) {
		return (fixGehalt+umsatz*provision/100); 
	}

}
