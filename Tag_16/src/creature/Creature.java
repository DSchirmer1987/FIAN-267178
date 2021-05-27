package creature;

public class Creature {
	private CreatureType type;
	private boolean hungry = true;

	public Creature(CreatureType type) {
		this.type = type;
	}

	public CreatureType getType() {
		return type;
	}

	public void setType(CreatureType type) {
		this.type = type;
	}

	public boolean isHungry() {
		return this.hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public boolean feedCreature() {
		boolean feeded = false;
		if (hungry) {
			hungry = !hungry;
			feeded = true;
		}
		return feeded;
	}

	public void printCreature() {
		PrintHelper.printLine();
		switch (this.getType()) {
			case HEADY:
				printHeady();
				break;
			case FOOTY:
				printFooty();
				break;
			case TRUNKY:
				printTrunky();
		}
		PrintHelper.printLine();
	}

	private void printHeady() {
		if (hungry) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/           |");
		} else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /         |");
			System.out.println("|          \\______/          |");
		}
	}

	private void printFooty() {
		if (hungry) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		} else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}

	private void printTrunky() {
		if (hungry) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		} else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( °-°                  \\  |");
			System.out.println("|   \\                     /  |");
			System.out.println("|    \\___________________/   |");
		}
	}

}
