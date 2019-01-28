package refactoring_gilbut.chap02.simpledatabase_after_reg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabaseReg {
	private Map<String, String> map = new HashMap<String, String>();
	
	//정규표현식
	private static Pattern pattern = Pattern.compile("([^=]+)=(.*)");
	
	public SimpleDatabaseReg(Reader r) throws IOException{
		BufferedReader reader = new BufferedReader(r);
		String line;
		
		while( (line = reader.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);
			
			if(matcher.matches()) {
				String key = matcher.group(1);
				String value = matcher.group(2);
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
