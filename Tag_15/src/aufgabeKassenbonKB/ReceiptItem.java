package aufgabeKassenbonKB;


public class ReceiptItem {

	private String name;
	private double price;
	private int anzahl;
	
	
	
	@Override
	public String toString() {
		
		return name + "\n" + anzahl + "x"+"\t\t\t"+price;
	}

	public ReceiptItem(String name, double price, int anzahl) {
		super();
		this.name = name;
		this.price = price;
		this.anzahl = anzahl;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
