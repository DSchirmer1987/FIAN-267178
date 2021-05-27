package filesDemos;

import java.io.File;
import java.io.IOException;

public class DemoFiles {

	public static void main(String[] args) {
		// File ist eine Klasse von Java für den Zugriff aufs Dateisystem.
		// Jede File ist eine eigene Instanz
		File file = new File("c:\\Java\\ReadMe.txt");
		File newFile = new File("c:\\Java\\ReadMeToo.txt");
		File dir = new File("c:");
		
		// Als Datei
		System.out.println("Datei existiert: " + file.exists());
		System.out.println("Ist eine Datei: " + file.isFile());
		System.out.println("Ist ein Ordner: " + file.isDirectory());
		// Als Verzeichnis
		System.out.println("Ordner existiert: " + dir.exists());
		System.out.println("Ist eine Datei: " + dir.isFile());
		System.out.println("Ist ein Ordner: " + dir.isDirectory());
		dir.mkdirs();
		System.out.println("Ordner existiert: " + dir.exists());
		System.out.println("Ist eine Datei: " + dir.isFile());
		System.out.println("Ist ein Ordner: " + dir.isDirectory());
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.length());
		
		File[] dateien = dir.listFiles();
		
		for (File file2 : dateien) {
			System.out.println(file2.getName());
		}
		
		System.out.println("Datei existiert: " + newFile.exists());
		System.out.println("Ist eine Datei: " + newFile.isFile());
		System.out.println("Ist ein Ordner: " + newFile.isDirectory());
		
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Datei existiert: " + newFile.exists());
		System.out.println("Ist eine Datei: " + newFile.isFile());
		System.out.println("Ist ein Ordner: " + newFile.isDirectory());
	}

}
