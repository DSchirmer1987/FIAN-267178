package guidemos.swing;

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

public class SwingDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(2, 2));
		JLabel lbl = new JLabel("Lies mich!", SwingConstants.CENTER);
		JButton btn = new JButton("Drück mich!");
		// Schließt das gesamte Programm, wenn das Fenster geschlossen wird.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Bildschirmgröße ermitteln
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Setzen der Fenstergröße
		frame.setSize(300, 300);
		frame.setResizable(false);
		// Setzen der fensterlocation mit der Bildschirmgröße
//		frame.setLocation(dim.width/2-frame.getSize().width/2, 250);
		
		// Dem Button eine funktion geben.
		/*
		 * Version 1 - Mit anonymer innerer Klasse
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Button wurde gedrückt!");
			}
		});
		*/
		/*
		 * Version 2 - Short (Lambda)
		 */
		btn.addActionListener(e -> lbl.setText("Gedrückt"));
		
		
		// Setzen des Fensters in die Mitte
		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);
		
		
		panel.add(btn);
		panel.add(lbl);
		frame.setVisible(true);

	}

}
