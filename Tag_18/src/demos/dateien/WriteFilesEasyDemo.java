package demos.dateien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFilesEasyDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("c:\\Java\\log.txt");
		File newFile = new File("c:\\Java\\logme2.txt");
		Scanner fs = new Scanner(file);
		
		// PrintWriter wrapped FileWriter für mehr möglichkeiten.
		PrintWriter myWriter = new PrintWriter(new FileWriter(newFile, true));
		PrintWriter myPrinter = new PrintWriter(System.out);
		while(fs.hasNext()) {
			String tmp = fs.nextLine();
			if(tmp.contains("WARNING")) {
				myWriter.println(tmp);
				myPrinter.println(tmp);
			}
		}
		myWriter.close();
		myPrinter.close();

	}

}
