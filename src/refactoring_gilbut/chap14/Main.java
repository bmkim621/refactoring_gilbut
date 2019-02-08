package refactoring_gilbut.chap14;

import java.util.Enumeration;

import refactoring_gilbut.chap14.after.AddressFileAfter;
import refactoring_gilbut.chap14.after2.AddressFileAfter2;
import refactoring_gilbut.chap14.before.AddressFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		before();	
		after();
		after2();
	}

	private static void after2() {
		try {
			AddressFileAfter2 file = new AddressFileAfter2("addressAfter2.txt");
			file.set("HongGilDong", "test@google.com");
			file.set("Han Ji Min", "hjm@naver.com");
			file.set("Kim Bo Min", "kim@hanmail.net");
			
			file.update();
			
			Enumeration<?> e = file.names();
			
			while(e.hasMoreElements()){
				String name = (String) e.nextElement();
				String mail = file.get(name);
				System.out.printf("name = %s, mail = %s%n", name, mail);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void after() {
		try {
			AddressFileAfter file = new AddressFileAfter("addressAfter.txt");
			file.set("HongGilDong", "test@google.com");
			file.set("Han Ji Min", "hjm@naver.com");
			file.set("Kim Bo Min", "kim@hanmail.net");
			
			file.update();
			
			Enumeration<?> e = file.names();
			while(e.hasMoreElements()){
				String name = (String) e.nextElement();
				String mail = file.get(name);
				System.out.printf("name = %s, mail = %s%n", name, mail);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void before() {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.getDatabase().set("HongGilDong", "test@google.com");
			file.getDatabase().set("Han Ji Min", "hjm@naver.com");
			file.getDatabase().set("Kim Bo Min", "kim@hanmail.net");
			
			file.getDatabase().update();
			
			Enumeration<?> e = file.names();
			
			while(e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String mail = file.getDatabase().get(name);
				System.out.printf("name = %s, mail = %s%n", name, mail);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
