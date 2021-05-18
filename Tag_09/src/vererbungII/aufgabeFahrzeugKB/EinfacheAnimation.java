package vererbungII.aufgabeFahrzeugKB;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EinfacheAnimation {

	JButton button;
	MeinZeichenPanel zeichenPanel;
	JFrame frame;
	Fahrrad bike;
	Auto car;
	Rennwagen racingCar;
	Krankenwagen ambulance;

	public void los(int speedBike, int speedCar, int speedRacingCar, int speedAmbulance, int minutes, int vorsprung) {
		if(minutes>480) {
			minutes=480;
		}
		
		bike = new Fahrrad(speedBike);
		car = new Auto(speedCar);
		racingCar = new Rennwagen(speedRacingCar);
		ambulance = new Krankenwagen(speedAmbulance);

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Klick mich hart!");
		button.addActionListener(new ButtonListener());
		zeichenPanel = new MeinZeichenPanel();

		frame.add(zeichenPanel);
		frame.setSize(1920, 400);
		frame.setVisible(true);
		frame.setTitle("Mega Animation");
		frame.setLocationRelativeTo(null);
		frame.add(BorderLayout.SOUTH, button);
		frame.add(BorderLayout.EAST, Legende.drawEastLegende(bike.getAktGeschwindigkeit(), car.getAktGeschwindigkeit(),
				racingCar.getAktGeschwindigkeit(), ambulance.getAktGeschwindigkeit()));

		// vorsprung bike
		for (int i = 0; i < vorsprung; i++) {
			bike.setAktPositionX(bike.getAktPositionX() + (bike.getAktGeschwindigkeit() / 60));
			car.setAktPositionX(car.getAktPositionX());
			racingCar.setAktPositionX(racingCar.getAktPositionX());
			ambulance.setAktPositionX(ambulance.getAktPositionX());

			zeichenPanel.repaint();

			try {
				Thread.sleep(20);
			} catch (Exception e) {
			}
		}

		// rennen
		for (int i = 0; i < minutes; i++) {
			bike.setAktPositionX(bike.getAktPositionX() + (bike.getAktGeschwindigkeit() / 60));
			car.setAktPositionX(car.getAktPositionX() + (car.getAktGeschwindigkeit() / 60));
			racingCar.setAktPositionX(racingCar.getAktPositionX() + (racingCar.getAktGeschwindigkeit() / 60));
			ambulance.setAktPositionX(ambulance.getAktPositionX() + (ambulance.getAktGeschwindigkeit() / 60));

			zeichenPanel.repaint();

			try {
				Thread.sleep(20);
			} catch (Exception e) {
			}
		}
		System.out.println(bike.getAktPositionX());
		System.out.println(car.getAktPositionX());
		System.out.println(racingCar.getAktPositionX());
		System.out.println(ambulance.getAktPositionX());
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText("Mega!");

		}

	}

	class MeinZeichenPanel extends JPanel {

		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			g.setColor(Color.green);
			g.fillOval((int) bike.getAktPositionX(), (int) bike.getAktPositionY(), 40, 40);

			g.setColor(Color.magenta);
			g.fillOval((int) car.getAktPositionX(), (int) car.getAktPositionY(), 40, 40);

			g.setColor(Color.yellow);
			g.fillOval((int) racingCar.getAktPositionX(), (int) racingCar.getAktPositionY(), 40, 40);

			g.setColor(Color.red);
			g.fillOval((int) ambulance.getAktPositionX(), (int) ambulance.getAktPositionY(), 40, 40);

		}
	}

}
