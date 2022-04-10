package strategy2;

public interface Strategy {

	public abstract Hand nextHand();
	public abstract void study(boolean win);

}
