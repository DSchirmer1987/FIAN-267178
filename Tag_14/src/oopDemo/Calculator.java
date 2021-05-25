package oopDemo;

import java.util.Scanner;

public class Calculator {
	int x, y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int calculateSum() {
		return this.x + this.y;
	}
	
	public String berechneSumme() {
		return "Summe:" + this.calculateSum();
	}
	
	public static void methodOne() {
		
	}
}
