package memento2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import memento2.game.Gamer;
import memento2.game.Memento;

public class Main {

	private final static String  FILENAME = "game.dat";

	private static Memento loadMemento() {
		Memento memento = null;

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME));
			memento = (Memento)in.readObject();
		} catch(FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return memento;
	}

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = loadMemento();

		if (memento != null) {
			System.out.println("前回保存した結果からスタートします。");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("新規にスタートします。");
			memento = gamer.createMemento();
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("現状：" + gamer);

			gamer.bet();

			System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

			//	Mementoの取り扱いの決定
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("	(だいぶ増えたので、現在の状態を保存しておこう)");
				memento = gamer.createMemento();
				saveMemento(memento);
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("	(だいぶ減ったので、以前の状態に復帰しよう)");
				gamer.restoreMemento(memento);
			}

			//	時間待ち
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println("");
		}
	}

	private static void saveMemento(Memento memento) {
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(FILENAME));
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
