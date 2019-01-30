package refactoring_gilbut.chap08.after;

public class ShapeOval extends ShapeAfter {

	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfter.TYPECODE_OVAL;
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
