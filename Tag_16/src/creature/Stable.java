package creature;

public class Stable {
	private Creature creature = null;

	private Stable next;

	public Stable(int apartments) {
		if (apartments > 1) {
			next = new Stable(apartments - 1);
		}
	}

	public Stable getNext() {
		return next;
	}

	public void setNext(Stable next) {
		this.next = next;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public String printStable() {
		String tmp = "";
		if (this.creature != null) {
			tmp += this.creature.printCreature();
		} else {
			tmp += PrintHelper.printLine();
			tmp += PrintHelper.printEmptyCell();
			tmp += PrintHelper.printLine();
		}
		if (next != null) {
			tmp += next.printStable();
		}
		return tmp;
	}
	
	@Override
	public String toString() {
		return this.printStable();
	}

	public void printStable(Creature creature) {
		creature.printCreature();
	}

	public void addCreature(Creature creature) {

		if (this.creature == null) {
			this.creature = creature;
		} else if (next != null) {
			next.addCreature(creature);
		} else {
			System.out.println("The stalbe is full, no room for new creature!"
					+ creature.getType());
		}

	}

	public void feedCreatures(int buckets) {
		int restFood = buckets;

		if (this.creature != null && restFood > 0) {
			if (creature.feedCreature()) {
				restFood -= 1;
			}
		} else {
			System.out.println("No food or no creatures to feed");
		}

		boolean nextCreature = next != null && next.getCreature() != null;
		boolean isFood = restFood > 0;

		if (!isFood && !nextCreature) {
			System.out.println("All creatures are feed, no food left!");
		} else if (isFood && !nextCreature) {
			System.out.println("All creatures are feed, there is food left!");
		} else if (!isFood && nextCreature) {
			System.out.println("Not enough food, some creatures are hungry!");
		} else {
			next.feedCreatures(restFood);
		}

	}
}
