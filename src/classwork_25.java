import java.util.Arrays;

public class classwork_25 {
	public static void main(String[] args) {
		// 1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			// 2
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i * j + "\t");

					System.out.println();
					// 3
					int sum = 0;
					int i = 1;

					while (i <= 100) {
						sum += i;
						i++;
						// 4
						int num1 = 1;
						int num2 = 1;

						System.out.print(num1 + " " + num2 + " ");
						for (int i = 3; i <= 15; i++) {
							int next = num1 + num2;
							System.out.print(next + " ");
							num1 = num2;
							num2 = next;
							// 5
							int count = 10;

							do {
								System.out.println(count);
								count--;
							} while (count >= 1);

							System.out.println("Старт!");
							// 6
							int height = 5;

							for (int i = 1; i <= height; i++) {
								for (int j = 1; j <= i; j++) {
									System.out.print("*");
								}
								System.out.println();
								// 7
								for (int i = 1; i <= 30; i++) {
									if (i % 2 != 0) {
										continue;
									}
									System.out.print(i + " ");
									// 8
									int[] original = { 10, 20, 30, 40, 50, 60 };
									int[] reversed = new int[original.length];

									for (int i = 0; i < original.length; i++) {
										reversed[i] = original[original.length - 1 - i];
									}

									System.out.println("Оригинальный массив: " + Arrays.toString(original));
									System.out.println("Перевернутый массив:  " + Arrays.toString(reversed));
									// 9
									Scanner scanner = new Scanner(System.in);
									System.out.print("Введите число: ");
									int number = scanner.nextInt();
									if (number % 2 == 0) {
										System.out.println("Число чётное");
									} else {
										System.out.println("Число нечётное");
										// 10
										Scanner scanner = new Scanner(System.in);
										System.out.println("Введите три числа:");
										int a = scanner.nextInt();
										int b = scanner.nextInt();
										int c = scanner.nextInt();

										int max;

										if (a >= b && a >= c) {
											max = a;
										} else if (b >= a && b >= c) {
											max = b;
										} else {
											max = c;
										}

										System.out.println("Наибольшее число: " + max);
										// 11
										Scanner scanner = new Scanner(System.in);
										System.out.print("Введите балл (0-100): ");
										int score = scanner.nextInt();

										if (score < 0 || score > 100) {
											System.out.println("Некорректный балл!");
										} else if (score >= 90) {
											System.out.println("Отлично");
										} else if (score >= 70) {
											System.out.println("Хорошо");
										} else if (score >= 50) {
											System.out.println("Удовлетворительно");
										} else {
											System.out.println("Неудовлетворительно");
											// 12
											Scanner scanner = new Scanner(System.in);

											System.out.print("Введите первое число: ");
											double num1 = scanner.nextDouble();
											System.out.print("Введите операцию (+, -, *, /): ");
											char operation = scanner.next().charAt(0);
											System.out.print("Введите второе число: ");
											double num2 = scanner.nextDouble();

											switch (operation) {
											case '+':
												System.out.println("Результат: " + (num1 + num2));
												break;
											case '-':
												System.out.println("Результат: " + (num1 - num2));
												break;
											case '*':
												System.out.println("Результат: " + (num1 * num2));
												break;
											case '/':
												if (num2 == 0) {
													System.out.println("Ошибка: Деление на ноль невозможно!");
												} else {
													System.out.println("Результат: " + (num1 / num2));
												}
												break;
											default:
												System.out.println("Ошибка: Неверная операция!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
