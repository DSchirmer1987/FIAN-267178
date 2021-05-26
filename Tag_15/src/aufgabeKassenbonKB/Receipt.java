package aufgabeKassenbonKB;

import java.util.ArrayList;

public class Receipt {

	private ArrayList<ReceiptItem> eintraege;
	private int shopID;
	private String shopName, strasse, plz, ort, telNr;

	public Receipt() {
		super();
		eintraege = new ArrayList<>();
		shopID = 042;
		shopName = "FreitagsShop";
		strasse = "Marchstr. 23";
		plz = "10587";
		telNr = "Tel.: 030 314 213 86";
	}

	public int getShopID() {
		return shopID;
	}

	public void setShopID(int shopID) {
		this.shopID = shopID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getTelNr() {
		return telNr;
	}

	public void setTelNr(String telNr) {
		this.telNr = telNr;
	}

	public void setEintraege(ArrayList<ReceiptItem> eintraege) {
		this.eintraege = eintraege;
	}

	public ArrayList<ReceiptItem> getEintraege() {
		return eintraege;
	}

	public void addEintrag(ReceiptItem item) {
		eintraege.add(item);
	}

	public double errechneSumme() {
		double sum=0;
		for (int i = 0; i < this.eintraege.size(); i++) {
			sum += (eintraege.get(i).getPrice()*eintraege.get(i).getAnzahl());
		}return sum;
	}
	
	public void schreibeKopf() {
		PrintHelper.printAdressField(this);
	}
	
	public void gibEintraegeAus() {
		for (int i = 0; i < eintraege.size(); i++) {
			System.out.println(eintraege.get(i).toString());
		}
	}
	
	public void schreibeSumme() {
		PrintHelper.printSum(errechneSumme());
	}
}
