package arrayGK;

public class Main {

	public static void main(String[] args) {
		
		// exercise 1
		int[]arrayN = ArrayE1T5.ErzeugeArray();
		System.out.println("\nprintArray...");
		ArrayE1T5.printArray(arrayN);
		
		// exercise 2
		int s = 3;
		int r = ArrayE1T5.searchArray(arrayN, s);
		System.out.println("\nsearchArray... - Suchwert: " + s);
		System.out.println("an Index: " + r);
		
		// exercise 3
		int s1 = 2;
		int s2 = 5;
		String[] tmp = new String[] {""," - R�cktausch"};
		for(int i = 0; i < 2; i++) {
			ArrayE1T5.swap(arrayN, s1, s2);
			System.out.println("\nswap..." + tmp[i] + " - Indizes: " + s1 + ", " + s2);
			ArrayE1T5.printArray(arrayN);
		}
		
		// exercise 4	
		ArrayE1T5.reverseArray(arrayN);
		System.out.println("\nreverseArray...");
		ArrayE1T5.printArray(arrayN);
		
		// exercise 5	
		ArrayE1T5.cloneArray(arrayN);
		System.out.println("\ncloneArray...");
		ArrayE1T5.printArray(arrayN);
	}

}

