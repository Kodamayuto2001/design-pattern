package strategy2;

public class Player {

	private String name;
	private Strategy strategy;

	private int wincount;
	private int losecount;
	private int gamecount;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;

		wincount = 0;
		losecount = 0;
		gamecount = 0;
	}

	public Hand nextHand() {
		return strategy.nextHand();
	}

	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() {	//	引き分け
		gamecount++;
	}

	public String toString() {
		return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
 	}

}
