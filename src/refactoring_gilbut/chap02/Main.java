package refactoring_gilbut.chap02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring_gilbut.chap02.after_break.FindIntBreak;
import refactoring_gilbut.chap02.after_return.FindIntReturn;
import refactoring_gilbut.chap02.before.FindIntBefore;
import refactoring_gilbut.chap02.simpledatabase_after.SimpleDatabaseRename;
import refactoring_gilbut.chap02.simpledatabase_after_api.SimpleDatabaseApi;
import refactoring_gilbut.chap02.simpledatabase_after_reg.SimpleDatabaseReg;
import refactoring_gilbut.chap02.simpledatabase_before.SimpleDatabase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1, 9, 0, 2, 8, 5, 6, 3, 4, 7};
		
		before(data);
		
		after_break(data);
		after_return(data);
				
		before_simpledatabase();
		
		after_rename_simpledatabase();
		after_api_simpledatabase();
		
		after_reg_simpledatabase();
	}

	
	private static void after_reg_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			
			SimpleDatabaseReg db = new SimpleDatabaseReg(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	
	private static void after_api_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			
			SimpleDatabaseApi db = new SimpleDatabaseApi(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	
	private static void after_rename_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			
			SimpleDatabaseRename db = new SimpleDatabaseRename(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	
	private static void before_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			System.out.println("fileUrl : " + fileUrl);
			
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	
	private static void after_return(int[] data) {
		if(FindIntReturn.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found...");
		}
	}

	
	private static void after_break(int[] data) {
		if(FindIntBreak.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found...");
		}
	}

	
	private static void before(int[] data) {
		if(FindIntBefore.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found...");
		}
	}

}
