package com.fian267180.Tag_48;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FourthController {
	@FXML
	Button btn_eins, btn_zwei;
	@FXML
	Label lbl_eins;
	
	@FXML
	private void switchText(ActionEvent e) {
		Button source = (Button) e.getSource();
		lbl_eins.setText(source.getText());
	}
}
