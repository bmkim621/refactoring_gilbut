package refactoring_gilbut.chap02.simpledatabase_after_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabaseApi {
	private Map<String, String> map = new HashMap<String, String>();
	
	public SimpleDatabaseApi(Reader r) throws IOException{
		BufferedReader reader = new BufferedReader(r);
		
		while(true) {
			String line = reader.readLine();
			if(line == null) {
				break;
			}
			int equalIndex = line.indexOf("=");
			if(equalIndex > 0) {
				String key = line.substring(0, equalIndex);
				String value = line.substring(equalIndex + 1, line.length());
				map.put(key, value);
			}
		} // end-while
	} //end constructor
	
	public void putValue(String key, String value) {
		map.put(key, value);
	}
	
	public String getValue(String key) {
		return map.get(key);
	}
	
	public Iterator<String> iterator(){
		return map.keySet().iterator();
	}
}
