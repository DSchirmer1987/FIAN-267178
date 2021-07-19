package kaffeeAutomaten.model;

import kaffeeAutomaten.controller.Pausenraum;
import kaffeeAutomaten.view.Ausgaben;

public class Mitarbeiter implements Runnable {

	private String name;
	private Pausenraum pr;
	private boolean hatBockAufKaffee;

	public Mitarbeiter(String name, Pausenraum pr) {
		super();
		this.name = name;
		this.pr = pr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pausenraum getPr() {
		return pr;
	}

	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}

	public boolean isHatBockAufKaffee() {
		return hatBockAufKaffee;
	}

	public void setHatBockAufKaffee(boolean hatBockAufKaffee) {
		this.hatBockAufKaffee = hatBockAufKaffee;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(warteZeit());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pr.getMf().getSp().getMaText().getMAText().setText(Ausgaben.mitarbeiterHatBockAufKaffee(this));
			Ausgaben.mitarbeiterHatBockAufKaffee(this);
			hatBockAufKaffee = true;
			while (hatBockAufKaffee) {
				inner : for (int i = 0; i < pr.getAutomaten().length; i++) {
					if (pr.getAutomaten()[i].isBereit()) {
						pr.getAutomaten()[i].machKaffee(kaffeeTasse(), this);
						hatBockAufKaffee = false;
						break inner;
					}else {
						Ausgaben.maschineBesetzt(pr.getAutomaten()[i]);
					}
				}
			}
		}
	}

	private int warteZeit() {
		return (((int) (10 + (Math.random() * 21)) * 1000));
	}

	private Tassen kaffeeTasse() {
		int tmp = ((int) (Math.random()*3));
		Tassen tasse;
		switch (tmp) {
		case 0:
			tasse = Tassen.KLEIN;

			break;
		case 1:
			tasse = Tassen.MITTEL;

			break;
		case 2:
			tasse = Tassen.GROSS;

			break;

		default:
			tasse = Tassen.MITTEL;
			break;
		}
		return tasse;
	}

}
