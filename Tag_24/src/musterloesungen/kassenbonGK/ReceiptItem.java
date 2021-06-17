package musterloesungen.kassenbonGK;

import java.util.ArrayList;

public class ReceiptItem {
	private int productNumber;
	private String productName;
	private double productPrice;

	

	public ReceiptItem(int productNumber, String productName, double productPrice) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;

//		System.out.println(productNumber + " " + productName + " " + productPrice);
		//Main.basket.add(ReceiptItem(productNumber, productName, productPrice));
		//System.out.println(basket);
	}



	public int getProductNumber() {
		return productNumber;
	}



	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
