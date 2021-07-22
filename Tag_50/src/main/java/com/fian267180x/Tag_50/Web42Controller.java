package com.fian267180x.Tag_50;

import javafx.fxml.FXML;
import javafx.scene.web.*;

public class Web42Controller {
	
	@FXML
	private WebView web_42;
	
	@FXML
	private void initialize() {
		WebEngine engine = web_42.getEngine();
		engine.load("https://www.youtube.com/embed/Rq1kBWzn5-s?start=97&autoplay=1");
	}

}
