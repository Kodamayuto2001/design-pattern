package singleton3;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");

		for (int i = 0; i < 1000000000; i++) {
			Triple obj = Triple.getInstance(i);
		}
		System.out.println("End.");
	}
}
