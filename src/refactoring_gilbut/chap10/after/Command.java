package refactoring_gilbut.chap10.after;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
	public static final Command FORWARD = new Forward();
	public static final Command BACKWARD = new Backward();
	public static final Command TURN_RIGHT = new Right();
	public static final Command TURN_LEFT = new Left();
	
	private static final Map<String, Command> commandNameMap = new HashMap<String, Command>();
	static {
		commandNameMap.put(FORWARD.name, FORWARD);
		commandNameMap.put(BACKWARD.name, BACKWARD);
		commandNameMap.put(TURN_RIGHT.name, TURN_RIGHT);
		commandNameMap.put(TURN_LEFT.name, TURN_LEFT);
	}
	
	private final String name;
	
	private Command(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static Command parseCommand(String name) throws InvalidCommandException {
		if(!commandNameMap.containsKey(name)) {
			throw new InvalidCommandException(name);
		}
		return commandNameMap.get(name);
	}
	
	public abstract void execute(Robot robot);
	
	//inner class
	private static class Forward extends Command{

		private Forward() {
			// TODO Auto-generated constructor stub
			super("Forward");
		}

		@Override
		public void execute(Robot robot) {
			// TODO Auto-generated method stub
			robot.forward();
		}	
	}
	
	//inner class
	private static class Backward extends Command{

		private Backward() {
			// TODO Auto-generated constructor stub
			super("Backward");
		}

		@Override
		public void execute(Robot robot) {
			// TODO Auto-generated method stub
			robot.backward();
		}	
	}
	
	//inner class
	private static class Right extends Command{

		private Right() {
			// TODO Auto-generated constructor stub
			super("Right");
		}

		@Override
		public void execute(Robot robot) {
			// TODO Auto-generated method stub
			robot.right();
		}	
	}
	
	//inner class
	private static class Left extends Command{

		private Left() {
			// TODO Auto-generated constructor stub
			super("Left");
		}

		@Override
		public void execute(Robot robot) {
			// TODO Auto-generated method stub
			robot.left();
		}	
	}
}
