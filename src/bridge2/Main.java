package bridge2;

import bridge2.function.RandomDisplay;
import bridge2.implementation.StringDisplayImpl;

public class Main {

	public static void main(String[] args) {
//		Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
//		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
//		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Randomworld"));
//		d1.display();
//		d2.display();
//		d3.display();
//		d3.multiDisplay(5);
		d4.randomDisplay(10);
	}

}
