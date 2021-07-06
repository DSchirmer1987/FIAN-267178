package schleifenGK;



import java.util.Scanner;

public class SchleifenE1T5 {

	// exercise 1
	public static int[] addFromToByWhileLoop() {
		Scanner sc = new Scanner(System.in);
		String o1 = "Bitte geben Sie die kleinere Zahl ein: ";
		String o2 = "\nBitte geben Sie die gr��ere Zahl ein: ";
		int[] mn = new int[2];
		int m = 0;
		int n = 0;

		do {
			System.out.println(o1);
			m = sc.nextInt();
			System.out.println(o2);
			n = sc.nextInt();
		} while (n <= m);

		mn[0] = m;
		mn[1] = n;

		int sum = 0;
		while (m <= n) {
			sum += m;
			m++;
		}

		System.out.println("While-Schleife: " + sum);

		return mn;
	}

	// exercise 2
	public static void addFromToByForLoop(int[] mn) {
		int m = mn[0];
		int n = mn[1];
		int sum = 0;

		for (int i = m; i <= n; i++) {
			sum += i;
		}

		System.out.println("For-Schleife: " + sum);

	}

	public static void addFromToByDoWhileLoop(int[] mn) {
		int m = mn[0];
		int n = mn[1];
		int sum = 0;

		do {
			sum += m;
			m++;
		} while (m <= n);

		System.out.println("Do-While-Schleife: " + sum);

	}

	// exercise 3
	public static void waehrungsRechner() {
		Scanner sc = new Scanner(System.in);
		String w1 = "";
		String w2 = "";
		double u = 0.0;
		double i1 = -1;
		double i2 = 0;

		System.out.println("Bitte geben Sie die W�hrung 1 ein: ");
		w1 = sc.nextLine();
		System.out.println("Bitte geben Sie die W�hrung 2 ein: ");
		w2 = sc.nextLine();
		System.out.println("Bitte geben Sie den Umrechnungskurs ein: ");
		u = sc.nextDouble();

		while (true) {
			System.out.println("Bitte geben Sie den Betrag ein, der umgerechnet werden soll (0 beendet): ");
			i1 = sc.nextDouble();
			if (i1 == 0) {
				System.out.println("W�hrungsrechner beendet.");
				System.exit(0);
			}
			i2 = i1 * u;
			System.out.println(i1 + " " + w1 + " sind " + i2 + " " + w2 + ".");
		}
	}

