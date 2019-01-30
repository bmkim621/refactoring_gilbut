package refactoring_gilbut.chap07;

import refactoring_gilbut.chap07.after.ItemAfter;
import refactoring_gilbut.chap07.after.ItemType;
import refactoring_gilbut.chap07.before.ItemBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();	
		after();
			
	}

	private static void after() {
		ItemAfter book = new ItemAfter(ItemType.BOOK, "���� ����", 4800);
		ItemAfter dvd = new ItemAfter(ItemType.DVD, "������ �� Ư����", 3000);
		ItemAfter software = new ItemAfter(ItemType.SOFTWARE, "Ʃ�� �ӽ�", 3200);
		
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "software", software);
	}

	private static void before() {
		ItemBefore book = new ItemBefore(ItemBefore.TYPECODE_BOOK, "���� ����", 4800);
		ItemBefore dvd = new ItemBefore(ItemBefore.TYPECODE_DVD, "������ �� Ư����", 3000);
		ItemBefore software = new ItemBefore(ItemBefore.TYPECODE_SOFTWARE, "Ʃ�� �ӽ�", 3200);
		
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "software", software);
	}

}
