package musterloesungen.kleineHexeGK;

public enum LittleWitch {
SechsZEins("Morgens fr�h um 6"), SechsZZwei("kommt die kleine Hex."), SiebenZEins("Morgens fr�h um 7"), SiebenZZwei("schabt sie gelbe R�ben."),
AchtZEins("Morgens fr�h um 8"), AchtZZwei("wird Kaffee gemacht."), NeunZEins("Morgens fr�h um 9"), NeunZZwei("geht sie in die Scheun'."),
ZehnZEins("Morgens fr�h um 10"), ZehnZZwei("hackt sie Holz und Sp�n'."), ElfZEins("Feuert an um 11,"), ElfZZwei("kocht dann bis um 12:"),
ZwoelfZEins("Fr�schebein und Krebs und Fisch."), ZwoelfZZwei("Hurtig Kinder kommt zu Tisch!");
	private final String poemLine;
	LittleWitch(String poemLine){
		this.poemLine = poemLine;
	}
	public String getPoemLine() {
		return poemLine;
	}
}
