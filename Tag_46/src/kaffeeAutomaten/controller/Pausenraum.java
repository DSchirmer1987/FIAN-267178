package kaffeeAutomaten.controller;

import kaffeeAutomaten.model.KaffeeAutomat;
import kaffeeAutomaten.model.Mitarbeiter;
import kaffeeAutomaten.view.Ausgaben;
import kaffeeAutomaten.view.MainFrame;

public class Pausenraum {

	private Thread team[];
	private KaffeeAutomat automaten[] = new KaffeeAutomat[10];
	private MainFrame mf;

	public Pausenraum() {
		super();
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println(cores);
//		team = new Thread[((int) (5 + (Math.random() * 11)))];
		team = new Thread[cores];
		for (int i = 0; i < team.length; i++) {
			team[i] = new Thread(new Mitarbeiter(Integer.toString(i), this));
		}

		for (int i = 0; i < automaten.length; i++) {
			automaten[i] = new KaffeeAutomat(Integer.toString(i), this);
			
		}
		
		mf = new MainFrame(this);	
		for (int i = 0; i < automaten.length; i++) {
			mf.getMainPanel().getTxtFelder()[i].getText().setText(Ausgaben.startText(automaten[i]));			
			
		}
		
	}

	public MainFrame getMf() {
		return mf;
	}

	public void setMf(MainFrame mf) {
		this.mf = mf;
	}

	public void setTeam(Thread[] team) {
		this.team = team;
	}

	public void setAutomaten(KaffeeAutomat[] automaten) {
		this.automaten = automaten;
	}

	public Thread[] getTeam() {
		return team;
	}

	public KaffeeAutomat[] getAutomaten() {
		return automaten;
	}
	
	public void starteSimulation () {
		/*for (KaffeeAutomat kaffeeAutomat : automaten) {
			kaffeeAutomat.start();

		}*/
		for (Thread mitarbeiter : team) {
			mitarbeiter.start();

		}
	}

}
