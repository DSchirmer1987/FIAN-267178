package numberList;


public class Main {

	public static void main(String[] args) {
		NumberList<Integer> numbers = new NumberList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		numbers.add(1,1);
		System.out.println(numbers);
		
		
		int sum = 0;
		for(int i =0; i<numbers.length();i++) {
			sum += numbers.get(i);
		}
		System.out.println(sum);
	}

}
