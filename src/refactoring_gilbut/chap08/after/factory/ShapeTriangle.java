package refactoring_gilbut.chap08.after.factory;

public class ShapeTriangle extends ShapeAfterFactory {

	public ShapeTriangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getTypeCode() {
		return ShapeAfterFactory.TYPECODE_TRIANGLE;
	}

	@Override
	public String getName() {
		return "TRIANGLE";
	}
	
	@Override
	public void draw() {
		drawTriangle();
	}
	
	private void drawTriangle() {
		System.out.printf("%15s : %s%n", "drawTriangle", this.toString());
	}
}
