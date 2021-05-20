package dtf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDemo {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalTime time1 = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.GERMAN);
		String datePattern = "'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'";
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern(datePattern, Locale.FRENCH);
		
		System.out.println(date1.format(dtf4));
	}
}
