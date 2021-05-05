package littlewitch;

public class Littlewitch {
	private int clock;
	private final String morgens = "Morgens fr�h um ";
	
	public Littlewitch() {
		this.clock = 6;
	}

	public int getClock() {
		return clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public String getMorgens() {
		return morgens;
	}

	@Override
	public String toString() {
		return "Littlewitch [clock=" + clock + ", morgens=" + morgens + "]";
	}
	
	public void sagGedicht() {
		for(; this.clock<=12; this.clock++) {
			if(this.clock <= 10) {
				System.out.println(this.morgens + this.clock);
			}
			switch (this.clock) {
			case 6: System.out.println("kommt die kleine Hex."); break;
			case 7: System.out.println("schabt sie gelbe R�ben."); break; 
			case 8: System.out.println("wird Kaffee gemacht."); break;
			case 9: System.out.println("geht sie in die Scheun'."); break;
			case 10: System.out.println("hackt sie Holz und Sp�n'."); break;
			case 11: System.out.println("Feuert an um "+clock+ ", \nkocht dann bis um 12."); break;
			default: System.out.println("Fr�schebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch"); break;
			}
		}
	}
	
}
