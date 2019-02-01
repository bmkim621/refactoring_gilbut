package refactoring_gilbut.chap10.before;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot("robo");
		System.out.println(robot);
		
		robot.execute("Forward Right Forward");
		System.out.println(robot);
		
		robot.execute("Left Backward Left Forward");
		System.out.println(robot);
		
		robot.execute("Right Forward Forward Farvard");
		System.out.println(robot);
	}

}
