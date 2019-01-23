package refactoring_gilbut.chap01.after;

public class RobotSymbolicConstant {
	public static final int COMMAND_JUMP = 2;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_WALK = 0;
	private final String name;	//�κ� �̸�

	public RobotSymbolicConstant(String name) {
		this.name = name;
	}
	
	//�޼���
	public void order(int command) {
		if(command == COMMAND_WALK) {
			System.out.println(name + " walks.");
		} else if(command == COMMAND_STOP) {
			System.out.println(name + " stops.");
		} else if(command == COMMAND_JUMP) {
			System.out.println(name + " jumps.");
		} else {
			System.out.printf("Command error. command = %s%n", command);
		}
	}
}
