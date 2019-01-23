package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.RobotSymbolicConstant;
import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.after3.Command;
import refactoring_gilbut.chap01.after3.RobotEnum;
import refactoring_gilbut.chap01.before.RobotMagicNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeMagicNumber();
		afterSymbolicConstant();	
		afterClass();
		afterEnum();
	}

	private static void afterEnum() {
		System.out.println("===== afterEnumMain() =====");
		
		RobotEnum robot = new RobotEnum("robo");
		robot.order(Command.WALK);
		robot.order(Command.STOP);
		robot.order(Command.JUMP);
	}

	private static void afterClass() {
		System.out.println("===== after2Main() =====");
		RobotCommandClass robot = new RobotCommandClass("robo");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	private static void afterSymbolicConstant() {
		System.out.println("===== afterMain() =====");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("robo");
		
		robot.order(RobotSymbolicConstant.COMMAND_WALK);	
		robot.order(RobotSymbolicConstant.COMMAND_STOP);	
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);
	}
	
	private static void beforeMagicNumber() {
		
		System.out.println("===== beforeMain() =====");
		RobotMagicNumber robot = new RobotMagicNumber("robo");
		
		robot.order(0);	//walk
		robot.order(1);	//stop
		robot.order(2);	//jump
		robot.order(3);	//command error
	}

}
