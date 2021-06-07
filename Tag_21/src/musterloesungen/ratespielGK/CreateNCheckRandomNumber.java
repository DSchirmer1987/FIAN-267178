package musterloesungen.ratespielGK;

public class CreateNCheckRandomNumber {

	public static int createRandomNumber() {

		// numbers from 1 to 100
		int rndNumber = (int) (Math.random() * 100) + 1;
		return rndNumber;
	}
	
	public static String checkRandomNumber(String guess, int rndNumber, int numberOfAttempts) throws IllegalArgumentException, IllegalAccessException {
		String hint = "";
		int guessNumber = 0;
		
		try {
		guessNumber = Integer.parseInt(guess);
		if (guessNumber < 1||guessNumber > 100) {
			throw new IllegalArgumentException();
		}
		} catch(IllegalArgumentException e){
			IO.exceptionDialogue();
			IO.guessingDialogue(rndNumber, numberOfAttempts);
		}
		
		if(guessNumber < rndNumber) {
			hint = "kleiner";
		} else if(guessNumber > rndNumber) {
			hint = "größer";
		} else {
			hint = "Treffer";
		}
		
		return hint;
	}

}
