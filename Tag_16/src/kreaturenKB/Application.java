package kreaturenKB;

public class Application {

	public static void main(String[] args) {

		Creature head = new Creature(CreatureType.HEADY);
		Creature foot = new Creature(CreatureType.FOOTY);
		Creature trunk = new Creature(CreatureType.TRUNKY);
		Creature head2 = new Creature(CreatureType.HEADY);

//		cr.printCreature();
//		cr.feedCreature();
//		cr.printCreature();

		Stable stable = new Stable(4);

		//4g
		System.out.println("4g");
		stable.addCreature(head);
		stable.addCreature(foot);
		stable.printStable();
	

		// 4h
		System.out.println("4h");
		stable.feedCreatures(1);
		stable.printStable();
	
		//4i
		System.out.println("4i");
		stable.addCreature(head2);
		stable.addCreature(trunk);
		stable.printStable();

		//4j
		System.out.println("4j");
		stable.feedCreatures(2);
		stable.printStable();
		
		//4k
		System.out.println("4k");
		stable.feedCreatures(3);
		stable.printStable();
	}

}
