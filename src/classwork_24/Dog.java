package classwork_24;

public class Dog {
	// 1. Создаем три поля класса
	String name;
	String breed;
	int age;

	// 2 Конструктор, принимающий все три параметра
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// 3. Метод bark() — собака лает
	public void bark() {
		System.out.println(name + " говорит: Гав!");
	}

	// 4. Метод introduce() — выводит всю информацию о собаке
	public void introduce() {
		System.out.println("Имя: " + name + ", Порода: " + breed + ", Возраст: " + age + " лет/года");
	}
}
