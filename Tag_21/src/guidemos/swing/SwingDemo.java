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
		JButton btn = new JButton("Dr�ck mich!");
		// Schlie�t das gesamte Programm, wenn das Fenster geschlossen wird.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Bildschirmgr��e ermitteln
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		// Setzen der Fenstergr��e
		frame.setSize(300, 300);
		frame.setResizable(false);
		// Setzen der fensterlocation mit der Bildschirmgr��e
//		frame.setLocation(dim.width/2-frame.getSize().width/2, 250);
		
		// Dem Button eine funktion geben.
		/*
		 * Version 1 - Mit anonymer innerer Klasse
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("Button wurde gedr�ckt!");
			}
		});
		*/
		/*
		 * Version 2 - Short (Lambda)
		 */
		btn.addActionListener(e -> lbl.setText("Gedr�ckt"));
		
		
		// Setzen des Fensters in die Mitte
		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);
		
		
		panel.add(btn);
		panel.add(lbl);
		frame.setVisible(true);

	}

}