	// exercise 4
	public static void weihnachtsbaeume() {
		Scanner sc = new Scanner(System.in);
		int h = 0;
		String o = "";
		String line = "";
		int lengthLine = h;

		do {
			System.out.println("Bitte geben Sie die H�he des Weihnachtsbaums ein: ");
			h = sc.nextInt();
		} while (h < 0);

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h - i - 1; j++) {
				o += " ";
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				o += "*";
			}
			o += "\n";

		}

		for (int i = 0; i < h - 1; i++) {
			o += " ";
		}
		o += "#";
		System.out.println(o);

	}

	// exercise 5
	public static void zahlworte() {
		Scanner sc = new Scanner(System.in);
		String totalOutput = "";
		String[] einer = new String[] { "null", "ein", "zwei", "drei", "vier", "f�nf", "sechs", "sieben", "acht",
				"neun", "zehn", "elf", "zw�lf" };
		String[] zehner = new String[] { "", "zehn", "zwanzig", "drei�ig", "vierzig", "f�nfzig", "sechzig", "siebzig",
				"achtzig", "neunzig" };
		String[] wert = new String[] { "millionen", "tausend", "" };
		int[] teilZ = new int[3];
		int teiler = 1000;
		int tmpTeiler = teiler;
		int z = 0;
		int tmpZ = z;
		String r = "";
		String tmpR = "";
		boolean hasEiner = false;
		
		do {
		System.out.println("Bitte geben Sie eine Zahl zwischen 0 und 999.999.999 ein: ");
		z = sc.nextInt();
		} while(z < 0 || z > 999999999);
		
		class zerlegen {
			String tmpR = "";

			public String bildeEiner(int tmpTeilZ) {
				tmpR = "";
				if (tmpTeilZ % 10 != 0) {
					tmpR = einer[tmpTeilZ % 10];
				}

				if ((tmpTeilZ % 100) / 10 == 1 && (tmpTeilZ % 10 == 6 || tmpTeilZ % 10 == 7)) {
					tmpR = tmpR.substring(0, 4);
				}

				return tmpR;
			}

			public String bildeZehner(int tmpTeilZ, String tmpR) {
				if ((tmpTeilZ % 100) == 11 || (tmpTeilZ % 100) == 12) {
					return String.valueOf(einer[tmpTeilZ % 100]);
				}
				if (tmpTeilZ % 10 != 0 && tmpTeilZ % 100 > 20) {
					tmpR += "und";
				}
				tmpR += zehner[(tmpTeilZ % 100) / 10];

				return tmpR;
			}

			public String bildeHunderter(int tmpTeilZ) {
				tmpR = "";
				if (tmpTeilZ / 100 > 0) {
					return tmpR = bildeEiner(tmpTeilZ / 100) + "hundert";
				}
				return tmpR;
			}
		}

		tmpZ = z;
		switch (z) {
		case 0: {
			tmpR = einer[z];
			break;
		}
		case 1: {
			tmpR = einer[z] + "s";
			break;
		}
		default: {
			// builds 3 groups of z (over 1 million, up to million, up to thousand)
			// -> 3 identical "views"
			for (int i = 0; i < teilZ.length; i++) {
				tmpTeiler = (int) Math.pow(teiler, teilZ.length - i - 1);
				teilZ[i] = tmpZ / tmpTeiler;
				tmpZ = z % tmpTeiler;
			}
			break;
		}
		}

		for (int i = 0; i < wert.length; i++) {
			if(teilZ[i]==0) {
				continue;
			}
			zerlegen c = new zerlegen();
			tmpR = c.bildeEiner(teilZ[i]);
			tmpR = c.bildeHunderter(teilZ[i]) + c.bildeZehner(teilZ[i], tmpR) + wert[i];
			totalOutput += tmpR;
		}
		if (totalOutput.contains("einmillionen")) {
			totalOutput = totalOutput.replace("einmillionen", "einemillion");
		}

		System.out.println(z + ": " + totalOutput);
	}

//		
//		
//		if (z % 10 > 0) {
//			hasEiner = true;
//		}
//		System.out.println(baustein.length);
//		class calc {
//			public void erzeugeEiner() {
//
//			}
//
//			public void ermittleBaustein() {
//				for (int i = 0; i < baustein.length; i++) {
//					System.out.println(i);
//				}
//
//			}
//
//		}
//
//		calc c = new calc();
//		c.ermittleBaustein();
//
//		switch (String.valueOf(z).length()) {
//		case 1: {
//			if (z == 1) {
//				r = einer[z] + "s";
//			} else {
//				r = String.valueOf(einer[z]);
//			}
//			break;
//		}
//		case 2: {
//			if (hasEiner) {
//
//			} else {
//
//			}
//			break;
//		}
//		}
//
//		System.out.println(r);

}

//	public static void weihnachtsbaeume() {
//		Scanner sc = new Scanner(System.in);
//		int h = 5;
//		int nStars = 0;
//		int nSpaces = 0;
//		String stars = "";
//		String spaces = "";
//		String o = "";
//		String line= "";
//		int lengthLine = h;
//		
////		do {
////		System.out.println("Bitte geben Sie die H�he des Weihnachtsbaums ein: ");
////		h = sc.nextInt();
////		}while(h<0);
//		
//		// loop for rows in tree
//		for(int i = 0; i < h;i++) {
//			// formula for number of stars
//			nStars = i * 2 + 1;
//			int j = 0;
//			while(j < nStars) {
//				stars += "*";
//				j++;
//			}
//			
//			// formula for number of spaces
//			nSpaces = lengthLine - stars.length();
//			int k = 0;
//			while(k < nSpaces) {
//				spaces += ".";
//				k++;
//			}
//			
//			line += spaces + stars;
//			spaces = "";
//			stars = "";
//			o += line + "\n";
//			line = "";
//		}
//
//		spaces = "";
//		for(int i = 0; i < h; i++) {
//			spaces += " ";
//		}
//		o += spaces + "#";
//		
////		for(int i = 0; i < h; i++) {
////			// building spaces
////			for(int j = 0; j < i; j++) {
////				o+= " ";				
////			}
////			// building *
////			for(int j = 0; j < i; j++) {
////				o+= "*";
////			}
////			o+="\n";
////		}
////		o+= "#";
//		System.out.println(o);
//	}
