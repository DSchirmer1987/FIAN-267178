package methodsGK;

public class Main {

	public static void main(String[] args) {


		// exercise 1
		/*
		int numOfElements = IO.Exercise1Input();
		int[] searchArray = IO.readInArray(numOfElements);
		int Min = FillNAnalyse.findMin(searchArray);
		int Max = FillNAnalyse.findMax(searchArray);

		IO.OutputMinMax(Min, Max);	

		*/
		// exercise 2
		// depends on comments / other exercises, if /*int*/ or int is used
		/*int*/ /*numOfElements = IO.Exercise2N3Input();
		int[] theArray = new int[numOfElements];
		FillNAnalyse.fillArrayWithRandomNumbers(theArray);
		IO.printArray(theArray);
		int sum = FillNAnalyse.sum(theArray);
		double avg = FillNAnalyse.avg(theArray);
		
		IO.OutputSumAvg(sum, avg, theArray);

		*/
		// exercise 3
		// depends on comments / other exercises, if /*int*/ or int is used
		int numOfElements = IO.Exercise2N3Input();
		// depends on comments / other exercises, if /*int []*/ or int[] is used
		int[] theArray = new int[numOfElements];
		
		int min = IO.fromInput();
		int max = IO.toInput();
		
		FillNAnalyse.fillArrayWithRandomNumbers(theArray, numOfElements, min, max);
		IO.printArray(theArray);
		
		int[] frequencyArray = FillNAnalyse.getFrequencyArray(theArray);
		IO.printFrequencyArray(frequencyArray);

	}

}
