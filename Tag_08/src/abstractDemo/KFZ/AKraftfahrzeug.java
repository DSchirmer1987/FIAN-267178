package abstractDemo.KFZ;

public abstract class AKraftfahrzeug implements IDrivable{
	private String hersteller;
	private int anzahlRaeder;
	private String lackFarbe;

	public AKraftfahrzeug(String hersteller, int anzahlRaeder, String lackFarbe) {
		super();
		this.hersteller = hersteller;
		this.anzahlRaeder = anzahlRaeder;
		this.lackFarbe = lackFarbe;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public String getLackFarbe() {
		return lackFarbe;
	}

	public void setLackFarbe(String lackFarbe) {
		this.lackFarbe = lackFarbe;
	}

	@Override
	public String toString() {
		return "Kraftfahrzeug [hersteller=" + hersteller + ", anzahlRaeder=" + anzahlRaeder + ", lackFarbe=" + lackFarbe
				+ "]";
	}
	
	public abstract void bewegen();
	public abstract void hupen();

	@Override
	public void backwards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
