package javaTicketautomatGK;

public enum TypeOfChange {
	Euro20("20 Euro", 2000, "Banknote"), Euro10("10 Euro", 1000, "Banknote"), Euro5("5 Euro", 500, "Banknote"), Euro2("2 Euro", 200, "M�nze"), Euro1("1 Euro", 100, "M�nze"), Cent50("50 Cent", 50, "M�nze"), Cent20("20 Cent", 20, "M�nze"), Cent10("10 Cent", 10, "M�nze"), Cent5("5 Cent", 5, "M�nze"), Cent2("2 Cent", 2, "M�nze"), Cent1("1 Cent", 1, "M�nze");

	private String mName;
	private double val;
	private String mType;
	

	TypeOfChange(String mName, double val, String mType) {
		this.mName = mName;
		this.val = val;
		this.mType = mType;
		
	}

	public String getmName() {
		return mName;
	}
	
	public double getValue() {
		return val;
	}
	
	public String getType() {
		return mType;
	}
	

}
