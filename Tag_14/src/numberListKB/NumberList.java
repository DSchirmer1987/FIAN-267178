package numberListKB;

import java.util.Arrays;

public class NumberList {

	private double[] array;

	public NumberList() {
		array = new double[0];
	}

	
	@Override
	public String toString() {
		return "NumberList [array=" + Arrays.toString(array) + "]";
	}


	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	public void addElement(double element) {
		double[] tmpArray = new double[this.array.length + 1];
		System.arraycopy(array, 0, tmpArray, 0, array.length);
		setArray(tmpArray);
		this.array[array.length - 1] = element;
	}

	public void removeElement() {
		double[] tmpArray = new double[this.array.length - 1];
		System.arraycopy(array, 0, tmpArray, 0, array.length-1);
		setArray(tmpArray);
	}
	public void removeElement(int i) {
		double[] tmpArray = new double[this.array.length - 1];
		double[] tmpArrayFirst = new double[i];
		double[] tmpArrayLast = new double[array.length-(i-1)];
		
		
		System.arraycopy(array, 0, tmpArrayFirst, 0, (i));
		System.arraycopy(array, i+1, tmpArrayLast, 0, (array.length-(i+1)));
		System.arraycopy(tmpArrayFirst, 0, tmpArray, 0, tmpArrayFirst.length);
		System.arraycopy(tmpArrayLast, 0, tmpArray, tmpArrayFirst.length, tmpArrayLast.length-2);
		setArray(tmpArray);
	}

	public double getElement(int index) {
		return array[index];
	}

	public int getLength() {
		return this.array.length;
	}

}
