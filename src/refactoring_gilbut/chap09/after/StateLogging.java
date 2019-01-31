package refactoring_gilbut.chap09.after;

public class StateLogging extends State {

	private static final StateLogging instance = new StateLogging();
	
	public static StateLogging getInstance() {
		return instance;
	}

	@Override
	public void start(LoggerAfter logger) {
		// TODO Auto-generated method stub
		/* 아무 것도 하지 않음 */
	}

	@Override
	public void stop(LoggerAfter logger) {
		// TODO Auto-generated method stub
		System.out.println("*** STOP LOGGING ***");
		logger.setState(StateStopped.getInstance());
	}

	@Override
	public void log(String info) {
		// TODO Auto-generated method stub
		System.out.println("Logging: " + info);
	}

}
