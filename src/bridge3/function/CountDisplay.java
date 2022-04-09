package bridge3.function;

import bridge3.implementation.DisplayImpl;

public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}

}
