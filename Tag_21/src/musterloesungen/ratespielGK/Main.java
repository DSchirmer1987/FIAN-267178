package musterloesungen.ratespielGK;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		IO.startGuessingGame();
		
		int numberOfAttempts = 0;
		int rndNumber = CreateNCheckRandomNumber.createRandomNumber();
		
		
		
		do {
			IO.guessingDialogue(rndNumber, numberOfAttempts);
			numberOfAttempts++;
		} while (true);

	}
}
