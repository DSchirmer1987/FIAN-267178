package musterloesungen.ausflugsplanungKB;

import java.util.ArrayList;
import java.util.Scanner;

public class Ausflugsplanung {

	private ArrayList<Ausflugsziele> ausflugsziele;
	private ArrayList<Ausflugsziele> vorschlaege;
	private Wunschziel wunschziel = new Wunschziel();
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public Ausflugsplanung() {
		super();
		ausflugsziele = new ArrayList<>();
		ausflugsziele.add(new KegelnWoche());
		ausflugsziele.add(new KegelnWochenende());
	}

	@Override
	public String toString() {
		return "Ausflugsplanung [vorschlaege=" + vorschlaege + ", wunschziel=" + wunschziel + "]";
	}

	public ArrayList<Ausflugsziele> getAusflugsziele() {
		return ausflugsziele;
	}

	public void setAusflugsziele(ArrayList<Ausflugsziele> ausflugsziele) {
		this.ausflugsziele = ausflugsziele;
	}

	public ArrayList<Ausflugsziele> getVorschlaege() {
		return vorschlaege;
	}

	public void setVorschlaege(ArrayList<Ausflugsziele> vorschlaege) {
		this.vorschlaege = vorschlaege;
	}

	public Wunschziel getWunschziel() {
		return wunschziel;
	}

	public void setWunschziel(Wunschziel wunschziel) {
		this.wunschziel = wunschziel;
	}

	public void ermittleWunschziel() {
		String first = String.format("Bitte wählen Sie:\n");
		System.out.println(first + "1: für Wochentag\n2: für Wochenende\n3: für egal ");
		int wochentag = sc.nextInt();
		System.out.println(first + "1: für schoenesWetter\n2: für schlechtes Wetter\n3: für egal");
		int wetter = sc.nextInt();
		System.out.println(first + "1: für Schulziet\n2: für Ferien\n3: für egal");
		int schulzeit = sc.nextInt();
		System.out.println(first + "1: für am Tag\n2: am Abend\n3: für egal");
		int tageszeit = sc.nextInt();
		System.out.println(first + "1: für mit Kind\n2: ohne Kind");
		int kind = sc.nextInt();

		if (wochentag == 1) {
			wunschziel.setWochentag(true);
		} else if (wochentag == 2) {
			wunschziel.setWochenende(true);
		} else if (wochentag == 3) {
			wunschziel.setWochenende(true);
			wunschziel.setWochentag(true);
		}
		if (wetter == 1) {
			wunschziel.setSchoenesWetter(true);
		} else if (wetter == 2) {
			wunschziel.setSchlechtesWetter(true);
		} else if (wetter == 3) {
			wunschziel.setSchoenesWetter(true);
			wunschziel.setSchlechtesWetter(true);
		}
		if (schulzeit == 1) {
			wunschziel.setSchulzeit(true);
		} else if (schulzeit == 2) {
			wunschziel.setFerien(true);
		} else if (schulzeit == 3) {
			wunschziel.setSchulzeit(true);
			wunschziel.setFerien(true);
		}
		if (tageszeit == 1) {
			wunschziel.setAmTag(true);
		} else if (tageszeit == 2) {
			wunschziel.setAmTag(true);
		} else if (tageszeit == 3) {
			wunschziel.setAmAbend(true);
			wunschziel.setAmTag(false);
		}
		if (kind == 1) {
			wunschziel.setMitKind(true);
		} else if (kind == 2) {
			wunschziel.setMitKind(false);
		}

	}

	public ArrayList<Ausflugsziele> findeAusflug(Ausflugsziele wunschziel) {
		vorschlaege = new ArrayList<>();

		for (Ausflugsziele ausflugsziel : ausflugsziele) {
			if (ausflugsziel.equals(wunschziel)) {
				vorschlaege.add(ausflugsziel);
			}
		}

		return vorschlaege;
	}

}
