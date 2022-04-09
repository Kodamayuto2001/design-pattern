package bridge4;

import bridge4.function.IncreaseCharDisplay;
import bridge4.implemention.DecorationDisplayImpl;

public class Main {

	public static void main(String[] args) {
		IncreaseCharDisplay i1 = new IncreaseCharDisplay(new DecorationDisplayImpl("<",">","*"));
		IncreaseCharDisplay i2 = new IncreaseCharDisplay(new DecorationDisplayImpl("|","-","#"));

		i1.incrementDisplay(10);
		System.out.println("");
		i2.incrementDisplay(10);
	}

}
