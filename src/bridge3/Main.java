package bridge3;

import bridge3.function.Display;
import bridge3.implementation.TextFileDisplayImpl;

public class Main {

	public static void main(String[] args) {

		Display d = new Display(new TextFileDisplayImpl("newfile.txt"));

		d.display();
	}

}
