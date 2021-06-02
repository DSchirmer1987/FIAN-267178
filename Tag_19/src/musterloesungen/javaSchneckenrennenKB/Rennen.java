/*
 * @Author Böhm, Kay
 * a class that creates a race and runs it
 *  */

package musterloesungen.javaSchneckenrennenKB;

import java.util.ArrayList;

public class Rennen {

	private String name;
	private int raceLenght, numberOfSnails;
	private ArrayList<Rennschnecke> snails;

	public Rennen(String name, int numberOfSnails, int raceLenght) {
		super();
		this.name = name;
		this.numberOfSnails = numberOfSnails;
		this.setRaceLenght(raceLenght);
		snails = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Rennen [name=" + name + ", raceLenght=" + raceLenght + ", numberOfSnails=" + numberOfSnails
				+ ", snails=" + snails + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSnails() {
		return numberOfSnails;
	}

	public void setNumberOfSnails(int numberOfSnails) {
		this.numberOfSnails = numberOfSnails;
	}

	public ArrayList<Rennschnecke> getSnails() {
		return snails;
	}

	public void setSnails(ArrayList<Rennschnecke> snails) {
		this.snails = snails;
	}

	public int getRaceLenght() {
		return raceLenght;
	}

	public void setRaceLenght(int raceLenght) {
		this.raceLenght = raceLenght;
	}

	// add a snail to the race
	public void addRennschnecke(Rennschnecke snail) {
		if (snails.size() < numberOfSnails) {
			snails.add(snail);
		} else
			Outputs.rennenVoll();
	}

	public void removeRennschnecke(String name) {
		if (snails.size() > 0) {
			snails.removeIf(snail -> snail.getName().equals(name));
		}
	}

	// remove a snail from the race
	public Rennschnecke ermittleGewinner() {
		Rennschnecke winner = null;
		for (Rennschnecke rennschnecke : snails) {
			if (rennschnecke.getTrack() >= raceLenght) {
				winner = rennschnecke;
			}
		}
		return winner;
	}

	// iterates over snail List and lets every snail move once
	public void lasseSchneckenKriechen() {
		for (Rennschnecke rennschnecke : snails) {
			rennschnecke.krieche();
		}
	}

	// lets every snail move until one reaches the finish line
	public Rennschnecke durchfuehren() {
		Rennschnecke winner = null;
		while (winner == null) {
			lasseSchneckenKriechen();
			winner = ermittleGewinner();
			if (winner != null) {
				Outputs.theWinnerIs(winner);
			}
			
		}
		return winner;
	}

}
