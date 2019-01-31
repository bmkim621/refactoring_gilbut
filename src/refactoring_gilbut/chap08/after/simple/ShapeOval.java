package refactoring_gilbut.chap08.after.simple;

public class ShapeOval extends ShapeAfterSimple {
	
	public static ShapeOval createShapeOval(int startX, int startY, int endX, int endY) {
		return new ShapeOval(startX, startY, endX, endY);
	}
	
	private ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterSimple.TYPECODE_OVAL;
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
