package bridge3.implementation;

import java.io.FileReader;
import java.io.IOException;

public class TextFileDisplayImpl extends DisplayImpl {

	private String filename;
	private FileReader filereader;

	public TextFileDisplayImpl(String filename) {
		this.filename = filename;
	}

	@Override
	public void rawOpen() {
		try {
			filereader = new FileReader(filename);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawPrint() {
		int character;
		try {
			while((character = filereader.read()) != -1){
				System.out.print((char)character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		try {
			filereader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
