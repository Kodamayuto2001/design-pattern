package abstractfactory.tablefactory;

import java.util.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<html><head><title>" + title + "</title></head>\n");
		builder.append("<body>\n");
		builder.append("<h1>" + title + "</h1>\n");
		builder.append("<table width=\"80%\" border\"3\">\n");
		Iterator<?> it = content.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			builder.append("<tr>" + item.makeHTML() + "</tr>");
		}
		builder.append("</table>\n");
		builder.append("<hr><address>" + author + "</address>");
		builder.append("</body></html>\n");
		return builder.toString();
	}

}
