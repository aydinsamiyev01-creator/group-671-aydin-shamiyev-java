package classwork_24;

public class Rectangle {
	// 1. Два поля типа double
	double width;
	double height;

	// 2. Конструктор с двумя параметрами
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 3. Метод area() — возвращает площадь
	public double area() {
		return width * height;
	}

	// 4. Метод perimeter() — возвращает периметр
	public double perimeter() {
		return 2 * (width + height);
	}

	// 5. Метод isSquare() — возвращает true, если это квадрат
	public boolean isSquare() {
		return width == height;
	}
}
