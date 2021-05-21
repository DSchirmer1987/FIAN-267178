package datumVererbungKB;

import java.time.LocalDateTime;

public class Monatskarte extends Ticket {

	private String nameEigentuemer;
	private LocalDateTime gueltigBis;

	public Monatskarte(int preis, int zone) {
		super(preis, zone);
		this.gueltigBis = LocalDateTime.now().plusDays(30);
		
	}
	
	@Override
	public String toString() {
		return "Monatskarte extends Ticket [preis=" + super.getPreis() + ", entwertet=" + super.istEntwertet()
				+ "isGruppenKarte=" + super.isGruppenkarte() + "nameEigentuemer=" + nameEigentuemer
				+ ", gueltigkeitsZeitraum=" + gueltigBis + "]";
	}


	public LocalDateTime getGueltigBis() {
		return gueltigBis;
	}

	public void setGueltigBis(LocalDateTime gueltigBis) {
		this.gueltigBis = gueltigBis;
	}

	
	public String getNameEigentuemer() {
		return nameEigentuemer;
	}

	public void setNameEigentuemer(String nameEigentuemer) {
		this.nameEigentuemer = nameEigentuemer;
	}

	

	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}
}
