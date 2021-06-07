package musterloesungen.kleineHexeGK;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public static int counter;
	public static boolean version1 = true;
	public static String p;
	public static LittleWitch[] poem = LittleWitch.values();

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(2, 2));
		JLabel lbl = new JLabel("Gedicht Kleine Hexe - Version 1", SwingConstants.CENTER);
		JButton btn = new JButton("Drück mich!");
		// Schließt das gesamte Programm, wenn das Fenster geschlossen wird.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Bildschirmgröße ermitteln
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Setzen der Fenstergröße
		frame.setSize(300, 600);
		frame.setResizable(false);
		// Setzen des Fensters in die Mitte
		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);

		panel.add(btn);
		panel.add(lbl);
		frame.setVisible(true);

		counter = 0;
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (counter < poem.length && version1) {
					p = poem[counter].getPoemLine();
					lbl.setText(p);
					counter++;
				} else if (counter == poem.length && !version1) {
					p += "Ende - x wählen für Beenden des Programms.<br>";
					lbl.setText(p + "</body></html>");
				} else if (counter < poem.length && !version1) {
					p += poem[counter].getPoemLine() + "<br>";
					lbl.setText(p + "</body></html>");
					counter++;
				} else {
					counter = 0;
					version1 = false;
					lbl.setText("Gedicht Kleine Hexe - Version 2");
					p = "<html><body>";
				}
			}

		});

	}

}
