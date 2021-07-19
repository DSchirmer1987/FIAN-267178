package kaffeeAutomaten.view;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import kaffeeAutomaten.controller.Pausenraum;


public class MainPanel extends JPanel {

	
	
	private Pausenraum pr;
	private MainFrame mf;
	private JLabel maschinenNr [];
	private KaffeeTextPanel txtFelder[];
	
	
	public MainPanel(Pausenraum pr, MainFrame mf) {
		
		this.pr=pr;
		this.mf=mf;
		init();
	}

	private void init() {
		
		
		txtFelder = new KaffeeTextPanel[5];
		for (int i = 0; i < txtFelder.length; i++) {

			txtFelder[i]= new KaffeeTextPanel(pr.getAutomaten()[i].getName(), pr);

			txtFelder[i].setBorder(BorderFactory.createEtchedBorder());
			this.add(txtFelder[i]);
			
			
		}
		
		
		
	}
	
	

	public MainFrame getMf() {
		return mf;
	}

	public void setMf(MainFrame mf) {
		this.mf = mf;
	}

	public JLabel[] getMaschinenNr() {
		return maschinenNr;
	}

	public void setMaschinenNr(JLabel[] maschinenNr) {
		this.maschinenNr = maschinenNr;
	}

	public KaffeeTextPanel[] getTxtFelder() {
		return txtFelder;
	}

	public void setTxtFelder(KaffeeTextPanel[] txtFelder) {
		this.txtFelder = txtFelder;
	}

	

	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	
	
	
}
	