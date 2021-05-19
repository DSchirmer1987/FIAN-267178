package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		System.out.println(ldt);
		
		System.out.println(LocalDateTime.of(2012, 3, 25, 15, 30, 45));
		
		flugVomWeihnachtsmann();

	}
	
	public static void flugVomWeihnachtsmann() {
//		Flug ab Nordpol nach Berlin, Start: 24.12.2018 16:00 Uhr
//		Zwischenhalt in Dublin, Flugdauer 2 Stunde 45 Minuten
//		Aufenthalt in Dublin: 1 Stunden 15 Minuten
//		Flugdauer von Dublin nach Berlin 0 Stunden 45 Minuten
//		Ankunft in Berlin?
		
		LocalDateTime start = LocalDateTime.of(2018, 12, 14, 16, 0);
		LocalDateTime vorbei = LocalDateTime.from(start.plusHours(4).plusMinutes(15));
		
		System.out.println("Weihnachtsmann fliegt los: " + start);
		//Duration für Zeiträume kleiner als 1 Tag
		Duration flug1 = Duration.ofHours(2).plusMinutes(45);
		Duration flug2 = Duration.ofMinutes(45);
		Duration aufenthalt = Duration.ofHours(1).plusMinutes(15);
		//Period für Zeiträume ab 1 Tag
		Period flug3 = Period.ofDays(5);
		
		System.out.println("Ankunft in Dublin: " + start.plus(flug1));
		System.out.println("Abflug aus Dublin: " + start.plus(flug1).plus(aufenthalt));
		System.out.println("Ankunft in Berlin: " + start.plus(flug1).plus(aufenthalt).plus(flug2));
		LocalDateTime gesamt = start.plus(flug1).plus(aufenthalt).plus(flug2);
		
		if(gesamt.isBefore(vorbei)) {
			System.out.println("Der Weihnachtsmann war schneller als das Licht");
		} else {
			System.out.println("Alles wie gewohnt!");
		}
		
		System.out.println(gesamt.plus(flug3).plus(aufenthalt));
	}

}
