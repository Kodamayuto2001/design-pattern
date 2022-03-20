package builder4;

public abstract class Builder {

	private boolean initialized = false;

	public final void makeTitle(String title) {
		if (!initialized) {
			initialized = true;
			buildTitle(title);
		}
	}

	public final void makeString(String str) {
		if (initialized) {
			buildString(str);
		}
	}

	public final void makeItems(String[] items) {
		if (initialized) {
			buildItems(items);
		}
	}

	public final void close() {
		if (initialized) {
			buildclose();
		}
	}

	protected abstract void buildTitle(String title);
	protected abstract void buildString(String str);
	protected abstract void buildItems(String[] items);
	protected abstract void buildclose();

}
