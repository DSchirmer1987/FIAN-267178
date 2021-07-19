package kaffeeAutomaten.view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class MATextPanel extends JPanel {

	private Dimension dimension = new Dimension(250, 50);
	private JLabel label;
	private JTextPane mAtext;
	private JScrollPane scroll;

	

	public MATextPanel() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(label = new JLabel("Mitarbeiter"));
		this.add(scroll = new JScrollPane(mAtext = new JTextPane()));
		scroll.setPreferredSize(dimension);

	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextPane getMAText() {
		return mAtext;
	}
	
	public void setmAText(JTextPane text) {
		this.mAtext = text;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

}
