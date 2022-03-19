package prototype;

import java.io.UnsupportedEncodingException;

import prototype.framework.Product;

public class UnderlinePen extends Product {

	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
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
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

}
