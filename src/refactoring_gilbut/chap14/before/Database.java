package refactoring_gilbut.chap14.before;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Database {
	private final Properties properties;
	private final String filename;
	
	public Database(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
		properties = new Properties();
		
		try (InputStream is = new FileInputStream(filename)) {
			properties.load(is);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void set(String key, String value) {
		properties.setProperty(key, value);
	}
	
	public String get(String key) {
		return properties.getProperty(key, null);
	}
	
	public void update() throws FileNotFoundException, IOException {
		properties.store(new FileOutputStream(filename), "");
	}
	
	public Properties getProperties() {
		return properties;
	}
}
