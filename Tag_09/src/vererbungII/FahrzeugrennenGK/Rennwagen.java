package vererbungII.FahrzeugrennenGK;

public class Rennwagen extends Auto {

	public Rennwagen() {
		this(0.0, 0.0, 220.0, 4);
	}

	public Rennwagen(double currentPositionKm, double currentSpeedKph, double maxSpeedKph, int numberWheels) {
		super(currentPositionKm, currentSpeedKph, maxSpeedKph, numberWheels);
	}

	@Override
	public String toString() {
		return "Rennwagen [getCurrentPositionKm()=" + getCurrentPositionKm() + ", getCurrentSpeedKph()="
				+ getCurrentSpeedKph() + ", getMaxSpeedKph()=" + getMaxSpeedKph() + ", getNumberWheels()="
				+ getNumberWheels() + ", getVehicleType()=" + getVehicleType() + "]";
	}

}
