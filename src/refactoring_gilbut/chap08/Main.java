package refactoring_gilbut.chap08;

import java.util.Arrays;
import java.util.List;

import refactoring_gilbut.chap08.after.ShapeAfter;
import refactoring_gilbut.chap08.before.ShapeBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();
	}

	private static void after() {
		try {
			List<ShapeAfter> shapes = Arrays.asList(
					ShapeAfter.createShape(ShapeAfter.TYPECODE_LINE, 0, 0, 100, 200),
					ShapeAfter.createShape(ShapeAfter.TYPECODE_RECTANGLE, 10, 20, 30, 40),
					ShapeAfter.createShape(ShapeAfter.TYPECODE_OVAL, 100, 200, 300, 400)
					);
			
			for(ShapeAfter s : shapes) {
				s.draw();
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//before
	private static void before() {
		List<ShapeBefore> shapes = Arrays.asList(
				new ShapeBefore(ShapeBefore.TYPECODE_LINE, 0, 0, 100, 200),
				new ShapeBefore(ShapeBefore.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new ShapeBefore(ShapeBefore.TYPECODE_OVAL, 100, 200, 300, 400)
				);
		
		for(ShapeBefore s : shapes) {
			s.draw();
		}
	}

}
