package musterloesungen.kassenbonGK;

import java.util.ArrayList;

public class Main {
	
	static final String endHTML = "</body></html>";
	
	public static ArrayList<ReceiptItem>basket = new ArrayList<ReceiptItem>();
	
	public static void main(String[] args) {
		
		Receipt.ReceiptHeader();
		Product products = new Product();
		Panel.PanelField();

	}

}
