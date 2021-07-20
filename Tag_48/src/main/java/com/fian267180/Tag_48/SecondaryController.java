package com.fian267180.Tag_48;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToThird() throws IOException {
        App.setRoot("Third");
    }
}