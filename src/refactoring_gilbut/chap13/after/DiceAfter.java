package refactoring_gilbut.chap13.after;

import java.util.Random;

public class DiceAfter {
	private final Random random;

	public DiceAfter() {
		// TODO Auto-generated constructor stub
		random = new Random(314159L);
	}

	public DiceAfter(long seed) {
		random = new Random(seed);
	}

	public void setSeed(long seed) {
		random.setSeed(seed);
	}
	
	public int nextInt() {
		// TODO Auto-generated method stub
		return random.nextInt(6) + 1;
	}
	
	
}
