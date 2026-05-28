package classwork_26;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		// 1
		Scanner scanner = new Scanner(System.in);
		Person person = new person();
		System.out.println("Введите возраст!");
		person.age = scanner.nextInt();
		if (person.age >= 18) {
			System.out.println("Доступ разрешен!");
		} else {
			System.out.println("Доступ запрещен!");
		}
		scanner.close();
		// 2
		int[] arr = { 2, 4, 6, 8, 10 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Сумма элементов массива: " + sum);
		// 3
		Book myBook = new Book();
		myBook.title = "Гарри Поттер";
		myBook.author = "Дж. К. Роулинг";
		myBook.year = 1997;

		System.out.println("Название: " + myBook.title + ", Автор: " + myBook.author + ", Год: " + myBook.year);
	}

}
