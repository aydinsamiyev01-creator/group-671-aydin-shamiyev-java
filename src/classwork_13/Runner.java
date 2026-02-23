package classwork_13;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выведите число!");
		int number = scanner.nextInt();
		
		if (number == 0) {
			System.out.println("Ноль");
		} else {
			System.out.println("Это не ноль!");
			if (number % 2 == 0) {
				System.out.println("Число четное !");
			} else {
				System.out.println("Число нечетное !");
			}
			//2
			System.out.println("Введите оценку (0-100) !");
            int bal = scanner.nextInt();
            if (bal <= 0) {
                System.out.println("Некорректный !");
            } else if (bal >= 90) {
                System.out.println("Отлично !");
            } else if (bal >= 75) {
                System.out.println("Хорошо !");
            } else if (bal >= 60) {
                System.out.println("Удовлитворительный !");
            } else {
                System.out.println("Неудволитворительное !");
            }

		}
	}


}
