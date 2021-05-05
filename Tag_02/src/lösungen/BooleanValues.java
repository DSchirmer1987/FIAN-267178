package lösungen;

public class BooleanValues {

	public static void main(String[] args) {
		boolean[] trueAndFalse = new boolean[2];
		trueAndFalse[0] = false;
		trueAndFalse[1] = true;
		
		// Verschachtelte For-Schleifen, die über das Array iterieren
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				boolean result = trueAndFalse[i] && trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " && " + trueAndFalse[j] + " liefert " + result);
				
				result = trueAndFalse[i] || trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " || " + trueAndFalse[j] + " liefert " + result);
				
				result = trueAndFalse[i] ^ trueAndFalse[j];
				System.out.println(trueAndFalse[i] + " ^ " + trueAndFalse[j] + " liefert " + result);
				
				System.out.print("\n");
			}
		}

	}

}
