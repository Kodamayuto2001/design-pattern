package factorymethod.idcard;

import factorymethod.framework.Product;

public class IDCard extends Product {

	private String owner;
	private int id = 0;

	/*
	 * Javaでは、public, protected, privateなどのアクセス制御が
	 * 何もついていないコンストラクタやメソッドは、同じパッケージ内のクラス
	 * からのみ利用できます。
	 */
	IDCard(String owner, int id) {
		System.out.println(owner + "(" + id + ")" + "のカードを作ります。");
		this.owner = owner;
		this.id = id;
	}

	@Override
	public void use() {
		System.out.println(owner + "(" + id + ")" + "のカードを使います。");
	}

	public String getOwner() {
		return owner;
	}

	public int getId() {
		return this.id;
	}

}
