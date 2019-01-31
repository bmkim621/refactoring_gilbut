package refactoring_gilbut.chap08.after.factory;

public class ShapeOval extends ShapeAfterFactory {

	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterFactory.TYPECODE_OVAL;
	}
	
	@Override
	public String getName() {
		return "OVAL";
	}
	
	@Override
	public void draw() {
		drawOval();
	}
	
	private void drawOval() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}
}
