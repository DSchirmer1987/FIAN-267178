package tag02;

public class DemoSchleifen {

	public static void main(String[] args) {
		System.out.println("While");
		
		int counter = 0;
		while(counter < 5) {
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("-------------");
		
		System.out.println("For");
		
		for(counter = 0; counter < 5; counter++) {
			System.out.println(counter);
		}
	}

}
