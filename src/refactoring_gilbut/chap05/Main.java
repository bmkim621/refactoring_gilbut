package refactoring_gilbut.chap05;

import refactoring_gilbut.chap05.after.BannerAfter;
import refactoring_gilbut.chap05.before.BannerBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		
		BannerAfter hello = new BannerAfter("Hello, World!");
		hello.print(3);
	}

	private static void before() {
		BannerBefore hello = new BannerBefore("Hello, World!");
		hello.print(3);
	}

}
