package decorator3;

import java.util.ArrayList;

import decorator.Display;

public class MultiStringDisplay extends Display {

	private ArrayList<String> strList = new ArrayList<String>();

	private int strMaxSize = 0;

	public void add(String str) {
		strList.add(str);
		strMaxSize = strMaxSize <= str.getBytes().length ? str.getBytes().length : strMaxSize;
	}

	@Override
	public int getColumns() {
		return strMaxSize;
	}

	@Override
	public int getRows() {
		updateList();
		return strList.size();
	}

	@Override
	public String getRowText(int row) {
		try {
			return strList.get(row);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void updateList() {
		String formatter = "%-" + Integer.valueOf(strMaxSize).toString() + "s";
		for (int i = 0; i < strList.size(); i++) {
			strList.set(i, String.format(formatter, strList.get(i)));
		}
	}

}
