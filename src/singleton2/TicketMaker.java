package singleton2;

public class TicketMaker {

	private static TicketMaker ticketmaker = new TicketMaker();

	private int ticket = 1000;
	private TicketMaker() {}

	public static TicketMaker getInstance() {
		return ticketmaker;
	}

	public synchronized int getNextTicketNumber() {
		return ticket++;
	}

}
