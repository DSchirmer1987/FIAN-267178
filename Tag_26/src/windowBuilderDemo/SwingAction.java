package windowBuilderDemo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;

public class SwingAction extends AbstractAction {
	
	JLabel edit;

	public SwingAction(String name, JLabel edit) {
		putValue(NAME, name);
//		putValue(SHORT_DESCRIPTION, "Some short description");
		this.edit = edit;
	}
	public void actionPerformed(ActionEvent e) {
			edit.setText("Hallo Welt");
	}

}
