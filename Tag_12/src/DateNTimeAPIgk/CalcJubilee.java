package DateNTimeAPIgk;

import java.time.LocalDate;

public class CalcJubilee {

	public CalcJubilee() {
		// TODO Auto-generated constructor stub
	}

	public static LocalDate SpecialJubilee(LocalDate date, int choice) {
		
		Jubilee jubilee = null;

		// special cases of enum Jubilee with days or half of a year
		int sCase = -1;
		double jubiYears = jubilee.values()[choice - 1].getYears();
		int jYears = (int) jubiYears;
		int jMonths = 6;
		int jDays;
		LocalDate newDate;

		// begins with the .x doubles (with x != 0) to get all .5 jubilees 
		if (jubiYears * 10 > (int) jubiYears * 10) {
			sCase = 2;
		}
		// special jubilee 100 days
		if (jubiYears == 0.3) {
			sCase = 0;
		}
		// special jubilee 250 days
		if (jubiYears == 0.7) {
			sCase = 1;
		}
		System.out.println(sCase);
		switch(sCase) {
		case 0: {
			newDate = date.plusDays(100);
			break;			
		}
		case 1: {
			newDate = date.plusDays(250);
			break;			
		}
		case 2: {
			newDate = date.plusYears(jYears).plusMonths(jMonths);
			break;			
		}
		default: {
			newDate = date.plusYears(jYears);
			break;
		}
		}

		System.out.println(jubilee.values()[choice - 1].getYears());

		
		//LocalDate newDate = date.plusYears(years);
		return newDate;
	}

}
