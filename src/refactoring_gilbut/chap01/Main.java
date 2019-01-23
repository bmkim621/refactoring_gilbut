package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.after3.RobotSymbolicConstant;
import refactoring_gilbut.chap01.before.RobotMagicNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();	
		
		System.out.println("===== after2Main() =====");
		RobotCommandClass robot = new RobotCommandClass("robo");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	private static void after() {
		System.out.println("===== afterMain() =====");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("robo");
		
		robot.order(RobotSymbolicConstant.COMMAND_WALK);	
		robot.order(RobotSymbolicConstant.COMMAND_STOP);	
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);
	}
	
	private static void before() {
		
		System.out.println("===== beforeMain() =====");
		RobotMagicNumber robot = new RobotMagicNumber("robo");
		
		robot.order(0);	//walk
		robot.order(1);	//stop
		robot.order(2);	//jump
		robot.order(3);	//command error
	}

}
