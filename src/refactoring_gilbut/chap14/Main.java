package refactoring_gilbut.chap14;

import java.util.Enumeration;

import refactoring_gilbut.chap14.before.AddressFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
