package bridge2.function;

import java.util.Random;

import bridge.implementation.DisplayImpl;

public class RandomDisplay extends Display {

	public RandomDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		Random random = new Random();
		int randomValue = random.nextInt(times);

		open();
		for (int i = 0; i < randomValue; i++) {
			print();
		}
		close();
	}

}
