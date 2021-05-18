package vererbungII.FahrzeugrennenGK;

public class Auto extends Fahrzeug {

	public Auto() {
		this(0.0, 0.0, 140.0, 4);
	}

	public Auto(double currentPositionKm, double currentSpeedKph, double maxSpeedKph, int numberWheels) {
		super(currentPositionKm, currentSpeedKph, maxSpeedKph, numberWheels);
	}

	@Override
	public String toString() {
		return "Auto [getCurrentPositionKm()=" + getCurrentPositionKm() + ", getCurrentSpeedKph()="
				+ getCurrentSpeedKph() + ", getMaxSpeedKph()=" + getMaxSpeedKph() + ", getNumberWheels()="
				+ getNumberWheels() + ", getVehicleType()=" + getVehicleType() + "]";
	}



}
