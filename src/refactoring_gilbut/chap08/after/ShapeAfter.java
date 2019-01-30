package refactoring_gilbut.chap08.after;

public abstract class ShapeAfter {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	public ShapeAfter(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	public abstract int getTypeCode();
	
	public abstract String getName();

	@Override
	public String toString() {
		return String.format("[%-10s, (%3s, %3s) - (%3s, %3s)]", getName(), startX, startY, endX, endY);
	}
	
	public abstract void draw();
	
	//팩토리 메서드
	public static ShapeAfter createShape(int typeCode, int startX, int startY, int endX, int endY) throws IllegalAccessException {
		switch (typeCode) {
		
		case TYPECODE_LINE:
			return new ShapeLine(startX, startY, endX, endY);
			
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(startX, startY, endX, endY);
			
		case TYPECODE_OVAL:
			return new ShapeOval(startX, startY, endX, endY);
		
		default:
			throw new IllegalAccessException("typeCode = " + typeCode);
		}
	}
}
