package oopDemo;

import creature.*;
public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator(5,5);
		VarArgsDemo varg = new VarArgsDemo();
		
		varg.verketten(5, 5);
		PrintHelper.printLine();
		varg.methodVarArgs("Hallo");
		PrintHelper.printLine();
		varg.methodVarArgs("Hallo", "Welt", "Hallo");
		
		
		int sum = calc.calculateSum();
		
		PrintHelper.printLine();
		System.out.println("Summe = " + sum);
		PrintHelper.printLine();
		String zahl = String.format("Zahl %d", calc.x);
		System.out.printf("Zahl %d + Zahl %d = %d", calc.x, calc.y, sum);

		
//		// Wie wird die summe Berechnet
//		int sum = calc.x + calc.y;
//		
//		// Objekt berechnet die Summe. Also das wie
//		int sum2 = calc.calculateSum();
//		
//		System.out.println("Summe:" + sum);
//		System.out.println("Summe:" + sum2);
		
//		calc.berechneSumme();
		
//		PrintHelper.printLine();
//		PrintHelper.printEmptyLine();
//		PrintHelper.printLine();
//		
//		PrintHelper.printLine();
//		PrintHelper.printEmptyCell();
//		PrintHelper.printLine();

	}

}
