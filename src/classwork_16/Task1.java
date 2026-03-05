package classwork_16;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два числа");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		if (b == 0) {
			System.out.println("На ноль делить нельзя");
		} else {
			System.out.println(a + "/" + b + "=" + ((double)a / b));
		}
	}

}
