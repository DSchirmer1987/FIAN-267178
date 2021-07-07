package beispiele;

public abstract class AAuto {
		public abstract void fahren();
		public abstract void gehen();
		public String modellAuslesen(){
			System.out.println("Modell");
			return "Modell";
		}
		public abstract String print();
		
		
		/**
		 * Welche Methoden (Zeilen) müsste eine erbende nicht-abstrakte Klasse implementieren?
		 * 
		 * 
		 * Antwort(en):
		 * 4
		 * 5
		 * 10
		 */
}
