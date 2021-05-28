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
		for(int i = 0; i < theArray.length;i++) {
			theArray[i] = (int) (Math.random()*10000);
		}
	}
	
	// exercise 2
	public static int sum(int[] theArray) {
		int sum = 0;
		for(int i = 0; i < theArray.length;i++) {
			sum += theArray[i];
		}
		return sum;
	}
	// exercise 2
	public static double avg(int[] theArray) {
		double avg = (double)sum(theArray)/theArray.length;
		return avg;
	}
	
	// exercise 3
	public static void rndFromTo() {
		
	/*
	java.util.Random random = new java.util.Random();

	// not "any" due to tests
	int limit = 20;

	int rnd = random.nextInt(limit) + 1;

	int[] array = new int[rnd];

	System.out.println(rnd);
	*/
	}
}
