package builder2;

public interface Builder {
	public void makeTitle(String title);
	public void makeString(String str);
	public void makeItems(String[] items);
	public void close();
}
