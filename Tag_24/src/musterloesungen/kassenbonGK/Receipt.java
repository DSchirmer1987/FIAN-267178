package musterloesungen.kassenbonGK;

public class Receipt {

	public static String ReceiptHeader() {
		String nbsp5 = "&nbsp&nbsp&nbsp&nbsp&nbsp";
		String nbsp7 = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
		String nbsp12 = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
		String receiptHeader = "<html><body>";
		receiptHeader = receiptHeader + "╔════════════════════════╗" + "<br>";
		receiptHeader = receiptHeader + "║ " + nbsp7 + " FreitagsShop 042 " + nbsp7 + " ║" + "<br>";
		receiptHeader = receiptHeader + "║ " + nbsp12 + " Marchstr. 23 " + nbsp12 + "║" + "<br>";
		receiptHeader = receiptHeader + "║ " + nbsp12 + " 10587 Berlin" + nbsp12 + "&thinsp&thinsp║" + "<br>";
		receiptHeader = receiptHeader + "║ " + nbsp5 + " Tel.: 030 314 213 86 " + nbsp5 + "&thinsp║" + "<br>";
		receiptHeader = receiptHeader + "╚════════════════════════╝" + "<br>";
		//receiptHeader = receiptHeader + Main.endHTML;
		return receiptHeader;
	
	}
	public static String ReceiptSalesman(String vk) {
		String receiptSalesman = vk;
		return receiptSalesman;
	}

	public static String ReceiptPosition() {
		String receiptPosition = "";
		for(int i = 0; i < Main.basket.size();i++) {
		receiptPosition = receiptPosition + 
						Main.basket.get(i).getProductName() + "<br>" + 
						Main.basket.get(i).getProductNumber() + "x &#9 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp " +
						Main.basket.get(i).getProductPrice() + "<br>";
		}
		return receiptPosition;
	}
	
	public static String ReceiptSum() {
		String receiptSum = "";
		receiptSum = " &#9 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp=====<br>";
		receiptSum = receiptSum + " &#9 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp " + Calc.ReceiptCalc() + " <br>";
		receiptSum = receiptSum + " &#9 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp=====<br>";
	return receiptSum;	
	}

}