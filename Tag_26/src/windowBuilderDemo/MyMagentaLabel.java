package windowBuilderDemo;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyMagentaLabel extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyMagentaLabel(String text) {
		setText(text);
		setBackground(Color.MAGENTA);
		setOpaque(true);
		setHorizontalAlignment(SwingConstants.CENTER);
	}
}
