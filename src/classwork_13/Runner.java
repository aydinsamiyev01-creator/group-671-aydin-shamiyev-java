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
            //3
            System.out.println("Введите сторону А");
            double a = scanner.nextDouble();
            System.out.println("Введите сторону B");
            double b = scanner.nextDouble();
            System.out.println("Введите сторону C");
            double c = scanner.nextDouble();
            if (a + b <= c || a + c <= b || b + c <= a) {
            	System.out.println("Треугольник не существует !");
            } else {
            	System.out.println("Треугольник существует !");
            }
            //4
            System.out.println("Выведите число !");
            int sum = scanner.nextInt();
            if (num >= 5000) {
            	System.out.println("Скидка 15%");
            } else if (num >= 2000) {
            	System.out.println("Скидка 10%");
            } else if (num >= 100) {
            	System.out.println("Скидка 5%");
            } else {
            	System.out.println("Нет скидки !");                
            }
            //5
            System.out.println("Введите высоту (3–20)");
            int h = scanner.nextInt();

            System.out.print("Введите ширину (3–20)");
            int w = scanner.nextInt();

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //6
            System.out.print("Введите число от 1 до 9: ");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 9) {
                System.out.println("Таблица умножения на " + number + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " × " + i + " = " + (number * i));
                }
            } else {
                System.out.println("Пожалуйста, введите число от 1 до 9.");
            }
            //7
            System.out.println("введите число n (1-1000");
            int n = scanner.nextInt();
            if (n >= 1 || n <= 1000) {
                int sum = 0;
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                        count++;
                    }
                }

                System.out.println("Сумма четных чисел" + sum);
                System.out.println("Колличество четных чисел" + count);
            } else {
                System.out.println("Число должно было быть от 1 до 1000 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            //8
            System.out.println()        }
        }
	}
