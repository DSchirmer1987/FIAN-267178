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

	public String printCreature() {
		String tmp;
		tmp = PrintHelper.printLine();
		switch (this.getType()) {
			case HEADY:
				tmp += printHeady();
				break;
			case FOOTY:
				tmp += printFooty();
				break;
			case TRUNKY:
				tmp += printTrunky();
		}
		tmp += PrintHelper.printLine();
		return tmp;
	}

	private String printHeady() {
		String tmp = "";
		if (hungry) {
			tmp += ("|           ||||||           |" + System.lineSeparator());
			tmp += ("|          |      |          |" + System.lineSeparator());
			tmp += ("|          | @  @ |          |" + System.lineSeparator());
			tmp += ("|          |      |          |" + System.lineSeparator());
			tmp += ("|          | ,--, |          |" + System.lineSeparator());
			tmp += ("|           \\____/           |" + System.lineSeparator());
		} else {
			tmp += ("|           ||||||           |" + System.lineSeparator());
			tmp += ("|          |      |          |" + System.lineSeparator());
			tmp += ("|         |  @  @  |         |" + System.lineSeparator());
			tmp += ("|         |        |         |" + System.lineSeparator());
			tmp += ("|         \\  `--´  /         |" + System.lineSeparator());
			tmp += ("|          \\______/          |" + System.lineSeparator());
		}
		return tmp;
	}

	private String printFooty() {
		String tmp = "";
		if (hungry) {
			tmp += ("|       *************        |" + System.lineSeparator());
			tmp += ("|     **    @   @    **      |" + System.lineSeparator());
			tmp += ("|   **     .-----.      **   |" + System.lineSeparator());
			tmp += ("|  *       `-----´       *   |" + System.lineSeparator());
			tmp += ("|   *********************    |" + System.lineSeparator());
			tmp += ("|    _|  _|  _|_  |_  |_     |" + System.lineSeparator());
		} else {
			tmp += ("|      ***************       |" + System.lineSeparator());
			tmp += ("|   ***     @   @     ***    |" + System.lineSeparator());
			tmp += ("|  *                     *   |" + System.lineSeparator());
			tmp += ("|  *       `-----´       *   |" + System.lineSeparator());
			tmp += ("|   *********************    |" + System.lineSeparator());
			tmp += ("|    _|  _|  _|_  |_  |_     |" + System.lineSeparator());
		}
		return tmp;
	}

	private String printTrunky() {
		String tmp = "";
		if (hungry) {
			tmp += ("|  @    @                    |" + System.lineSeparator());
			tmp += ("|   \\___/                    |" + System.lineSeparator());
			tmp += ("|   /   \\_________________   |" + System.lineSeparator());
			tmp += ("|  ( ~~~                  \\  |" + System.lineSeparator());
			tmp += ("|   \\_____________________/  |" + System.lineSeparator());
			tmp += ("|                            |" + System.lineSeparator());
		} else {
			tmp += ("|  @    @                    |" + System.lineSeparator());
			tmp += ("|   \\___/                    |" + System.lineSeparator());
			tmp += ("|   /   \\_________________   |" + System.lineSeparator());
			tmp += ("|  ( °-°                  \\  |" + System.lineSeparator());
			tmp += ("|   \\                     /  |" + System.lineSeparator());
			tmp += ("|    \\___________________/   |" + System.lineSeparator());
		}
		return tmp;
	}

}
