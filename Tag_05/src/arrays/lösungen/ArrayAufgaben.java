package arrays.lösungen;

import java.util.Arrays;

public class ArrayAufgaben {

	public static void main(String[] args) {
		int[] ascend = new int[10];
		int sum;
		double avg;
		fillAscend(ascend);
		System.out.println(Arrays.toString(ascend));
		fillDescend(ascend);
		System.out.println(Arrays.toString(ascend));
		sum = sumOfArray(ascend);
		avg = (double) sum / ascend.length;
		System.out.println("Summe von Array:" + sum);
		System.out.println("Mittelwert: " + avg);
		minAndMaxOfArray(ascend);
	}
	
	public static void fillAscend(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
		}
	}
	
	public static void fillDescend(int[] intArray) {
		for (int i = intArray.length - 1; i >= 0; i--) {
			intArray[i] = intArray.length - i;
		}	
	}
	
	public static int sumOfArray(int[] intArray) {
		int sum = 0;
		for (int i : intArray) {
			sum += i;
		}
		return sum;
	}
	
	public static void minAndMaxOfArray(int[] intArray) {
		int min = intArray[0];
		int max = intArray[0];
		for (int i = 1; i < intArray.length; i++) {
			if(min > intArray[i]) {
				min = intArray[i];
			}
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("Min: " + min + " - Max: " + max);
	}
}
