package musterloesungen.ausflugsplanungKB;

public class Application {

	public static void main(String[] args) {
	
	Ausflugsplanung ap = new Ausflugsplanung();
	ap.ermittleWunschziel();
	ap.findeAusflug(ap.getWunschziel());
	System.out.println(ap);
	
	}
}
