package filesDemosCont;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoWriteFilesSecond {

	public static void main(String[] args) throws IOException{
		File file = new File("c:\\Java\\log.txt");
		File newFile = new File("c:\\Java\\logme.txt");
		
		Scanner fs = new Scanner(file);
		
		FileWriter myWriter = new FileWriter(newFile);
		while(fs.hasNext()) {
//			StringBuilder sb = new StringBuilder(fs.nextLine());
//			myWriter.write(sb.reverse().toString() + System.lineSeparator());
			String tmp = fs.nextLine();
			if(tmp.contains("WARNING")) {
				myWriter.write(tmp + System.lineSeparator());
			}
		}
		myWriter.close();
		
	}

}
