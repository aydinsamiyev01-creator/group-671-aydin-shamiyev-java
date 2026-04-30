
public class Rectangle {
	double width, height;

    public Rectangle(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void describe() {
        System.out.println("Ширина: " + width + ", Высота: " + height);
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0, 3.0);
        r.describe();
    }
}
