package refactoring_gilbut.chap10.after;

public class Direction {
	int x;
	int y;
	
	public Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setDirection(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("Direction(%s, %s)", x, y);
	}

	
}
