package guidemos;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MenuBarDemo {

	public static void main(String[] args) {
		try {
			// Setzen des Look and Feels auf dasselbe wie das System
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			// Setzen des Look and Feels auf das Crossplattform Design
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
			// Setzen des Look and Feels auf das Nimbus Design
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			
			// Setzen des Look and Feels auf das Metal Design
//			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MyJFrame frame = new MyJFrame();
		JLabel label = new JLabel("Ein Label");
		
		// MenuBar aufbauen
		JMenuBar menuBar = new JMenuBar();
		
		// MenuBar Eintrag
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
		
		// Menu Einträge
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		editMenu.add(new JMenuItem("Undo"));
		editMenu.add(new JMenuItem("Redo"));
		editMenu.add(new JSeparator());
		editMenu.add(new JMenuItem("Copy"));
		editMenu.add(new JMenuItem("Paste"));
		
		// Version 1 zum hinzufügen von Actionen auf das Menü
		JMenuItem exit = new JMenuItem("Exit", KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		// Version 2
		Action close = new AbstractAction() {
			{
				putValue(Action.NAME, "Close");
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		// Version 3
		JMenuItem close2 = new JMenuItem("Schliessen");
		close2.addActionListener(e -> System.exit(0));
		
		//Funktionalität durch Iteration integrieren.
		Component[] cnt = editMenu.getMenuComponents();
		for(Component innerComp : cnt) {
			if(innerComp instanceof JMenuItem) {
				((JMenuItem) innerComp).setToolTipText("Ein Tooltip. Hooray!");
				((JMenuItem) innerComp).addActionListener(e -> System.out.println(((JMenuItem) innerComp).getText()));
			}
		}
		
		// Keybinding für MenuItem
		KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK);
		exit.setAccelerator(f5);
		
		// Setzen des Mnemonic
		exit.setMnemonic('E');
		
		fileMenu.add(exit);
		fileMenu.add(close);
		fileMenu.add(close2);
		
		frame.setJMenuBar(menuBar);
		frame.add(label);
		frame.setVisible(true);

	}

}
