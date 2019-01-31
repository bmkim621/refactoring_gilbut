package refactoring_gilbut.chap09;

import refactoring_gilbut.chap09.after.LoggerAfter;
import refactoring_gilbut.chap09.before.LoggerBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();	
		after();
		
	}

	private static void after() {
		LoggerAfter logger = new LoggerAfter();
		logger.log("information #1");
		
		logger.start();
		logger.log("information #2");
		
		logger.start();
		logger.log("information #3");
		
		logger.stop();
		logger.log("information #4");
		
		logger.stop();
		logger.log("information #5");
	}

	private static void before() {
		LoggerBefore logger = new LoggerBefore();
		logger.log("information #1");
		
		logger.start();
		logger.log("information #2");
		
		logger.start();
		logger.log("information #3");
		
		logger.stop();
		logger.log("information #4");
		
		logger.stop();
		logger.log("information #5");
	}

}
