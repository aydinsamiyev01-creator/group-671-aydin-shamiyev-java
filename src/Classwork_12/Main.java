package Classwork_12;

public class Main {
	public static void main(String[] args) {
		RobotCleaner robot = new RobotCleaner("Пылесосик");
		robot.start();
		robot.stop();
		robot.charge();
		robot.start();
	}

}
