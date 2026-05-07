package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		int number = -7;

		if (number > 0) {
			System.out.println("Число положительное");
		} else if (number < 0) {
			System.out.println("Число отрицательное");
		} else {
			System.out.println("Число равно нулю");
		}
	}
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
