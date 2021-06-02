package musterloesungen.interfacePizzastoreGK;

public class Main {

	public static void main(String[] args) {

		double totalPrice = 0;

//		IPizza[] pizzas = MiniAccounting.setArrayPizzas();
//		for (int i = 0; i < pizzas.length; i++) {
//			totalPrice += pizzas[i].getPreis();
//		}
//
//		System.out.printf("\nDer Gesamtpreis beträgt %1.2f Euro.\n\n", totalPrice);
//totalPrice = 0;
		
		APizza[] pizzasA = MiniAccounting.setArrayPizzasA();
		for (int i = 0; i < pizzasA.length; i++) {
			totalPrice += pizzasA[i].getPreis();
			System.out.println(pizzasA[i]);
		}
		
		System.out.printf("\nDer Gesamtpreis beträgt %1.2f Euro.\n\n", totalPrice);
		
		System.out.println("Ende.");
		
	}
}
