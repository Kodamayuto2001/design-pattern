package singleton3;

public class Triple {

	private static Triple[] triples = createTriple();

	private Triple(int id) {
		System.out.println(id + "：インスタンスが作られました。");
	}


	public static Triple getInstance(int id) {
		return triples[id % 3];
	}

	private static Triple[] createTriple() {
		return new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
		};
	}
}
