package filesDemosCont;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoWriteFiles {

	public static void main(String[] args) throws IOException{
		File file = new File("c:\\Java\\ReadMe.txt");
		File newFile = new File("c:\\Java\\WriteMe.txt");
		
		Scanner fileScanner = new Scanner(file);
		
//		OutputStream os = new FileOutputStream(newFile);
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		PrintWriter pw = new PrintWriter(osw);
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(newFile)));
		
		while (fileScanner.hasNext()) {
			StringBuilder sb = new StringBuilder(fileScanner.nextLine());
			pw.println(sb.reverse().toString());
		}
		pw.close();
		
		fileScanner = new Scanner(newFile);
		while(fileScanner.hasNext()) {
			System.out.println(fileScanner.nextLine());
		}
	}

}
