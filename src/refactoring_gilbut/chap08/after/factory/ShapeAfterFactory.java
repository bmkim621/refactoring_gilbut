package refactoring_gilbut.chap08.after.factory;

public abstract class ShapeAfterFactory {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	public static final int TYPECODE_TRIANGLE = 3;
	
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	public ShapeAfterFactory(int startX, int startY, int endX, int endY) {
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
	public static ShapeAfterFactory createShape(ShapeFactory factory, int startX, int startY, int endX, int endY){
		return factory.create(startX, startY, endX, endY);
	}
}
