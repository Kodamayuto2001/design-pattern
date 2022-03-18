package singleton2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start.");
		TicketMaker obj1 = TicketMaker.getInstance();
		TicketMaker obj2 = TicketMaker.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンスです。");
			System.out.println(obj1.getNextTicketNumber());
			System.out.println(obj1.getNextTicketNumber());
			System.out.println(obj2.getNextTicketNumber());
			System.out.println(obj1.getNextTicketNumber());
		} else {
			System.out.println("obj1とobj2は同じインスタンスではありません。");
		}
		System.out.println("End.");
	}
}
