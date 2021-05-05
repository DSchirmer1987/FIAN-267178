package lösungen;

import java.util.Scanner;

public class BMICalcBoehm {
	public static void main(String[] args) {

		int age;
		double bmi, weight, hight;
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben Sie Ihr Gewicht in kg an:");
		weight = sc.nextDouble();
		System.out.println("Bitte geben Sie Ihre Größe in Metern an:");
		hight = sc.nextDouble();
		System.out.println("Bitte geben Sie Ihr Alter in Jahren an:");
		age = sc.nextInt();
		sc.close();
		
		bmi = weight / (hight * hight);

		if (((age >= 19 && age <= 24) && (bmi >= 19 && bmi <= 24))
				|| ((age >= 25 && age <= 34) && (bmi >= 20 && bmi <= 25))
				|| ((age >= 35 && age <= 44) && (bmi >= 21 && bmi <= 26))
				|| ((age >= 45 && age <= 54) && (bmi >= 22 && bmi <= 27))
				|| ((age >= 55 && age <= 64) && (bmi >= 23 && bmi <= 28)) 
				|| ((age > 64) && (bmi >= 24 && bmi <= 29))) {

			System.out.printf("Dein BMI ist %.2f. Alles super! Hol dir ein Bier!", bmi);

		} else {

			System.out.printf("Dein BMI ist %.2f. Da würd ich lieber mal zum Arzt gehen.", bmi);
		}
	}
}
