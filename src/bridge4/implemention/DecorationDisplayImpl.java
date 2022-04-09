package bridge4.implemention;

public class DecorationDisplayImpl extends DisplayImpl {

	private String startStr;
	private String endStr;
	private String bodyStr;

	public DecorationDisplayImpl(String startStr, String endStr, String bodyStr) {
		this.startStr = startStr;
		this.endStr = endStr;
		this.bodyStr = bodyStr;
	}

	@Override
	public void rawOpen() {
		System.out.print(startStr);
	}

	@Override
	public void rawPrint() {
		System.out.print(bodyStr);
	}

	@Override
	public void rawClose() {
		System.out.print(endStr);
		System.out.print("\n");
	}

}
