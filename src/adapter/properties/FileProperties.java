package adapter.properties;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	@Override
	public void readFromFile(String filename) throws IOException {

		load(new BufferedReader(new FileReader(filename)));

	}

	@Override
	public void writeToFile(String filename) throws IOException {

		store(new BufferedWriter(new FileWriter(filename)), "comments");

	}

	@Override
	public void setValue(String key, String value) {

		setProperty(key, value);

	}

	@Override
	public String getValue(String key) {

		return getProperty(key);

	}

}
