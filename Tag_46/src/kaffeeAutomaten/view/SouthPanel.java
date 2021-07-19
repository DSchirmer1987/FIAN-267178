package kaffeeAutomaten.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import kaffeeAutomaten.controller.Pausenraum;

public class SouthPanel extends JPanel	{

	private Pausenraum pr;
	private MainFrame mf;
	private JButton startKnopf = new JButton("Simulation Starten");
	private MATextPanel maText;

	

	public SouthPanel(Pausenraum pr, MainFrame mf) {
		super();
		this.pr=pr;
		this.mf=mf;
		startKnopf.addActionListener(new StartKnopfListener());
		this.add(maText = new MATextPanel());
		this.add(startKnopf);
		startKnopf.setAlignmentY(JButton.CENTER_ALIGNMENT);
		startKnopf.setAlignmentX(JButton.CENTER_ALIGNMENT);
	}
	
	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	public MainFrame getMf() {
		return mf;
	}

	public void setMf(MainFrame mf) {
		this.mf = mf;
	}

	public MATextPanel getMaText() {
		return maText;
	}

	public void setMaText(MATextPanel maText) {
		this.maText = maText;
	}
	public JButton getStartKnopf() {
		return startKnopf;
	}

	public void setStartKnopf(JButton startKnopf) {
		this.startKnopf = startKnopf;
	}
	private class StartKnopfListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			pr.starteSimulation();		
			
		}
		
	}
}
