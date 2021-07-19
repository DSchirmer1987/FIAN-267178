package tag47.CafeteriaIISpecialGK.view;

import java.awt.Component;
import java.util.LinkedHashMap;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import tag47.CafeteriaIISpecialGK.model.IDrinkingCoffee;

public class GUIComponents implements IDrinkingCoffee {
	public GUIComponents(Component component, Icon icon, String name, String myText, boolean singleElement, int offset, int left,
			int top, int width, int height, int layer) {
		super();
		this.component = component;
		this.icon = icon;
		this.name = name;
		this.myText = myText;
		this.setSingleElement(singleElement);
		this.offset = offset;
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
		this.layer = layer;
	}
	private Component component;
	private Icon icon;
	private String name, myText;
	private boolean singleElement;
	private int offset, left, top, width, height, layer;
	private static LinkedHashMap<String, GUIComponents> gcm = new LinkedHashMap<String, GUIComponents>();

	public static void initGUIComponents() {
		setMyLinkedHashMap();
	}
	
	/**
	 * caution! keep this order of putting to respect code logic of building
	 */
	private static void setMyLinkedHashMap() {
		/**
		 * frame and "controls"
		 */
		gcm.put("layeredPane",new GUIComponents(new JLayeredPane(), null, "layeredPane", null, true,
				0, 0, 0, FRAMEWIDTH, FRAMEHEIGHT, 0));
		
		gcm.put("contentPane",new GUIComponents(new JPanel(), null, "contentPane", null, true,
				0, 0, 0, FRAMEWIDTH, FRAMEHEIGHT, 0));
		
		gcm.put("frmSimulation",new GUIComponents(new JFrame(), null, "frmSimulation", null, true,
				0, LEFT, TOP, FRAMEWIDTH, FRAMEHEIGHT, 0));		
		/**
		 * content of frame
		 */
		/**
		 * image background
		 */
		gcm.put("lblImageSimulation", new GUIComponents(new JLabel(), ICONCAFETERIA, "lblImageSimulation", null, true,
				0, INS, INSSMALL, FRAMEWIDTH - INS*3, FRAMEHEIGHT - INS *7, 0));
		/**
		 * section cups
		 */
		/**
		 * image cup
		 */
		gcm.put("lblImageCup",
				new GUIComponents(new JLabel(), ICONCUP, "lblImageCup", "lblImageCup", false, 150, 310, 5, 140, 80, 1));
		/**
		 * char with first letter (comes from ECup)
		 */
		gcm.put("txfCup", new GUIComponents(new JTextField(), null, "txfCup", "...", false, 150, 300, 25, 90, 40, 2));
		/**
		 * concrete volume of the respective cup
		 */
		gcm.put("txfCupVolume",
				new GUIComponents(new JTextField(), null, "txfCupVolume", "... ml", false, 150, 400, 60, 45, 15, 2));
		/**
		 * section coffee dispensers (self speaking names) - ordered by appearance from top
		 */
		gcm.put("lblDisplayName", new GUIComponents(new JLabel(), null, "lblDisplayName", "KA ", false, 150,
				312, 75, 120, 20, 3));
		gcm.put("txfDisplayCurrentVolume", new GUIComponents(new JTextField(), null, "txfDisplayCurrentVolume", "... ml (pausing)",
				false, 150, 312, 95, 120, 20, 1));
		/**
		 * image coffeeDispenser
		 */
		gcm.put("lblImageCD", new GUIComponents(new JLabel(), ICONCOFFEEDISPENSER, "lblImageCD", null, false, 150, 295,
		215, 150, 355, 2));
		gcm.put("lblCDBadge", new GUIComponents(new JLabel(), null, "lblCDBadge", "KA ", false, 150,
				396, 220, 40, 20, 4));
		gcm.put("txfWaitTime", new GUIComponents(new JTextField(), null, "txfWaitTime", "... ms (pausing)", false, 150, 320,
				345, 60, 10, 3));
		gcm.put("pgbVolume",
				new GUIComponents(new JProgressBar(), null, "pgbVolume", "pgbVolume", false, 150, 415, 350, 10, 60, 3));
		gcm.put("btnPause", new GUIComponents(new JButton(), null, "btnPause", "Pause", false, 150, 396, 480, 40, 30, 3));		
		/**
		 * section board/about
		 */
		/**
		 * image board (left hand below)
		 */
		gcm.put("lblImageBoard",
				new GUIComponents(new JLabel(), ICONBOARD, "lblImageBoard", null, true, 0, INSSMALL, 525, 210, 300, 2));
		gcm.put("lblImageAuthor",
				new GUIComponents(new JLabel(), ICONAUTHOR, "lblImageAuthor", null, true, 0, INS, 525, 210, 300, 3));
		gcm.put("lblImageSizeOfCups",
				new GUIComponents(new JLabel(), ICONSIZEOFCUPS, "lblImageSizeOfCups", null, true, 0, INS, 525, 210, 300, 3));
		gcm.put("lblImageNumberOfCoffeeDispensers",
				new GUIComponents(new JLabel(), ICONNUMBEROFCOFFEEDISPENSERS, "lblImageNumberOfCoffeeDispensers", null, true, 0, INS, 525, 210, 300, 3));
		gcm.put("lblImagePause",
				new GUIComponents(new JLabel(), ICONPAUSE, "lblImagePause", null, true, 0, INS, 525, 210, 300, 3));
		gcm.put("lblPauseInfo",
				new GUIComponents(new JLabel(), null, "lblPauseInfo", "", true, 0, INS*5, 600, 90, 40, 4));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyText() {
		return myText;
	}

	public void setMyText(String myText) {
		this.myText = myText;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public static LinkedHashMap<String, GUIComponents> getGcm() {
		return gcm;
	}

	public static void setGcm(LinkedHashMap<String, GUIComponents> gcm) {
		GUIComponents.gcm = gcm;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public boolean isSingleElement() {
		return singleElement;
	}

	public void setSingleElement(boolean singleElement) {
		this.singleElement = singleElement;
	}

	@Override
	public String toString() {
		return "GUIComponents [component=" + component + ", icon=" + icon + ", name=" + name + ", myText=" + myText
				+ ", singleElement=" + singleElement + ", offset=" + offset + ", left=" + left + ", top=" + top
				+ ", width=" + width + ", height=" + height + ", layer=" + layer + ", getName()=" + getName()
				+ ", getMyText()=" + getMyText() + ", getLeft()=" + getLeft() + ", getTop()=" + getTop()
				+ ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + ", getLayer()=" + getLayer()
				+ ", getOffset()=" + getOffset() + ", getComponent()=" + getComponent() + ", getIcon()=" + getIcon()
				+ ", isSingleElement()=" + isSingleElement() + "]";
	}

}
