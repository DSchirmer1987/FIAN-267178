package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate heute = LocalDate.now();
		System.out.println("Heute: " + heute);
		
		LocalDate gebDat = LocalDate.of(24, 6, 29);
		System.out.println("Geb-Dat: " + gebDat);
		
		LocalDate gebDat2 = LocalDate.of(1956, Month.APRIL, 25);
		System.out.println("Geb-Dat: " + gebDat2);
		
		System.out.println(gebDat.plusMonths(9));
		System.out.println(gebDat.minusMonths(4));
		
		System.out.println(LocalDate.now().isLeapYear());
		System.out.println(Year.isLeap(2546));
		System.out.println(Year.MIN_VALUE);
		System.out.println(Year.MAX_VALUE);
		
		System.out.println(2000 & 3);
	}

}
