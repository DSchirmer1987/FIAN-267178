package musterloesungen.kleineHexeGK;

public enum LittleWitch {
SechsZEins("Morgens früh um 6"), SechsZZwei("kommt die kleine Hex."), SiebenZEins("Morgens früh um 7"), SiebenZZwei("schabt sie gelbe Rüben."),
AchtZEins("Morgens früh um 8"), AchtZZwei("wird Kaffee gemacht."), NeunZEins("Morgens früh um 9"), NeunZZwei("geht sie in die Scheun'."),
ZehnZEins("Morgens früh um 10"), ZehnZZwei("hackt sie Holz und Spän'."), ElfZEins("Feuert an um 11,"), ElfZZwei("kocht dann bis um 12:"),
ZwoelfZEins("Fröschebein und Krebs und Fisch."), ZwoelfZZwei("Hurtig Kinder kommt zu Tisch!");
	private final String poemLine;
	LittleWitch(String poemLine){
		this.poemLine = poemLine;
	}
	public String getPoemLine() {
		return poemLine;
	}
}
