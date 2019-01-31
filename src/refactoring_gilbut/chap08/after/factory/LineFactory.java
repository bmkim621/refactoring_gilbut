package refactoring_gilbut.chap08.after.factory;

public class LineFactory extends ShapeFactory {
	//ΩÃ±€≈Ê ∆–≈œ
	private static final ShapeFactory instance = new LineFactory();	
	private LineFactory() {
		// TODO Auto-generated constructor stub
	}
	public static ShapeFactory getInstance() {
		return instance;
	}


	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		return new ShapeLine(startX, startY, endX, endY);
	}

}
