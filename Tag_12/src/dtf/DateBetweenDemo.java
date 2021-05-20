package dtf;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateBetweenDemo {
	static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	public static void main(String[] args) {
		betweenDates();
		LocalDate heute = LocalDate.now();
		LocalDate hochzeit = LocalDate.of(2000,3,15);
		
		System.out.println("Geben Sie Ihr Hochzeits-Datum ein:");
		Scanner scanner = new Scanner(System.in);
//		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(scanner.nextLine(), dtf1);
		
		System.out.println("Wählen Sie ein Jubiläum");
		String[] jubilaen = new String[] {"SilberHochzeit", "Goldene Hochzeit", "Diamanthochzeit"};
		for (int i = 0; i < jubilaen.length; i++) {
			System.out.println(jubilaen[i] + ":" + (i+1));
		}
		LocalDate jubilaeum = LocalDate.now();
		int auswahl = scanner.nextInt();
		switch (auswahl) {
			case 1: {
				jubilaeum = date.plusYears(25);
				System.out.println("Test");
				break;
			}
			case 2: {
				jubilaeum = date.plusYears(50);
				break;
			}
			case 3: {
				jubilaeum = date.plusYears(60);
				break;
			}
			default: {
				System.out.println("Falsche Eingabe!");
			}
		}
		
		System.out.println("Ihre " + jubilaen[auswahl-1] + " ist am " + jubilaeum.format(dtf1));

	}
	
	public static void betweenDates() {
		LocalDate heute = LocalDate.now();
		LocalDate hochzeit = LocalDate.of(2000,3,15);
		Period p = Period.between(heute, hochzeit);
		System.out.println(p.getDays());
	}

}
