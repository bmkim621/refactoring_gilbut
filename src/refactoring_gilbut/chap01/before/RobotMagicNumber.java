package refactoring_gilbut.chap01.before;

public class RobotMagicNumber {
	private final String name;	//�κ� �̸�

	public RobotMagicNumber(String name) {
		this.name = name;
	}
	
	//�޼���
	public void order(int command) {
		before(command);
	}

	private void before(int command) {
		if(command == 0) {
			System.out.println(name + " walks.");
		} else if(command == 1) {
			System.out.println(name + " stops.");
		} else if(command == 2) {
			System.out.println(name + " jumps.");
		} else {
			System.out.printf("Command error. command = %s%n", command);
		}
	}
}
