package refactoring_gilbut.chap09.after;

public class StateStopped extends State {
	private static final StateStopped instance = new StateStopped();
	
	public static StateStopped getInstance() {
		return instance;
	}

	@Override
	public void start(LoggerAfter logger) {
		// TODO Auto-generated method stub
		System.out.println("*** START LOGGING ***");
		logger.setState(StateLogging.getInstance());
	}

	@Override
	public void stop(LoggerAfter logger) {
		// TODO Auto-generated method stub
		/* 아무 것도 하지 않음 */
	}

	@Override
	public void log(String info) {
		// TODO Auto-generated method stub
		System.out.println("Ignoring : " + info);
	}

}
