package musterloesungen.interfacePizzastoreGK;

public class MiniAccounting {

	public static IPizza[] setArrayPizzas() {
		IPizza[] pizzas = new IPizza[] { new PizzaNapolitana(), new PizzaMargherita() };
		return pizzas;
	}
	
	public static APizza[] setArrayPizzasA() {
		
		APizza[] pizzasA = new APizza[] {new PizzaNapolitanaA(), new PizzaMargheritaA()};
		
		return pizzasA;
		
	}
}
