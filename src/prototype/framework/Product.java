package prototype.framework;

//public interface Product extends Cloneable {
//	public abstract void use(String s);
//	public abstract Product createClone();
//}

public abstract class Product implements Cloneable {

	public abstract void use(String s);

	public final Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}