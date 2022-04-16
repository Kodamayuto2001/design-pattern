package decorator3;

import decorator.Display;
import decorator.FullBorder;
import decorator.SideBorder;

public class Main {

	public static void main(String[] args) {
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("Good morning.");
		md.add("Hello.");
		md.add("Good night, see you tomorrow.");
		md.show();

		Display d1 = new SideBorder(md, '#');
		d1.show();

		Display d2 = new FullBorder(md);
		d2.show();
	}
}
