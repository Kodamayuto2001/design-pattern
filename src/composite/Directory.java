package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

	private String name;
	@SuppressWarnings("rawtypes")
	private ArrayList directory = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<?> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			size += entry.getSize();
		}
		return size;
	}

	@SuppressWarnings("unchecked")
	public Entry add(Entry entry) {
		directory.add(entry);
		entry.parent = this;
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<?> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.printList(prefix + "/" + name);
		}
	}

}
