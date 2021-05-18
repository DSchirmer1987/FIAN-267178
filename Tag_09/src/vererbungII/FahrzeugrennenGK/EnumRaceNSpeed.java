package vererbungII.FahrzeugrennenGK;

public enum EnumRaceNSpeed {
	Fahrrad(0, 20.0, "Fahrrad"), Auto(1, 150.0, "Auto"), Rennwagen(2, 200.0, "Rennwagen"), Krankenwagen(3, 80.0, "Krankenwagen");
	
	private final int orderNumber;
	private final double raceSpeed;
	private final String vehicleType;

	EnumRaceNSpeed(int orderNumber, double raceSpeed, String vehicleType) {
		this.orderNumber = orderNumber;
		this.raceSpeed = raceSpeed;
		this.vehicleType = vehicleType;
	}
	
	public double getRaceSpeed() {
		return raceSpeed;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}


}
