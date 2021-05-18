package vererbungII.FahrzeugrennenGK;

public class Fahrrad extends Fahrzeug {

	public Fahrrad() {
		this(0.0, 0.0, 30.0, 2);
	}
	
	public Fahrrad(double currentPositionKm, double currentSpeedKph, double maxSpeedKph, int numberWheels) {
		super(currentPositionKm, currentSpeedKph, maxSpeedKph, numberWheels);
	}

	@Override
	public String toString() {
		return "Fahrrad [getCurrentPositionKm()=" + getCurrentPositionKm() + ", getCurrentSpeedKph()="
				+ getCurrentSpeedKph() + ", getMaxSpeedKph()=" + getMaxSpeedKph() + ", getNumberWheels()="
				+ getNumberWheels() + ", getVehicleType()=" + getVehicleType() + "]";
	}



	
	
}
