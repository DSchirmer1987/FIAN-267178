package mvcDemo;

import java.applet.Applet;

import mvcDemo.controller.MyController;
import mvcDemo.view.MainFrame;

public class Application{

	public static void main(String[] args) {
		Thread t1 = new Thread( () -> { new MyController("Fenster 1"); } );
//		Thread t2 = new Thread( () -> { new MyController("Fenster 2"); } );
		
		t1.start();
//		t2.start();
	}

}
