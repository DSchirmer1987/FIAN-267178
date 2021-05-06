package lösungen.fahrzeuge;

public class MotorVehicle {
	private double width;
	private double height;
	private double length;
	private double weight;
	private String carBrand;
	private String customer;
	private Adresse fromAdresse;
	private Adresse toAdresse;
	private boolean customerPickup;

	public MotorVehicle() {
	}

	public MotorVehicle(double width, double height, double length, int weight, String carBrand, String customer,
			Adresse fromAdresse, Adresse toAdresse) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.carBrand = carBrand;
		this.customer = customer;
		this.fromAdresse = fromAdresse;
		this.toAdresse = toAdresse;
		if (toAdresse != null) {
			this.customerPickup = false;
		} else {
			this.customerPickup = true;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Adresse getFromAdresse() {
		return fromAdresse;
	}

	public void setFromAdresse(Adresse fromAdresse) {
		this.fromAdresse = fromAdresse;
	}

	public Adresse getToAdresse() {
		return toAdresse;
	}

	public void setToAdresse(Adresse toAdresse) {
		this.toAdresse = toAdresse;
	}

	public boolean isCustomerPickup() {
		return customerPickup;
	}

	public void setCustomerPickup(boolean customerPickup) {
		this.customerPickup = customerPickup;
	}

	@Override
	public String toString() {
		return "MotorVehicle [width=" + width + ", height=" + height + ", length=" + length + ", weight=" + weight
				+ ", carBrand=" + carBrand + ", customer=" + customer + ", fromAdresse=" + fromAdresse + ", toAdresse="
				+ toAdresse + ", customerPickup=" + customerPickup + "]";
	}

	public void print() {
		// Falsche Reihenfolge der Werte = Könnte spätere Wartbarkeit verringern.
//		System.out.println(String.format("Größe des Fahrzeugs: %1.1f x %1.1f x %1.1f", length, width, height));
		
		// Korrekte Reihenfolge wie im Konstruktor und toString
		System.out.println(String.format("Größe des Fahrzeugs: %1.1f x %1.1f x %1.1f", width, height, length));
		
		System.out.println(String.format("Gewicht: %1.3ft", weight / 1000));
		System.out.println("Automarke: " + carBrand);
		System.out.println("Kunde: " + customer);
		if (customerPickup) {
			System.out.print("Abholadresse: ");
			this.fromAdresse.print();
			System.out.println("Selbstabholer ab Werk!");
		} else {
			System.out.print("Absenderadresse: ");
			this.fromAdresse.print();
			System.out.print("Zieladresse: ");
			this.toAdresse.print();
			System.out.println("Kein Selbstabholer!");
		}
	}

}
