package ticketauswahlGK;

import java.time.LocalDate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String cName = null;
		
		Ticket[] tickets = {
				new Einzelticket(2, 1, LocalDate.of(2021, 05, 21)),
				new Gruppenkarte(5, 1, LocalDate.of(2021, 04, 21)),
				new Mehrfahrtenkarte(8, 5, LocalDate.of(2021, 06, 30)),
				new Monatskarte(2, 1, LocalDate.of(2021, 07, 31), "Max Mustermann")
				};
		
		for(int i = 0; i < tickets.length; i++) {
			String tmpString = "";
			cName = tickets[i].getClass().getSimpleName();
			if(cName.length() < 14) {
				tmpString = "\t";
			}
			System.out.println(
					 cName + ": "
					+"\t" + tmpString + "Equals tickets[0] zu [" + i + "]: " + tickets[i].equals(tickets[0]) 
					+ "\terlaubte Fahrten: " + tickets[i].getAnzahlErlaubteFahrten()
					+ "\t" + tickets[i].getPreis() + " Euro \n");
			
		}
		

	}

}
