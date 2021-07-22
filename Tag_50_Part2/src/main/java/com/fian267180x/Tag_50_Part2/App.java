package com.fian267180x.Tag_50_Part2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application implements Easteregg{

    @Override
    public void start(Stage stage) {
    	// Gruppe für das Anzeigen.
    	Group root = new Group();
    	
    	WebView webview = new WebView();
    	webview.getEngine().load(EASTEREGG);
    	webview.setPrefSize(260, 210);
    	webview.setLayoutX(20);
    	webview.setLayoutY(20);
    	
    	Rectangle rectangle = new Rectangle(20, 20, 260, 210);
    	rectangle.setFill(Color.BLACK);
    	rectangle.setOpacity(0);
    	
    	Circle circle = new Circle();
    	circle.setCenterX(100);
    	circle.setCenterY(125);
    	circle.setRadius(75);
    	circle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1.0));
    	
    	Ellipse ellipse = new Ellipse();
    	ellipse.setCenterX(200);
    	ellipse.setCenterY(125);
    	ellipse.setRadiusX(75);
    	ellipse.setRadiusY(50);
    	ellipse.setFill(new Color(Math.random(), Math.random(), Math.random(), 1.0));
    	
    	Shape union = Shape.intersect(circle, ellipse);
    	union.setFill(Color.PURPLE);
    	
    	Line line = new Line(100, 85, 100, 40);
    	line.setStroke(Color.WHITE);
    	line.setStrokeWidth(3);
    	line.getStrokeDashArray().addAll(5d);
    	Line line2 = new Line(200, 85, 200, 40);
    	line2.setStroke(Color.WHITE);
    	Line line3 = new Line(150, 150, 150, 205);
    	line3.setStroke(Color.WHITE);
    	line2.setStroke(Color.WHITE);
    	line2.setStrokeWidth(3);
    	line2.getStrokeDashArray().addAll(5d);
    	line3.setStroke(Color.WHITE);
    	line3.setStrokeWidth(3);
    	line3.getStrokeDashArray().addAll(5d);
    	
    	Polygon polygon = new Polygon(195, 85, 205, 85, 200, 90);
    	polygon.setStroke(Color.WHITE);
    	polygon.setStrokeWidth(3);
    	
    	Arc arc = new Arc(100, 125, 50, 50, 180, 180);
    	arc.setFill(Color.TRANSPARENT);
    	arc.setStroke(Color.BLACK);
    	arc.setStrokeWidth(3);
    	Arc arc1 = new Arc(100, 110, 30, 30, 240, 60);
        arc1.setType(ArcType.ROUND);
        Arc arc2 = new Arc(80, 80, 30, 30, 240, 60);
        arc2.setType(ArcType.CHORD);
        arc2.setFill(Color.TRANSPARENT);
        arc2.setStroke(Color.BLACK);
        arc2.setStrokeWidth(3);
        Arc arc3 = new Arc(120, 80, 30, 30, 240, 60);
        arc3.setType(ArcType.CHORD);
        arc3.setFill(Color.TRANSPARENT);
        arc3.setStroke(Color.BLACK);
        arc3.setStrokeWidth(3);
        
        QuadCurve quad = new QuadCurve();
        quad.setStartX(185);
        quad.setStartY(105);
        quad.setEndX(195);
        quad.setEndY(105);
        quad.setControlX(190);
        quad.setControlY(140);
        QuadCurve quad2 = new QuadCurve(215, 105, 220, 140, 225, 105);
        
        CubicCurve cubicCurve = new CubicCurve(185, 155, 195, 140, 205, 170, 215, 155);
        
        Text text = new Text(55, 35, "Smiley A");
        text.setFill(Color.WHITE);
        Text text2 = new Text(155, 35, "Smiley B");
        text2.setFill(Color.WHITE);
        Text text3 = new Text(105, 225, "Smiley C");
        text3.setFill(Color.WHITE);
    	
    	// Hinzufügen zur Gruppe
    	root.getChildren().add(webview);
    	root.getChildren().add(rectangle);
    	root.getChildren().add(circle);
    	root.getChildren().add(ellipse);
    	root.getChildren().add(union);
    	root.getChildren().addAll(line, line2, line3);
    	root.getChildren().addAll(polygon);
    	root.getChildren().addAll(arc, arc1, arc2, arc3);
    	root.getChildren().addAll(quad,quad2);
    	root.getChildren().add(cubicCurve);
    	root.getChildren().addAll(text, text2, text3);
    	
    	// Setzen der Stage auf eine Scene mit der Gruppe
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}