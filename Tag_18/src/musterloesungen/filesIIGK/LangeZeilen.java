package musterloesungen.filesIIGK;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LangeZeilen {

	public static void main(String[] args){
		boolean valid = false;
		String input = "";

		while(!valid) {
		IO.startOutput();

		input = IO.userInput();

		valid = AnalyseFileNMore.checkUserInputValid(input);
		}
		
		// caution! by while-loop valid must be true -> no if(valid) necessary
		AnalyseFileNMore.checkNumberCharsPerLine(input);
	}

}
