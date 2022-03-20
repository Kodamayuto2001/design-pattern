package builder4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonBuilder extends Builder {

	private String filename;
	private PrintWriter writer;
	private boolean isbuildStringInit = false;

	@Override
	protected void buildTitle(String title) {
		filename = title + ".json";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("{");
		writer.println("\t\"" + "title" + "\" : " + "\"" + title + "\",");
		writer.println("\t\"" + "items" + "\" : [");
	}

	@Override
	protected void buildString(String str) {
		if (isbuildStringInit == false) {
			writer.println("\t\t{");
		} else {
			writer.println("\t\t,{");
		}
		isbuildStringInit = true;
		writer.println("\t\t\t\"" + "str" + "\" : " + "\"" + str + "\",");
	}

	@Override
	protected void buildItems(String[] items) {
		writer.println("\t\t\t\"" + "items" + "\" : [");
		for (int i = 0; i < items.length; i++) {
			writer.print("\t\t\t\t{\"" + "item" + "\" : " + "\"" + items[i] + "\"" + "}");
			if (i < items.length - 1) {
				writer.print(",");
			}
			writer.print("\n");
		}
		writer.println("\t\t\t]");
		writer.println("\t\t}");
	}

	@Override
	protected void buildclose() {
		writer.println("\t]");
		writer.println("}");
		writer.close();
	}

	public String getResult() {
		if (filename != null) {
			return filename;
		}
		return "[ファイル名がnullです。]";
	}

}
