/**
 * @author Schirmer, Daniel
 *
 */

package aufgabeKassenbonKB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintHelper {
	
	// Helper methods to keep output free of redundancy
	
	public static void printLine() {
		System.out.println("+-------------------------------+");
	}
	
	public static void printEmptyLine() {
		System.out.println("|                            |");
	}

	public static void printEmptyCell() {
		for (int i = 1; i < 6; i++)
			printEmptyLine();
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
	/**
	 * @author Böhm, Kay
	 *
	 */
	
	public static void printAdressField(Receipt r) {
		printLine();
		System.out.println("|\t"+r.getShopName()+" "+r.getShopID()+"\t\t|");
		System.out.println("|\t"+r.getStrasse()+"\t\t|");
		System.out.println("|\t"+r.getPlz()+" "+r.getOrt()+"\t\t|");
		System.out.println("|\t"+r.getTelNr()+"\t|");
		printLine();
	}
	
	public static void printSum(double summe) {
		System.out.println();
		System.out.println("\t\t\t=====");
		System.out.printf("Summe EUR\t\t%,.2f\n",summe);
		System.out.println("\t\t\t=====");
	}
	
}
