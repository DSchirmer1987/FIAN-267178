package musterloesungen.GK;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class FilterNSearch {

	public static int filtern(String eingabeDatei, String filterWort, String ausgabeDatei) throws IOException {
		int filter = 0;
		String tmp = "";

		File file = new File(eingabeDatei);
		File newFile = new File(ausgabeDatei);

		Scanner fs = new Scanner(file);

		FileWriter myWriter = new FileWriter(newFile);
		/*
		 * while(fs.hasNext()) { tmp = fs.nextLine(); if(tmp.contains(filterWort)) {
		 * myWriter.write(tmp + System.lineSeparator()); filter++; } }
		 */

		boolean match = false;

		while (fs.hasNext()) {
			// works also without System.lineSeparator() -> better view in console during
			if(fs.findInLine(filterWort) != null) {
				System.out.println("Gefunden");
			}
			tmp += fs.nextLine();// + System.lineSeparator();
		}
		
		// "." is RegEx special - it has to be escaped by "\\" -> "\\."
		// delimiter is "|" to use more chars
		String[] sentences = tmp.split("!|;|\\.");
		System.out.println(sentences.length);
		for(int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
			
			// without method equalsIgnoreCase
			int match2 = sentences[i].toUpperCase().indexOf(filterWort.toUpperCase());
			if(match2 > -1) {
				match = (/*"*" +*/ filterWort/* + "*"*/).equalsIgnoreCase(sentences[i].substring(match2,match2+filterWort.length()));
				filter++;
				myWriter.write(sentences[i] + System.lineSeparator());
			}
			
			if(sentences[i].toLowerCase().contains(filterWort.toLowerCase())) {
				
			}
			 System.out.println(match2);
			 System.out.println(match);
			match = false;
		}
		myWriter.close();
		System.out.println("tmp: " + tmp);
		System.out.println(filterWort);
		System.out.println("IndexOf: " + tmp.indexOf("."));
		return filter;

	}

}
