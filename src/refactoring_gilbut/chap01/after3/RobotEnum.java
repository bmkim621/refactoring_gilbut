package refactoring_gilbut.chap01.after3;

public class RobotEnum {
	private final String name;	//로봇 이름

	public RobotEnum(String name) {
		this.name = name;
	}
	
	//메서드
	public void order(Command command) {
		if(command == Command.WALK) {
			System.out.println(name + " walks.");
		} else if(command == Command.STOP) {
			System.out.println(name + " stops.");
		} else if(command == Command.JUMP) {
			System.out.println(name + " jumps.");
		} else {
			System.out.printf("Command error. command = %s%n", command);
		}
	}
}
