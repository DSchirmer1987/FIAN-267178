package tag47.CafeteriaIISpecialGK.model;

public enum EMenu {
	MENUMNBSIM("JMenuBar", "", 0),
	MENUMNUSIMULATION("JMenu", "Simulation", 1),
	MENUITEMMNIRESTART("JMenuItem", "Restart", 2),
	MENUITEMMNIPAUSE("JMenuItem", "Pause Simulation", 2),
	MENUITEMMNIEND("JMenuItem", "End", 2, true),
	MENUITEMMNUABOUT("JMenu", "About", 2),
	MENUITEMMNIAUTHOR("JMenuItem", "Author", 3),
	MENUITEMMNISIZEOFCUP("JMenuItem", "Size Of Cup", 3),
	MENUITEMMNINOOFCOFFEEDISPENSERS("JMenuItem", "Number Of Coffeedispensers", 3),
	MENUITEMMNIHISTORY("JMenuItem", "History", 3);

	private String typeOfMenu, text;
	private int level;
	private boolean separatorBelow;

	EMenu(String typeOfMenu, String text, int level) {
		this.typeOfMenu = typeOfMenu;
		this.text = text;
		this.level = level;
	}

	EMenu(String typeOfMenu, String text, int level, boolean separatorBelow) {
		this.typeOfMenu = typeOfMenu;
		this.text = text;
		this.level = level;
		this.separatorBelow = separatorBelow;
	}

	public String getTypeOfMenu() {
		return typeOfMenu;
	}

	public void setTypeOfMenu(String typeOfMenu) {
		this.typeOfMenu = typeOfMenu;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isSeparatorBelow() {
		return separatorBelow;
	}

	public void setSeparatorBelow(boolean separatorBelow) {
		this.separatorBelow = separatorBelow;
	}
}
