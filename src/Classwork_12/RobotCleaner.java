package Classwork_12;

public class RobotCleaner {
	String name;
	int battery;
	boolean isWorking;

	// конструктор
	public RobotCleaner(String name) {
		this.name = name;
		this.battery = 100;
		this.isWorking = false;
	}

	// методы
	public void start() {
		if (battery > 10) {
			isWorking = true;
			System.out.println("Я начал убирать!");

		} else {
			System.out.println("Слишком мало заряда для начало уборки!");

		}

	}
	public void stop() {
		isWorking = false;
		System.out.println("Уборка закончена");
	}
	public void charge() {
		battery = 100;
		System.out.println("Полная зарядка!");
	}

}
