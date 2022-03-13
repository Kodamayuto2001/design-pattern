package adapter3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2022");
			f.setValue("month", "3");
			f.setValue("day", "19");
			f.writeToFile("newFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
