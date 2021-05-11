package enumsGK;

public enum TypeOfCoffee {
	KAFFEE (1), CAPUCCINO (1.20), ESPRESSO (1.13);

	
	private final double price;

	TypeOfCoffee(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	

}
