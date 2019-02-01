package refactoring_gilbut.chap10.after;

import java.util.StringTokenizer;

public class Robot {
	private final String name;
	private final Position position = new Position(0, 0);
	private final Direction direction = new Direction(0, 1);
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		
		try {
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			executeCommand(token);
			} 
		} catch (InvalidCommandException e) {
			// TODO Auto-generated catch block
			System.err.println("Invalid command : " + e.getMessage());
		}
	}
	
	public void executeCommand(String commandString) throws InvalidCommandException {
		Command command = Command.parseCommand(commandString);
		command.execute(this);
	}
	
	/*private boolean executeCommand(Command command) throws InvalidCommandException {
		if(command == Command.FORWARD) {
			position.relativeMove(direction.getX(), direction.getY());
		} else if (command == Command.BACKWARD) {
			position.relativeMove(-direction.getX(), -direction.getY());
		} else if (command == Command.TURN_RIGHT) {
			position.relativeMove(direction.getY(), -direction.getX());
		} else if (command == Command.TURN_LEFT) {
			position.relativeMove(-direction.getY(), direction.getX());
		} else {
			throw new InvalidCommandException();
		}
		return true;
	}*/
	
	private void executeCommand(Command command) throws InvalidCommandException{
		command.execute(this);
	}
	
	public void forward() {
		position.relativeMove(direction.getX(), direction.getY());
	}
	public void backward() {
		position.relativeMove(-direction.getX(), -direction.getY());
	}
	public void right() {
		position.relativeMove(direction.getY(), -direction.getX());
	}
	public void left() {
		position.relativeMove(-direction.getY(), direction.getX());
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", name, position, direction);
	}
	
	
}
