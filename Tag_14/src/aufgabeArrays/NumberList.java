package aufgabeArrays;

import java.util.Arrays;

/**
 * A List that takes numbers.
 * @author Schirmer, Daniel
 *
 */
public class NumberList{
	private Number[] numbers;
	
	/**
	 * The constructor to initialize a NumberList
	 */
	public NumberList() {
		this.numbers = new Number[0];
	}
	
	/**
	 * Adds a number at the end of the List
	 * @param number The number to be added
	 */
	public void add(Number number) {
		if(this.numbers.length > 0) {
			Number[] temp = this.numbers;
			this.numbers = new Number[temp.length + 1];
			for (int i = 0; i < temp.length; i++) {
				this.numbers[i] = temp[i];
			}
			this.numbers[temp.length] = number;
		} else {
			this.numbers = new Number[] {number};
		}
	}
	
	/**
	 * Adds a number at the given index
	 * @param number The number to be added
	 * @param index The index at which should be added
	 */
	public void add(Number number, int index) {
		Number[] temp = this.numbers;
		this.numbers = new Number[temp.length + 1];
		for (int i = 0; i <= index; i++) {
			if(i == index) {
				this.numbers[i] = number;
			} else {
				this.numbers[i] = temp[i];
			}
		}
		if(index < temp.length) {
			for (int i = index; i < temp.length; i++) {
				this.numbers[i+1] = temp[i];
			}
		}
	}
	
	/**
	 * Removes the last entry in the list
	 */
	public void removeLast() {
		Number[] temp = this.numbers;
		temp[temp.length-1] = null;
		this.numbers = new Number[temp.length-1];
		for (int i = 0; i < temp.length -1 ; i++) {
			this.numbers[i] = temp[i];
		}
	}
	
	/**
	 * Removes the first entry in the list
	 */
	public void removeFirst() {
		Number[] temp = this.numbers;
		temp[0] = null;
		this.numbers = new Number[temp.length-1];
		for (int i = 1; i < temp.length; i++) {
			this.numbers[i-1] = temp[i];
		}
	}
	
	/**
	 * Removes the entry at the given Index
	 * @param index The index at which should be removed
	 */
	public void removeAt(int index) {
		Number[] temp = this.numbers;
		temp[index] = null;
		this.numbers = new Number[temp.length-1];
		for (int i = 0; i < index; i++) {
			this.numbers[i] = temp[i];
		}
		if(index < temp.length) {
			for (int i = index; i < numbers.length; i++) {
				this.numbers[i] = temp[i+1];
			}
		}
	}
	
	/**
	 * Returns the number at the given index
	 * @param index The index at which should be returned
	 * @return The number on the index-position
	 */
	public Number get(int index) {
		return this.numbers[index];
	}
	
	/**
	 * Returns the length of the List
	 * @return
	 */
	public int length() {
		return this.numbers.length;
	}
	
	/**
	 * Gives a String representation of the list
	 */
	public String toString() {
		return Arrays.toString(numbers);
	}
}
