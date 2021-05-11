package aufgabeKaffeeautomatGK;

public enum TypeOfCoin {
	Euro2("2 Euro", 200), Euro1("1 Euro", 100), Cent50("50 Cent", 50), Cent20("20 Cent", 20), Cent10("10 Cent", 10), Cent5("5 Cent", 5), Cent2("2 Cent", 2), Cent1("1 Cent", 1);

	private String cName;
	private double val;
	

	TypeOfCoin(String cName, double val) {
		this.cName = cName;
		this.val = val;
		
	}

	public String getCName() {
		return cName;
	}
	
	public double getValue() {
		return val;
	}
	

}
