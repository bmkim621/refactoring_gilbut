package refactoring_gilbut.chap08.after.factory;

public class ShapeRectangle extends ShapeAfterFactory {

	public ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterFactory.TYPECODE_RECTANGLE;
	}
	
	@Override
	public String getName() {
		return "RECTANGLE";
	}
	
	@Override
	public void draw() {
		drawRectangle();
	}
	
	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}
}
