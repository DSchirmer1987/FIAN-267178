package methodsGK;

import java.util.Scanner;

public class IO {

	private static int input;

	// exercises
	public static int ExercisesInput(int intTo) {
		do {
			System.out.println("Bitte geben Sie an, wieviel Zahlen Sie eingeben möchten (1 - " + intTo + "). ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
		} while (input < 1 || input > intTo);
		return input;
	}

	// exercise 1
	public static int Exercise1Input() {
		ExercisesInput(20);
		return input;
	}

	// exercise 1
	public static int[] readInArray(int numOfElements) {
		int[] arrayInt = new int[numOfElements];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numOfElements; i++) {
			System.out.println((i + 1) + ". Zahl: ");
			input = scanner.nextInt();
			arrayInt[i] = input;
		}

		return arrayInt;
	}

	// exercise 1
	public static void OutputMinMax(int Min, int Max) {
		System.out.println("Min: " + Min + "\tMax: " + Max);
	}

	// exercise 2 + 3
	public static int Exercise2N3Input() {
		ExercisesInput(100);
		return input;
	}

	// exercise 2 + 3
	public static void printArray(int[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			System.out.println(theArray[i]);
		}
	}

	public static void OutputSumAvg(int sum, double avg, int[] theArray) {
		System.out.println("Summe: " + FillNAnalyse.sum(theArray) + "\tDurchschnitt: " + FillNAnalyse.avg(theArray));
	}

	// exercise 3
	private static int fromToInput(String minMax) {
		System.out
				.println("Bitte geben Sie die " + minMax + "grenze des gewünschten Bereichs an (aus Ganzen Zahlen): ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		return input;
	}

	public static int fromInput() {
		fromToInput("Unter");
		return input;
	}

	public static int toInput() {
		fromToInput("Ober");
		return input;
	}

	public static void printFrequencyArray(int[] theArray) {
		int min = theArray[0];
		// min at frequencyArray[0]
		for (int i = 1; i < theArray.length; i++) {
			System.out.println(min + ": " + theArray[i]);
			min++;
		}
	}
}
