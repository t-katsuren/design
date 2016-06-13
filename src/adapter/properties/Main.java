package adapter.properties;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		FileIO f = new FileProperties();

		try {

			f.readFromFile("C:\\pleiades\\Mars\\workspace\\design\\src\\adapter\\properties\\file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("C:\\pleiades\\Mars\\workspace\\design\\src\\adapter\\properties\\newfile.txt");

		} catch(IOException e) {

			e.printStackTrace();

		}

	}

}
