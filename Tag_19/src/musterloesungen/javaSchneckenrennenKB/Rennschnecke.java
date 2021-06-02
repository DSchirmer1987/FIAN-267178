/*
 * @Author Böhm, Kay
 * a class that creates a racing snail
 */

package musterloesungen.javaSchneckenrennenKB;

public class Rennschnecke {

	private String name, breed;
	private int speed,//way to travel per step
	track; //distance traveled
	
	
	public Rennschnecke(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
		this.speed = (int) (1+(Math.random()*5));
		this.track = 0;
	}

	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", breed=" + breed + ", speed=" + speed + ", track=" + track + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getTrack() {
		return track;
	}


	public void setTrack(int track) {
		this.track = track;
	}
	
	//forward movement for each snail
	public void krieche() {
		track+=(int) (1+(Math.random()*this.speed));
	}
}
