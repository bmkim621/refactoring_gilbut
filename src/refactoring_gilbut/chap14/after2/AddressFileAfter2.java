package refactoring_gilbut.chap14.after2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

public class AddressFileAfter2 {
	
	private final DatabaseAfter2 database;

	public AddressFileAfter2(String filename) {
		database = new DatabaseAfter2(filename);
	}
	
	//
	public Enumeration<?> names(){
		return database.keys();
	}
	
	public void set(String key, String value) {
		database.set(key, value);
	}
	
	public String get(String key) {
		return database.get(key);
	}
	
	public void update() throws FileNotFoundException, IOException {
		database.update();
	}
	
}
