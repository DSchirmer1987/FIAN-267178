package kaffeeAutomaten.model;

import java.awt.Color;

import kaffeeAutomaten.controller.Pausenraum;
import kaffeeAutomaten.view.Ausgaben;

public class KaffeeAutomat extends Thread {

	private final int TANKGROESSE = 5000;
	private int fuellstand;
	private boolean isBereit;
	private Pausenraum pr;
	private int verbrauch;
	private int tassenVerbrauch;

	
	public KaffeeAutomat(String name, Pausenraum pr) {
		super(name);
		this.pr = pr;
		this.fuellstand = TANKGROESSE;
		this.isBereit= true;
		

	}
	
	public int getTassenVerbrauch() {
		return tassenVerbrauch;
	}

	public void setTassenVerbrauch(int tassenVerbrauch) {
		this.tassenVerbrauch = tassenVerbrauch;
	}

	public int getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(int fuellstand) {
		this.fuellstand = fuellstand;
	}

	public boolean isBereit() {
		return isBereit;
	}

	public void setBereit(boolean isBereit) {
		this.isBereit = isBereit;
	}

	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	public int getTANKGROESSE() {
		return TANKGROESSE;
	}

	public int getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(int verbrauch) {
		this.verbrauch = verbrauch;
	}

	@Override
	public void run() {
		while (true) {

		}
	}

	public void machKaffee(Tassen tasse, Mitarbeiter ma) {
		this.isBereit = false;
		if (tasse.getMl() > fuellstand) {
			tankAuffüllen();
		}
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].setBackground(Color.YELLOW);
		fuellstand -= tasse.getMl();
		verbrauch+=tasse.getMl();
		tassenVerbrauch++;
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].getText().setText(Ausgaben.bereiteKaffeeZu(this, tasse, ma));
		
		try {
			Thread.sleep(tasse.getMl() * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.isBereit = true;
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].setBackground(Color.GREEN);
	}

	
	private void tankAuffüllen() {
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].setBackground(Color.RED);
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].getText().setText(Ausgaben.fuelleWasserAuf());
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fuellstand = TANKGROESSE;
	}
	
	public void unterbrechen() {
		this.isBereit = false;
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].setBackground(Color.RED);
		pr.getMf().getMainPanel().getTxtFelder()[Integer.parseInt(this.getName())].getText().setText(Ausgaben.maschineUnterbrochen(this));
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.isBereit = true;
	}
	
	

}
