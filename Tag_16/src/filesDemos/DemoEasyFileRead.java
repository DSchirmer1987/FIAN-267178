package filesDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoEasyFileRead {

	public static void main(String[] args) {
		File file = new File("c:\\Java\\ReadMe.txt");
		Scanner fileScanner = null;
		
		try {
			fileScanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(fileScanner.nextLine());
		System.out.println(fileScanner.nextLine());
		System.out.println(fileScanner.nextLine());
		System.out.println(fileScanner.nextLine());
		
		while (fileScanner.hasNext()) {
			System.out.println(fileScanner.nextLine());
		}
	}

}
