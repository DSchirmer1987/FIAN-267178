package vererbungII.aufgabeFahrzeugKB;

public class Wettrennen {

	public static void main(String[] args) {

//		Fahrrad bike = new Fahrrad(0, 20);
//		Auto car = new Auto(0, 150);
//		Rennwagen racingCar = new Rennwagen(0, 200);
//		Krankenwagen ambulance = new Krankenwagen(0, 80, true);
//
//		bike.bewegen(240);
//		bike.bewegen(60);
//		car.bewegen(60);
//		racingCar.bewegen(60);
//		ambulance.bewegen(60);
//		System.out.println(bike.getAktPositionX());
//		System.out.println(car.getAktPositionX());
//		System.out.println(racingCar.getAktPositionX());
//		System.out.println(ambulance.getAktPositionX());

		EinfacheAnimation anime = new EinfacheAnimation();
		anime.los(20, 150, 220, 80, 60, 240);
	}

}
