package bridge4.function;

import bridge4.implemention.DisplayImpl;

public class IncreaseCharDisplay extends CountDisplay {

	public IncreaseCharDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void incrementDisplay(int times) {
		for (int i = 0; i < times; i++) {
			multiDisplay(i);
		}
	}

}
