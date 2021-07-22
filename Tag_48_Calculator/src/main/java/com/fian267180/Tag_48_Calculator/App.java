package com.fian267180.Tag_48_Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene scene = new Scene(root);
        Font.loadFont(getClass().getResourceAsStream("digital_7_new.ttf"), 60);
        scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
//        scene.getStylesheets().add(getClass().getResource("calculator2.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}