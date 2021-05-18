package vererbungII.aufgabeFahrzeugKB;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Legende extends JPanel {


	public static JPanel drawNorthLegende() {
		JPanel legende = new JPanel();
		JPanel bike = new JPanel();
		JLabel bikeLabel = new JLabel("Fahrrad");
		JPanel car = new JPanel();
		JLabel carLabel = new JLabel("Auto");
		JPanel racingCar = new JPanel();
		JLabel racingCarLabel = new JLabel("Rennauto");
		JPanel ambulance = new JPanel();
		JLabel ambulanceLabel = new JLabel("Krankenwagen");
		
		bike.setBackground(Color.green);
		bike.setVisible(true);
		car.setBackground(Color.magenta);
		car.setVisible(true);
		racingCar.setBackground(Color.yellow );
		racingCar.setVisible(true);
		ambulance.setBackground(Color.red);
		ambulance.setVisible(true);
		bike.add(bikeLabel);
		car.add(carLabel);
		racingCar.add(racingCarLabel);
		ambulance.add(ambulanceLabel);
		legende.add(bike);
		legende.add(car);
		legende.add(racingCar);
		legende.add(ambulance);
		return legende;
	}
	public static JPanel drawNorthLegende(double bikeSpeed, double carSpeed, double racingCarSpeed, double ambulanceSpeed) {
		JPanel legende = new JPanel();
		
		JPanel bike = new JPanel();
		JLabel bikeLabel = new JLabel("Fahrrad "+bikeSpeed+" km/h");
		
		JPanel car = new JPanel();
		JLabel carLabel = new JLabel("Auto "+carSpeed+" km/h");
		
		JPanel racingCar = new JPanel();
		JLabel racingCarLabel = new JLabel("Rennauto "+racingCarSpeed+" km/h");
		
		JPanel ambulance = new JPanel();
		JLabel ambulanceLabel = new JLabel("Krankenwagen "+ambulanceSpeed+ " km/h");
		
		bike.setBackground(Color.green);
		bike.setVisible(true);
		
		car.setBackground(Color.magenta);
		car.setVisible(true);
		
		racingCar.setBackground(Color.yellow );
		racingCar.setVisible(true);
		
		ambulance.setBackground(Color.red);
		ambulance.setVisible(true);
		
		bike.add(bikeLabel);
		car.add(carLabel);
		racingCar.add(racingCarLabel);
		ambulance.add(ambulanceLabel);
		
		legende.add(bike);
		legende.add(car);
		legende.add(racingCar);
		legende.add(ambulance);
		return legende;
	}
	
	//version in use
	public static JPanel drawEastLegende(double bikeSpeed, double carSpeed, double racingCarSpeed, double ambulanceSpeed) {
		JPanel legende = new JPanel();
		legende.setLayout(new BoxLayout(legende, BoxLayout.Y_AXIS));
		
		JPanel bike = new JPanel();
		JPanel bLabelPanel = new JPanel();
		JPanel bSpeedPanel = new JPanel();
//	//	bike.setMaximumSize(new Dimension(100,20));
//		bLabelPanel.setMaximumSize(new Dimension(100, 20));
//		bSpeedPanel.setMaximumSize(new Dimension(100,20));
		JLabel bikeLabel = new JLabel("Fahrrad");
		JLabel bikeSpeedLabel = new JLabel(bikeSpeed+" km/h");
		
		JPanel car = new JPanel();
		JPanel cLabelPanel = new JPanel();
		JPanel cSpeedPanel = new JPanel();
//	//	car.setMaximumSize(new Dimension(100,40));
//		cLabelPanel.setMaximumSize(new Dimension(100, 20));
//		cSpeedPanel.setMaximumSize(new Dimension(100,20));
		JLabel carLabel = new JLabel("Auto");
		JLabel carSpeedLabel = new JLabel(carSpeed+" km/h");
		
		JPanel racingCar = new JPanel();
		JPanel rLabelPanel = new JPanel();
		JPanel rSpeedPanel = new JPanel();
//	//	racingCar.setMaximumSize(new Dimension(100,40));
//		rLabelPanel.setMaximumSize(new Dimension(100, 20));
//		rSpeedPanel.setMaximumSize(new Dimension(100,20));
		JLabel racingCarLabel = new JLabel("Rennauto");
		JLabel racingCarSpeedLabel = new JLabel(racingCarSpeed+" km/h");
		
		JPanel ambulance = new JPanel();
		JPanel aLabelPanel = new JPanel();
		JPanel aSpeedPanel = new JPanel();
//	//	ambulance.setMaximumSize(new Dimension(100,40));
//		aLabelPanel.setMaximumSize(new Dimension(100, 20));
//		aSpeedPanel.setMaximumSize(new Dimension(100,20));
		JLabel ambulanceLabel = new JLabel("Krankenwagen");
		JLabel ambulanceSpeedLabel = new JLabel(ambulanceSpeed+" km/h");
		
		bike.setBackground(Color.green);
		bike.setVisible(true);
		bike.setLayout(new BoxLayout(bike, BoxLayout.Y_AXIS));
		
		car.setBackground(Color.magenta);
		car.setVisible(true);
		car.setLayout(new BoxLayout(car, BoxLayout.Y_AXIS));
		
		racingCar.setBackground(Color.yellow );
		racingCar.setVisible(true);
		racingCar.setLayout(new BoxLayout(racingCar, BoxLayout.Y_AXIS));
		
		ambulance.setBackground(Color.red);
		ambulance.setVisible(true);
		ambulance.setLayout(new BoxLayout(ambulance, BoxLayout.Y_AXIS));
		
		bLabelPanel.setBackground(Color.green);
		bSpeedPanel.setBackground(Color.green);
		bLabelPanel.add(bikeLabel);
		bSpeedPanel.add(bikeSpeedLabel);
		bike.add(bLabelPanel);
		bike.add(bSpeedPanel);
		
		cLabelPanel.setBackground(Color.magenta);
		cSpeedPanel.setBackground(Color.magenta);
		cLabelPanel.add(carLabel);
		cSpeedPanel.add(carSpeedLabel);
		car.add(cLabelPanel);
		car.add(cSpeedPanel);
		
		rLabelPanel.setBackground(Color.yellow);
		rSpeedPanel.setBackground(Color.yellow);
		rLabelPanel.add(racingCarLabel);
		rSpeedPanel.add(racingCarSpeedLabel);
		racingCar.add(rLabelPanel);
		racingCar.add(rSpeedPanel);
		
		aLabelPanel.setBackground(Color.red);
		aSpeedPanel.setBackground(Color.red);
		aLabelPanel.add(ambulanceLabel);
		aSpeedPanel.add(ambulanceSpeedLabel);
		ambulance.add(aLabelPanel);
		ambulance.add(aSpeedPanel);
		
		
		
		legende.add(bike);
		legende.add(car);
		legende.add(racingCar);
		legende.add(ambulance);
		return legende;
	}
	
}
	
