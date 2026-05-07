import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {

	}

	// 1
	public static void task1() {
		System.out.println("Задание 1:");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			System.out.println("\n");
		}
	}

	// 2
	public static void task2() {
		System.out.println("Задание 2:");

		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println("\n");
	}

	// 3
	public static void task3() {
		System.out.println("Задание 3:");

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("Сумма = " + sum);
		System.out.println();
	}

	// 4
	public static void task4() {
		System.out.println("Задание 4:");

		for (int i = 1; i <= 10; i++) {
			System.out.println("7 x " + i + " = " + (7 * i));
		}

		System.out.println();
	}

	// 5
	public static void task5() {
		System.out.println("Задание 5:");

		int i = 10;

		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}

		System.out.println("\n");
	}

	// 6
	public static void task6() {
		System.out.println("Задание 6:");

		int number = 58342;
		int count = 0;

		while (number != 0) {
			number /= 10;
			count++;
		}

		System.out.println("Количество цифр: " + count);
		System.out.println();
	}

	// 7
	public static void task7() {
		System.out.println("Задание 7:");

		int number = 4567;
		int sum = 0;
		int temp = number;

		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}

		System.out.println("Сумма цифр = " + sum);
		System.out.println();

	}

	// 8. Меню программы
	public static void task8() {
		System.out.println("Задание 8:");

		int choice = 0;

		do {
			System.out.println("1. Начать игру");
			System.out.println("2. Настройки");
			System.out.println("3. Выйти");

			choice = 3; // Для примера сразу выходим

		} while (choice != 3);

		System.out.println();
	}

	// 9. Повтор ввода пароля
	public static void task9() {
		System.out.println("Задание 9:");

		Scanner scanner = new Scanner(System.in);

		String password;

		do {
			System.out.print("Введите пароль: ");
			password = scanner.nextLine();

		} while (!password.equals("java123"));

		System.out.println("Пароль верный!");
		System.out.println();
	}

	// 10. Пропустить числа
	public static void task10() {
		System.out.println("Задание 10:");

		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0) {
				continue;
			}

			System.out.print(i + " ");
		}

		System.out.println();
	}
}
