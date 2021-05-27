package creature;

public class Zoo {

	public static void main(String[] args) {
		Creature creature1 = new Creature(CreatureType.HEADY);
		Creature creature2 = new Creature(CreatureType.HEADY);
		Creature creature3 = new Creature(CreatureType.FOOTY);
		Creature creature4 = new Creature(CreatureType.TRUNKY);
		
		Stable stable = new Stable(4);
		
		stable.addCreature(creature1);
		stable.addCreature(creature3);
		System.out.println(stable);
		System.out.println("-------------------------");
		
		stable.feedCreatures(1);
		System.out.println(stable.printStable());
		System.out.println("-------------------------");
		
		stable.addCreature(creature2);
		stable.addCreature(creature4);
		System.out.println(stable.printStable());
		System.out.println("-------------------------");
		
		stable.feedCreatures(2);
		System.out.println(stable.printStable());
		System.out.println("-------------------------");
		
		stable.feedCreatures(3);
		System.out.println(stable.printStable());

	}

}
