package musterloesungen.javaSchneckenrennenKB;

import java.util.ArrayList;

public class Wettbuero {

	// Type Wetten is constructed by inner class Wetten
	private ArrayList<Wette> bets;
	private Rennen race;

	public Wettbuero(Rennen race) {
		super();
		bets = new ArrayList<>();
		this.race = race;
	}

	

	@Override
	public String toString() {
		return "Wettbuero [bets=" + bets + ", race=" + race + "]";
	}



	public ArrayList<Wette> getBets() {
		return bets;
	}

	public void setBets(ArrayList<Wette> bets) {
		this.bets = bets;
	}

	public Rennen getRace() {
		return race;
	}

	public void setRace(Rennen race) {
		this.race = race;
	}

	//creates a bet and adds it to the bets list
	public void wetteAnnehmen(String name, Rennschnecke snail, double einsatz) {
		Wette wette = new Wette(name, race, snail, einsatz);
		bets.add(wette);
	}
	
	public void rennenDurchfuehren() {
		ermittleWettGewinner(race.durchfuehren());
		
	}
	
	public void ermittleWettGewinner(Rennschnecke winner) {
		for (Wette wette : bets) {
			if(winner.equals(wette.getSnail())) {
				System.out.println(String.format(wette.getName()+" gewinnt %.2f Euro",wette.getEinsatz()*wette.getQuote()));
				System.out.println(String.format("Der Einsatz betrug %.2f Euro und die Quote lag bei %.2f", wette.getEinsatz(), wette.getQuote()));
			}
		}
	}
	
	//inner class to create bets
	class Wette {
		private String name;
		private Rennschnecke snail;
		private Rennen race;
		private double einsatz;
		private double quote;

		public Wette(String name, Rennen race, Rennschnecke snail, double einsatz) {
			super();
			this.name = name;
			this.race=race;
			this.snail = snail;
			this.einsatz = einsatz;
			ermittleQuote(race, snail);

		}

		@Override
		public String toString() {
			return "Wette [name=" + name + ", snail=" + snail + ", race=" + race + ", einsatz=" + einsatz
					+ ", quote=" + quote + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Rennschnecke getSnail() {
			return snail;
		}

		public void setSnail(Rennschnecke snail) {
			this.snail = snail;
		}

		public double getEinsatz() {
			return einsatz;
		}

		public void setEinsatz(double einsatz) {
			this.einsatz = einsatz;
		}

		public double getQuote() {
			return quote;
		}

		public void setQuote(double quote) {
			this.quote = quote;
		}

		public Rennen getRace() {
			return race;
		}

		public void setRace(Rennen race) {
			this.race = race;
		}
		
		//method to find the fastest snail and compares it to the snail that is bet on
		//in relation to the speed of the fastest snail quote will be set
		public void ermittleQuote(Rennen race, Rennschnecke snail) {
			Rennschnecke favorite = race.getSnails().get(0);
			// checks for the fastest snail in the race and makes it favorite
			for (int i = 0; i < race.getSnails().size(); i++) {
				if (race.getSnails().get(i).getSpeed() > favorite.getSpeed()) {
					favorite = race.getSnails().get(i);
				}
			}
			int speedDifference = favorite.getSpeed()-snail.getSpeed();
			switch(speedDifference) {
			case 0: this.quote=1.2; break;
			case 1: this.quote=1.4; break;
			case 2: this.quote=2.8; break;
			case 3: this.quote=3.5; break;
			case 4: this.quote=8.5; break;
			}
		}

	}
}
