package abstractfactory.tablefactory;

import java.util.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<td>");
		builder.append("<table width=\"100%\" border=\"1\"><tr>");
		builder.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><br>");
		builder.append("</tr>\n");
		builder.append("<tr>");
		Iterator<?> it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			builder.append(item.makeHTML());
		}
		builder.append("</tr></table>");
		builder.append("</td>");
		return builder.toString();
	}

}
