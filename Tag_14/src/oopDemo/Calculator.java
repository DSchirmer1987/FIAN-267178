package oopDemo;

import java.util.Scanner;

public class Calculator {
	int x, y;
	
	public Calculator() {
		Scanner sc = new Scanner(System.in);
		this.x = sc.nextInt();
		this.y = sc.nextInt();
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
