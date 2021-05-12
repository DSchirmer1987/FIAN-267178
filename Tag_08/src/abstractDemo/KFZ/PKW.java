package abstractDemo.KFZ;

public class PKW extends AKraftfahrzeug{

	public PKW(String hersteller, int anzahlRaeder, String lackFarbe) {
		super(hersteller, anzahlRaeder, lackFarbe);
	}

	@Override
	public void bewegen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hupen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "PKW [getHersteller()=" + getHersteller() + ", getAnzahlRaeder()=" + getAnzahlRaeder()
				+ ", getLackFarbe()=" + getLackFarbe() + "]";
	}
	

}
