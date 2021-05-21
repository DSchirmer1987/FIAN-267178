package DateNTimeAPIgk;

public enum Jubilee {
	HundertTage(0.3), ZwoHFuffzigTage(0.7), Baumwollene(1), Hölzerne(5), Zinnerne(6.5), Kupferne(7), Blecherne(8), Rosen(10), Nickel(12.5), Gläserne(15), Porzellan(20), Silberne(25), Perlen(30), Leinwand(35), Aluminium(37.5), Rubin(40), Goldene(50), Diamantene(60), Eiserne(65), Steinerne(67.5), Gnaden(70), Kronjuwelen(75);
	
	
	private double years;
	
	Jubilee(double years){
		this.years = years;
	}

	public double getYears() {
		return years;
	}

}
