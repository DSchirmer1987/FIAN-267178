package kaffeeAutomaten.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class SimPanel extends JPanel{
	
	JLabel maschinenNr [];
	JTextPane txtFelder[];
	MainPanel mp;

	public SimPanel(MainPanel mp) {
		this.mp=mp;
		init();
	}

	private void init() {
		setLayout(new GridLayout(3,5));
		maschinenNr = new JLabel[5];
		txtFelder = new JTextPane[6];
		for (int i = 0; i < maschinenNr.length; i++) {
			maschinenNr[i] = new JLabel(mp.getPr().getAutomaten()[i].getName());
			this.add(maschinenNr[i]);
		}
	}
	
}
