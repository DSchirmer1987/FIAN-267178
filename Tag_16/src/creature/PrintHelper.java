package creature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHelper {
	
	// Helper methods to keep output free of redundancy
	
//	public static void printLine() {
//		System.out.println("+----------------------------+");
//	}
	
	public static String printLine() {
		return String.format("+----------------------------+%n");
	}
	
//	public static void printEmptyLine() {
//		System.out.println("|                            |");
//	}
	
	public static String printEmptyLine() {
		return String.format("|                            |%n");
	}

//	public static void printEmptyCell() {
//		for (int i = 1; i < 6; i++)
//			printEmptyLine();
//	}
	
	public static String printEmptyCell() {
		String tmp = "";
		for (int i = 1; i < 6; i++) {
			tmp += printEmptyLine();
		}
		return tmp;
	}
	
	// Wait for user input; 
	// inserted to visualize step by step execution during lecture
	
	public static void waitForInput() {
		System.out.println("please press enter to continue.");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
