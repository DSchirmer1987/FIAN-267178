package aufgabeArrays;


public class Main {

	public static void main(String[] args) {
		NumberList<Integer> numbers = new NumberList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		numbers.removeAt(3);
		numbers.add(1,1);
		System.out.println(numbers);
	}

}
