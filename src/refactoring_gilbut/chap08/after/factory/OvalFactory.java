package refactoring_gilbut.chap08.after.factory;

public class OvalFactory extends ShapeFactory {
	//�̱��� ����
	private static final ShapeFactory instance = new OvalFactory();
	private OvalFactory() {
		// TODO Auto-generated constructor stub
	}
	public static ShapeFactory getInstance() {
		return instance;
	}


	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		return new ShapeOval(startX, startY, endX, endY);
	}

}
