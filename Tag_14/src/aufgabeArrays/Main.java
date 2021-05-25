package aufgabeArrays;


public class Main {

	public static void main(String[] args) {
		NumberList numbers = new NumberList();
		
		numbers.add(1.65);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		numbers.removeAt(3);
		numbers.add(1,1);
		System.out.println(numbers);
	}

}
