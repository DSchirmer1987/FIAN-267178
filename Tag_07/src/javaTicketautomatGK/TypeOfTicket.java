package javaTicketautomatGK;

public enum TypeOfTicket {
	K(1.40), A(2.30), B(4.70), C(9.60), D(11.40);

	
	private final double price;

	TypeOfTicket(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	

}
