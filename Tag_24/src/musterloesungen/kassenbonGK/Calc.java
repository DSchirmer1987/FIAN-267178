package musterloesungen.kassenbonGK;

public class Calc {
	
	public static double ReceiptCalc() {
		double receiptSum = 0;
		for(int i = 0; i < Main.basket.size();i++) {
		receiptSum += (Main.basket.get(i).getProductNumber() * Main.basket.get(i).getProductPrice());
		}
		System.out.println(receiptSum);
		return receiptSum;
	}

}
