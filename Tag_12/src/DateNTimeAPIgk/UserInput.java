package DateNTimeAPIgk;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class UserInput {

	public UserInput() {

	}
	
	public static LocalDate InputJubileeDate() {
	Scanner scanner = new Scanner(System.in);
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	LocalDate date = LocalDate.parse(scanner.nextLine(), dtf1);
	//System.out.println(date);
	/*
	System.out.println("Geben Sie eine Uhrzeit ein:");
	LocalTime time = LocalTime.parse(scanner.nextLine());
	System.out.println(time);
	*/
	return date;
	}
	/*
	public static void InputParseDateTime() {
		while(true) {
		System.out.println("Geben Sie ein Datum ein (TT.MM.JJJJ):");
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = null;
		try {
			date = LocalDate.parse(scanner.nextLine(), dtf);
		} catch (DateTimeParseException e) {
			e.printStackTrace(); throw new IllegalArgumentException("Problem - bitte geben Sie die Daten gem‰ﬂ der Vorgabe ein.");
		}
		System.out.println(date);

		System.out.println("Geben Sie eine Uhrzeit ein (hh:mm):");
		LocalTime time = LocalTime.parse(scanner.nextLine());
		System.out.println(time);
	}}
	*/
	public static void InputDateTime() {
		CheckDateTime.CheckStringDateTime();
	}
}
