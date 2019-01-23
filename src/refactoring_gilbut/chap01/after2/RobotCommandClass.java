package refactoring_gilbut.chap01.after2;

public class RobotCommandClass {
	private final String name;	//로봇 이름
	
	public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
	
	public RobotCommandClass(String name) {
		this.name = name;
	}
	
	//메서드
	public void order(RobotCommand command) {
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
