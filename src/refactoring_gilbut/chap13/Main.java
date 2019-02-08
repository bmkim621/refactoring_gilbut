package refactoring_gilbut.chap13;

import java.util.Arrays;
import java.util.List;

import refactoring_gilbut.chap13.after.DiceAfter;
import refactoring_gilbut.chap13.before.Dice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		before();
		List<DiceAfter> dices = Arrays.asList(
					new DiceAfter(),
					new DiceAfter(456L),
					new DiceAfter()
				);
		
		dices.get(2).setSeed(456L);
		
		for(DiceAfter da : dices) {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.printf("%d%s ", da.nextInt(), i < 9 ? "," : "");
			}
			System.out.println();
		}
	}

	private static void before() {
		List<Dice> dices = Arrays.asList(
					new Dice(),
					new Dice(456L),
					new Dice()
				);
		
		dices.get(2).setSeed(456L);
		
		for(Dice d : dices) {
			for(int i = 0 ; i < 10; i++) {
				System.out.printf("%d%s ", d.nextInt(), i < 9 ? "," : "");
			}
			System.out.println();
		}
	}

}
