package methodsGK;

public class Main {

	public static void main(String[] args) {


		// exercise 1
		int numOfElements = IO.Exercise1Input();
		int[] searchArray = IO.readInArray(numOfElements);
		int Min = FillNAnalyse.findMin(searchArray);
		int Max = FillNAnalyse.findMax(searchArray);

		IO.OutputMinMax(Min, Max);	


		// exercise 2
		// depends on comments / other exercises, if /*int*/ or int is used
		/*int*/ numOfElements = IO.Exercise2Input();
		int[] theArray = new int[numOfElements];
		FillNAnalyse.fillArrayWithRandomNumbers(theArray);
		IO.printArray(theArray);
		int sum = FillNAnalyse.sum(theArray);
		double avg = FillNAnalyse.avg(theArray);
		
		IO.OutputSumAvg(sum, avg, theArray);

	}

}
