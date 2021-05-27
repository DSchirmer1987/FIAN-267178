package kreaturenKB;

public class Creature {

	private CreatureType type;
	private boolean isHungry = true;
	
	public Creature() {
		
	}

	public Creature(CreatureType type) {
		this.type=type;
	}

	public CreatureType getType() {
		return type;
	}

	public void setType(CreatureType type) {
		this.type = type;
	}

	public boolean isHungry() {
		return isHungry;
	}
	
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	public void feedCreature() {
		setHungry(false);
	}
	
	public void printCreature() {
		
		if(this.type.equals(CreatureType.HEADY)) {
		printHeady();
		}else if (this.type.equals(CreatureType.FOOTY)) {
			printFooty();
		}else if(this.type.equals(CreatureType.TRUNKY)){
			printTrunky();
		}else {
			System.out.println("Diese Kreatur kenne ich nicht!");			
		}
		
	}
	
	/**
	 * @author Schirmer, Daniel
	 *
	 */
	private void printHeady(){
		if (isHungry) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/           |");
		}
		else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /         |");
			System.out.println("|          \\______/          |");
		}
	}
	
	/**
	 * @author Schirmer, Daniel
	 *
	 */
	private void printFooty(){
		if (isHungry) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
		else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}
	
	/**
	 * @author Schirmer, Daniel
	 *
	 */
	private void printTrunky(){
		if (isHungry) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		}
		else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( °-°                  \\  |");
			System.out.println("|   \\                     /  |");		
			System.out.println("|    \\___________________/   |");
		}
	}
	
	

}
