package dtf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class DTFDemo {
	
	// DTF as short for DateTimeFormatter
	public static void main(String[] args) {
//		demoDateTimeFormatter();
//		demoDateTimeFormatterPattern();
//		demoParse();
		demoParseWithoutFormatter();
	}
	
	public static void demoDateTimeFormatter() {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter base_ISO = DateTimeFormatter.BASIC_ISO_DATE;
		
		LocalDate date1 = LocalDate.now();
		LocalTime time1 = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		System.out.println(date1);
		System.out.println(date1.format(dtf));
		System.out.println(date1.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		System.out.println("Als ISO_DATE_TIME: " + datetime.format(DateTimeFormatter.ISO_DATE_TIME));
		
		/*
		 * Date mit Date-Formattern
		 * Time mit Time-Formattern
		 * DateTime mit Date, Time und Datetime-Formattern
		 */
		System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
		System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " " +  time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println(datetime.format(base_ISO));
	}
	
	public static void demoDateTimeFormatterPattern() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		// Beim Pattern:  Alles das was als Text angezeigt werden soll, muss in Hochkommata.
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("'Es ist der ' dd'. ' M");
		
		String datePattern = "'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'";
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern(datePattern);
		
		System.out.println(date.format(dtf1));
		System.out.println(time.format(dtf2));
		System.out.println(datetime.format(dtf3));
		System.out.println(date.format(dtf4));
	}
	
	public static void demoParse() {
		System.out.println("Geben Sie ein Datum ein:");
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(scanner.nextLine(), dtf1);
		System.out.println(date);
//		String datePattern = "'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'";
//		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern(datePattern);
//		date = LocalDate.parse(scanner.nextLine(), dtf4);
//		System.out.println(date);
		System.out.println("Geben Sie eine Uhrzeit ein:");
		LocalTime time = LocalTime.parse(scanner.nextLine());
		System.out.println(time);
	}
	
	public static void demoParseWithoutFormatter() {
		System.out.println("Geben Sie ein Datum ein:");
		Scanner scanner = new Scanner(System.in);
		String datum = scanner.nextLine();
		
		String[] zerteilt = datum.split("\\.");
		int day = Integer.parseInt(zerteilt[0]);
		int month = Integer.parseInt(zerteilt[1]);
		int year = Integer.parseInt(zerteilt[2]);
		
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date);
	}

}
