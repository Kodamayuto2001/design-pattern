package adapter3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {

	private Properties p;
	private String comment = "";

	public FileProperties() {
		 p = new Properties();
		 comment = customizeHeader();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		p.load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		p.store(new FileOutputStream(filename), comment);
	}

	@Override
	public void setValue(String key, String value) {
		if (p == null) {
			return;
		}

		p.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		if (p == null) {
			return "";
		}

		return p.getProperty(key);
	}

	private String customizeHeader() {
		StringBuilder sb = new StringBuilder();

//		sb.append("#written by FileProperties");
//		sb.append("\n"+String.valueOf(LocalDateTime.now().getDayOfMonth()));
//		sb.append(" "+String.valueOf(LocalDateTime.now().getMonth().getValue()));
//		sb.append(" "+String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))));
//		sb.append(" JST");
//		sb.append(" "+String.valueOf(LocalDateTime.now().getYear()));
//		sb.append("\n");

		return sb.toString();
	}
}
