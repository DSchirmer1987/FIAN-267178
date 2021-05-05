package lösungen;

public class LittleWitchKB {

	public static void main(String[] args) {
		int clock=6;
		
		for(; clock<=12; clock++) {
			if(clock <= 10)
			System.out.println("Morgens früh um "+clock);
			
			switch (clock) {
			case 6: System.out.println("kommt die kleine Hex."); break;
			case 7: System.out.println("schabt sie gelbe Rüben."); break; 
			case 8: System.out.println("wird Kaffee gemacht."); break;
			case 9: System.out.println("geht sie in die Scheun'."); break;
			case 10: System.out.println("hackt sie Holz und Spän'."); break;
			case 11: System.out.println("Feuert an um "+clock+ ", \nkocht dann bis um 12."); break;
			default: System.out.println("Fröschebein und Krebs und Fisch.\nHurtig Kinder kommt zu Tisch"); break;
				
			}
		}
	}

}
