package prototype;

import java.io.UnsupportedEncodingException;

import prototype.framework.Product;

public class MessageBox extends Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length;
		try {
			length = s.getBytes("SJIS").length;
		} catch (UnsupportedEncodingException e) {
			length = s.getBytes().length;
			e.printStackTrace();
		}
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

}
