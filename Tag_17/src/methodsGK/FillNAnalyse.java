package methodsGK;

public class FillNAnalyse {

	// exercise 1
	public static int findMin(int[] searchArray) {
		int Min = searchArray[0];
		for (int i = 1; i < searchArray.length; i++) {
			if (searchArray[i] < Min) {
				Min = searchArray[i];
			}
		}
		return Min;
	}

	// exercise 1
	public static int findMax(int[] searchArray) {
		int Max = searchArray[0];
		for (int i = 1; i < searchArray.length; i++) {
			if (searchArray[i] > Max) {
				Max = searchArray[i];
			}
		}
		return Max;
	}

	// exercise 2
	public static void fillArrayWithRandomNumbers(int[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = (int) (Math.random() * 10000);
		}
	}

	// exercise 2
	public static int sum(int[] theArray) {
		int sum = 0;
		for (int i = 0; i < theArray.length; i++) {
			sum += theArray[i];
		}
		return sum;
	}

	// exercise 2
	public static double avg(int[] theArray) {
		double avg = (double) sum(theArray) / theArray.length;
		return avg;
	}

	// exercise 3
	public static void fillArrayWithRandomNumbers(int[] theArray, int numOfElements, int min, int max) {

		java.util.Random random = new java.util.Random();

		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = random.nextInt(max + 1 - min) + min;
		}

	}

	public static int[] getFrequencyArray(int[] theArray) {
		int min = findMin(theArray);
		int max = findMax(theArray);
		
		// + 2 to get min at frequencyArray[0]
		int arrayLength = max + 2 - min;
		int[] frequencyArray = new int[arrayLength];

		// min at frequencyArray[0] - look at print-method
		frequencyArray[0] = min;
		
		for (int j = 1; j < frequencyArray.length; j++) {
			frequencyArray[j] = 0;
			
			for (int i = 0; i < theArray.length; i++) {
				if (theArray[i] == min) {
					frequencyArray[j]++;
				
				}
			}
			min++;
		}
		return frequencyArray;
	}
}
