package templatemethod;

import java.io.UnsupportedEncodingException;

public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		try {
			this.width = string.getBytes("SJIS").length;
		} catch (UnsupportedEncodingException e) {
			this.width = string.getBytes().length;
			e.printStackTrace();
		}
	}

	@Override
	protected void open() {
		printLine();
	}

	@Override
	protected void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	protected void close() {
		printLine();
	}

	private void printLine() {

		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
