package abstractfactory.factory;

import java.lang.reflect.Constructor;

public abstract class Factory {

	@SuppressWarnings("deprecation")
	public static Factory oldgetFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch(ClassNotFoundException e) {
			System.err.println("クラス " + classname + " が見つかりません。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}

	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			Class<?> c = null;
			c = Class.forName(classname);
			Constructor<?> constructor = c.getDeclaredConstructor();
			factory = (Factory)constructor.newInstance();
		} catch(ClassNotFoundException e) {
			System.err.println("クラス " + classname + " が見つかりません。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	public final Page createYahooPage() {
		Link us_yahoo = createLink("Yahoo!", "http://www.yahoo.com/");
		Tray trayyahoo = createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		Page page = createPage("YahooPage", "Piyo Piyo");
		page.add(trayyahoo);
		return page;
	}

}
