package refactoring_gilbut.chap08.after.factory;

public class ShapeLine extends ShapeAfterFactory {

	public ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getTypeCode() {
		return ShapeAfterFactory.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		return "LINE";
	}
	
	@Override
	public void draw() {
		drawLine();
	}
	
	private void drawLine() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());
	}
}
