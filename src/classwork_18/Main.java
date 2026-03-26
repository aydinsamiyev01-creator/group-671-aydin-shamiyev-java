package classwork_18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1
		double num = sc.nextDouble();
		if (num > 0) {
			System.out.println("Положительное");
		} else {
			System.out.println("Отрицательное или ноль");
		}

		// 2
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Четное");
		} else {
			System.out.println("Нечетное");
		}

		// 3
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a < b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		// 4
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("Несовершеннолетний");
		} else {
			System.out.println("Совершеннолетний");
		}

		// 5
		int score = sc.nextInt();
		if (score >= 90 == score <= 100) {
			System.out.println("Отлично");
		} else if (score >= 70) {
			System.out.println("Хорошо");
		} else if (score >= 50) {
			System.out.println("Удовлетворительно");
		} else {
			System.out.println("Не сдал");
		}

		// 6
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		double max = x;
		if (y > max)
			max = y;
		if (z > max)
			max = z;

		System.out.println("Максимум: " + max);

		// 7
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Високосный год");
		} else {
			System.out.println("Обычный год");
		}

		// 8
		String password = sc.next();
		if (password.equals("12345")) {
			System.out.println("Доступ разрешен");
		} else {
			System.out.println("Неверный пароль");
		}

		// 9
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		String op = sc.next();

		if (op.equals("+")) {
			System.out.println(num1 + num2);
		} else if (op.equals("-")) {
			System.out.println(num1 - num2);
		} else if (op.equals("*")) {
			System.out.println(num1 * num2);
		} else if (op.equals("/")) {
			if (num2 != 0) {
				System.out.println(num1 / num2);
			} else {
				System.out.println("Деление на ноль!");
			}
		} else {
			System.out.println("Неизвестная операция");
		}

		// 10
		double amount = sc.nextDouble();

		if (amount > 1000) {
			amount *= 0.9;
		} else if (amount > 500) {
			amount *= 0.95;
		}

		System.out.println("Итог: " + amount);

		sc.close();
	}
}
