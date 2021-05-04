package sum;

public class Product {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int boundary;
	// Produkt der bisher addierten ganzen Zahlen
	int prod;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 10;
	prod = 1;
	counter = 1;
	// Berechnen des Produktes sum über alle Zahlen von 1 bis boundary
	while (counter <= boundary) {
		prod = prod * counter;
		counter = counter + 1;
	}
	// Ausgeben des Produktes, gemeinsam mit erläuterndem Text
	System.out.print("Das Produkt der Zahlen von 1 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(prod);
	}
}
