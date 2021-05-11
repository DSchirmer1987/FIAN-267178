package aufgabeKaffeeautomatGK;

import java.util.Scanner;

public class OptionCall {
	
	public static int menuChoice() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
	
		return choice;
		

		}
	
}
