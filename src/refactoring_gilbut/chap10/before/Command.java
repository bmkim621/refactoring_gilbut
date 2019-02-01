package refactoring_gilbut.chap10.before;

import java.util.HashMap;
import java.util.Map;

public class Command {
	public static final Command FORWARD = new Command("Forward");
	public static final Command BACKWARD = new Command("Backward");
	public static final Command TURN_RIGHT = new Command("Right");
	public static final Command TURN_LEFT = new Command("Left");
	
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
	
	public static Command parseCommand(String name) {
		if(!commandNameMap.containsKey(name)) {
			return null;
		}
		return commandNameMap.get(name);
	}
}
